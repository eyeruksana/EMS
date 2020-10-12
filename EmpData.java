package com.ruksana.app.model;

public class EmpData {

	private String empID;
	    private String fullname;
	    private String	age;
	    private String city;
	    private String designation;
	    private String rating;
	    
	    
		public EmpData(String empID, String fullname, String age, String city, String designation, String rating) {
			super();
			this.empID = empID;
			this.fullname = fullname;
			this.age = age;
			this.city = city;
			this.designation = designation;
			this.rating = rating;
		}
		public EmpData() {
			// TODO Auto-generated constructor stub
		}
		public String getEmpID() {
			return empID;
		}
		public void setEmpID(String empID) {
			this.empID = empID;
		}
		public String getFullname() {
			return fullname;
		}
		public void setFullname(String fullname) {
			this.fullname = fullname;
		}
		public String getAge() {
			return age;
		}
		public void setAge(String age) {
			this.age = age;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		public String getRating() {
			return rating;
		}
		public void setRating(String rating) {
			this.rating = rating;
		}
	
	
	

}
