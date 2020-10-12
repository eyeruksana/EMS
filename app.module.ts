import { BrowserModule } from '@angular/platform-browser';
import { NgModule, Component } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { HttpModule } from '@angular/http';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EmployeeComponent } from './employee/employee.component';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import { HomeComponent } from './home/home.component';
import { Routes,RouterModule } from '@angular/router';
import {EmpService} from './employee/EmpService';
import { LoginComponent } from './login/login.component';


const appRoutes:Routes =[
 
  {path: 'home' , component:HomeComponent},
  {path: 'employee/:empID' , component:EmployeeListComponent},
  {path: 'login' , component:LoginComponent},
  {path:'',redirectTo:"login",pathMatch:'full'}
  
]
@NgModule({
  declarations: [
    AppComponent,
    EmployeeComponent,
    EmployeeListComponent,
    HomeComponent,
    LoginComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,FormsModule,HttpModule,HttpClientModule,RouterModule.forRoot(appRoutes)
  ],
  providers: [EmpService],
  bootstrap: [AppComponent]
})
export class AppModule { }
