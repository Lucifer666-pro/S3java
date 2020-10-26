/** The java program to calculate the sum of n numbers using recursion
  *@author Ajith R B
  *21-10-2020
*/
package Javapack;
import java.util.Scanner;
public class RecSum{
static int sum(int n)
{
if(n==1)
return 1;
else
return n+sum(n-1);
}
public static void main(String arr[])
{
int num;
Scanner s=new Scanner(System.in);
System.out.println("Sum of number");
System.out.println("Enter the number:");
num=s.nextInt();
System.out.println("The sum of "+num+" is:"+sum(num));
}
}