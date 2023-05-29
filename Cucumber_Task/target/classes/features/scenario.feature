Feature: testsecnariofiles
@testscenario	
Scenario Outline: validating data
Given Launch the browser "<EmpName>"
Then employe grossSalary"<GrossSalary>"
And employe pf "<PF>" and Income tax "<IncomeTax>"
And employe profissionaltax "<PF Tax>"
And employe netsalary"<Netsalary>"
Then close the data alzlizing 

Examples: 
|EmpName	|GrossSalary			|PF								|IncomeTax						|PF Tax				|Netsalary	|
|Ramesh		 	|35000							|3500						|1000										|500						|40000			|
|Raju				 	|42000							|5000						|2000										|1000					|50000			|
|Sai							|55000							|5700						|3000										|1300					|65000			|
|Prudvi				|68000							|7000						|3500										|1500					|80000			|