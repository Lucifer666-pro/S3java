/** The java program to display largest ,smallest,secound smallest,secound largest number using class and objects.
  *@author Ajith R B
  *21-10-2020
*/
package Javapack;
import java.util.Scanner;
import java.io.*;

public class Emps
{
public Emps(String [] name,int [] Age,double []salary,int n)//constructor
{
name=name;
Age=Age;
salary=salary;
n=n;
for(int j=0;j<n;j++)
{
System.out.println(" Employee"+(j+1));
System.out.println("Name :"+name[j]);
System.out.println("Age:"+Age[j]);
System.out.println("Salary:"+salary[j]);
}
}
public static void main(String arr[])
{
Scanner s= new Scanner(System.in);
int n;
System.out.println("Enter the number of Employeees:");
n=s.nextInt();
String []name=new String[50];
int []Age=new int[50];
double []salary=new double[50];
for(int i=0;i<n;i++)
{
System.out.println("Details of Employee"+(i+1));
System.out.println("Enter name:");
name[i]=s.next();
System.out.println("Enter Age:");
Age[i]=s.nextInt();
System.out.println("Enter salary:");
salary[i]=s.nextDouble();
}
System.out.println("");
Emps a=new Emps(name,Age,salary,n);
}
}