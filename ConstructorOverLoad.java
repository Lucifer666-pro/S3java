/** 
  *This the java program to print the student details using the concept of the constructor overloading.
  *@author :Ajith R B
  *16-06-2020
*/
package Javapack;
class student 
{
int rollNumber;
String name;
String department;

student()
{
this.department="CSE";
}
student (int rollNumber,String name){
this.rollNumber=rollNumber;
this.name=name;
department="CSE";
}
student (int rollNumber,String name,String department){
this.rollNumber=rollNumber;
this.name=name;
this.department= department;
}
}

public class ConstructorOverLoad{
public static void main(String arr[])
{

student s= new student();
System.out.println("Student 1 details");
System.out.println("Department :"+s.department);



student j= new student(12,"Robin Sharma");
System.out.println("Student 2 details");
System.out.println("Roll Number :"+j.rollNumber);
System.out.println("Name :"+j.name);

student k= new student(13,"Praveen","ME");
System.out.println("Student 3 details");
System.out.println("Roll Number :"+j.rollNumber);
System.out.println("Name :"+k.name);
System.out.println("Department :"+k.department);
System.out.println();
}
}




