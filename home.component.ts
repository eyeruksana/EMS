import { Component, OnInit } from '@angular/core';
import { EmpService } from '../employee/EmpService';
import { IEmployee } from '../employee/employee';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  employee:IEmployee[];

  constructor(private service:EmpService,private router:Router) { }

  ngOnInit(): void {
  }

  getEmployeeData(){
    this.service.getEmployees().subscribe(empData => {this.employee=empData; console.log("data:" +this.employee)});

  }
  Logout(){
    this.router.navigate(["/login"])
  }

}
