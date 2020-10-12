import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs/';
import { EmpService } from '../employee/EmpService';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  username: string;
  password: string;
  message: any

  constructor(private service: EmpService,private router:Router) { }

  ngOnInit() {
  }

  doLogin() {
    let resp = this.service.login(this.username, this.password);
    resp.subscribe(data => { this.message = data;
      this.router.navigate(["/home"])
    });
  }
}