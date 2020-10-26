/** 
  *This the java program to calculate the factorial of the number using recursion.
  *@author :Ajith R B
  *16-06-2020
*/
package Javapack;
import java.util.Scanner;

public class Recursion
{
static int fact(int n)
{
if (n==1)
{
return 1;
}
else
{
return n*fact(n-1);
}

}
public static void main(String arr[])
{
int  num;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number:");
num=s.nextInt();
System.out.println("The factorial of "+num+" is :"+fact(num));
}

}