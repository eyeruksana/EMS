import { Component, OnInit } from '@angular/core';
import { EmpService } from '../employee/EmpService';
import { IEmployeeList } from '../employee/employeeList';
import { ActivatedRoute } from '@angular/router';



 


@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {
 employees:any;

  constructor(private empservice:EmpService,private route:ActivatedRoute) { }

  ngOnInit(){

    let empCode:String =this.route.snapshot.params['empID'];
    this.empservice.getEmployeeByID(empCode).subscribe(empData => {this.employees=empData; console.log("data:" +this.employees)});
   
   //this.empservice.getEmployees().subscribe(empData => {this.employees=empData; console.log("data:" +this.employees)});
  }
  getEmployeeByID(){

   // let empCode:String =this.route.snapshot.params['/empID'];
   // this.empservice.getEmployeeByID(empCode).subscribe(empData => {this.employees=empData; console.log("data:" +this.employees)});
   // let empCode: this.activatedRoute.snapshot.params['empID'];
   // this.empservice.getEmployeeByID(empID).subscribe(empData => {this.employees=empData; console.log("data:" +this.employees)});
  }
  

}

