/** 
  *This the java program to print the employee details using the concept of constructor.
  *@author :Ajith R B
  *16-06-2020
*/
package Javapack;
import java.io.*;
class Employee
{
String name;
int age;
String designation;
double salary;

public Employee(String name)
{
this.name=name;
}

public void empAge(int empAge)
{
age=empAge;
}

public void empDesignation(String empDesignation)
{
designation=empDesignation;
}

public void empSalary(double empSalary)
{
salary=empSalary;
}



public void printEmploy()      
{
System.out.println("Name:"+ name);
System.out.println(" Age:"+ age);
System.out.println("Designation:"+ designation);
System.out.println("Salary:"+ salary);
}

}

public class EmployeeTest{             
public static void main(String arr[])
{
Employee e=new Employee("James Smith");  
Employee f=new Employee("Marry Anne");

e.empAge(26);    
e.empDesignation("Senior Software Engineer");
e.empSalary(1000);
e.printEmploy();

f.empAge(21);
f.empDesignation("Software Engineer");
f.empSalary(500);
f.printEmploy();
}
}