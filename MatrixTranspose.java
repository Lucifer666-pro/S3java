/**the java program to display the transpose of a given matrix.
  *@author: Ajith R B
  *date:  09-10-2020
*/
package Javapack;   
import java.util.Scanner;
public class MatrixTranspose
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
System.out.println("Enter the number of rows in the 2D matrix:");
int noOfRows = s.nextInt( );
System.out.println("Enter the number of columns in the 2D matrix:");
int noOfcolumns = s.nextInt( );
int [ ][ ]matrix = new int[noOfRows][noOfcolumns];
System.out.println("Enter the elements");
for(int i=0;i<noOfRows;i++)
{
for(int j=0;j<noOfcolumns;j++)
{
matrix[i][j] = s.nextInt();
} 
} 


System.out.println("The matrix is:");
for(int i=0;i<noOfRows;i++)
{
for(int j=0;j<noOfcolumns;j++)
{
System.out.print(matrix[i][j]+"\t");
} 
System.out.println();
} 
int [ ][ ]Tmatrix = new int[noOfcolumns][noOfRows];
for(int i=0;i<noOfcolumns;i++) {
for(int j=0;j<noOfRows;j++) {
Tmatrix[i][j] = matrix[j][i];
}
}

System.out.println("The Transpose of the given matrix is:");
for(int i=0;i<noOfcolumns;i++) {
for(int j=0;j<noOfRows;j++) {
System.out.print(Tmatrix[i][j]+"\t");
}
System.out.println( );
}
}
}


