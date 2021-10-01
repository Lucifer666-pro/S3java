/** The java program to display  fibonacci series using for loop.
  *@author Ajith R B
  *21-10-2020
*/
package Javapack;
import java.util.Scanner;

public class fibonacci{

public static void main(String arr[])
{
int num,i,g=0,k=1,m=l;
Scanner s=new Scanner(System.in);
 
System.out.print("Fibonacci");
System.out.println("Enter a number :");
num=s.nextInt();
System.out.println("The fibonacci series of "+num+" is :");
for(i=0;i<num;i++)
{System.out.print(g+"\t");
l=g+k;
g=k;
k=l;
m=0;

}
 System.out.println("Result:The program has been executed successfully");
}
}
