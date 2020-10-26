/**
* The java program to determine whether a matrix is symmetric or not.
*@author Ajith R B
*23-10-2020
*/
package Javapack;
import java.util.Scanner;
public class Sym{
public static void main(String arr[])
{
Scanner s=new  Scanner(System.in);
System.out .println("Enter the order of the matrix_A:");
int n=s.nextInt();
int [][] A=new int[20][20];
System.out .println("Enter  elements of the matrix-A:");
for(int i=0;i<n;i++)
{for(int j=0;j<n;j++){
A[i][j]=s.nextInt();
}
}
int [][] B=new int[20][20];
System.out .println("TRANSPOSE ");
for(int i=0;i<n;i++)
{for(int j=0;j<n;j++)
{
B[i][j]=A[j][i];
System.out.print(B[i][j]+"\t");
}
System.out.println("\n");
}

int flag=1;
for(int i=0;i<n;i++)
{for(int j=0;j<n;j++){

if(B[i][j]!=A[i][j])
flag=0;
break;
}
}
if(flag==0)
{
System.out .println("it is not Symmetric matrix:");

}
else
{
System.out .println("it is  Symmetric matrix:");

}

}
}