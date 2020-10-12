package com.ruksana.app.configs;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SpringSecurityConfig  extends WebSecurityConfigurerAdapter{

	@Autowired
    private DataSource ds;
	
	@Bean
	@ConfigurationProperties("spring.datasource")
	public DataSource ds() {
		return DataSourceBuilder.create().build();
	}
	
	
	/* Spring Security Configurations Start */
	
    @Autowired
    public void configureAMBuilder(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication().dataSource(ds)
            .authoritiesByUsernameQuery("select email, role FROM EMPLOGIN where email=?")
            .usersByUsernameQuery("select email,userPassword, 1 FROM EMPLOGIN where email=?");
    }
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
        
                
                .httpBasic()
                .and()
                .authorizeRequests()  
                .antMatchers("/**").permitAll()
                .anyRequest().authenticated();
        http.csrf().disable();
        http.cors();
    }
    
	/* Spring Security Configurations End */
}