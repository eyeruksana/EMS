import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {
  firstName: string = 'Tom';
    lastName: string = 'Hopkins';
    gender: string = 'Male';
    age: number = 20;
    

    isDisabled:Boolean=false;

    ShowDetails:Boolean=true;
    name:String='Tom';
  constructor() { }

  ngOnInit(): void {
  }
  


}
