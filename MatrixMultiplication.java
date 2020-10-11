/**the java program to multiply of two given matrices.
  *@author: Ajith R B
  *date:  09-10-2020
*/
package Javapack;   
import java.util.Scanner;
public class MatrixMultiplication
{
public static void main(String[ ] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the rows and columns of the matrix-A:");
int rowsOfA = sc.nextInt( );
int columnsOfA = sc.nextInt( );
int[ ][ ] matrixA = new int[rowsOfA][columnsOfA];


System.out.println("Enter the rows and columns of the matrix-B:");
int rowsOfB = sc.nextInt( );
int columnsOfB = sc.nextInt( );
int[ ][ ] matrixB = new int[rowsOfB][columnsOfB];



if(columnsOfA==rowsOfB)
{
System.out.println("Matrices can be multiplied");
System.out.println("Resultant Matrix is"+rowsOfA+" by " +columnsOfB);




System.out.println("\n Enter elements of matrix-A row wise:\n");
for(int i=0;i<rowsOfA;i++)
{
for(int j=0;j<columnsOfA;j++)
{
int p=i+1,q=j+1;
System.out.println("Enter A[ "+p +"] [ "+q +"]");
matrixA[i][j]=sc.nextInt( );
}
}


System.out.println("\n Enter elements of matrix-B row wise:\n");
for(int i=0;i<rowsOfB;i++)
{
for(int j=0;j<columnsOfB;j++)
{
int n=i+1,m=j+1;
System.out.println("Enter B[ "+ n +"] [ "+m +"]");
matrixB[i][j]=sc.nextInt( );
}
}



System.out.println("\n\t Matrix-A");
System.out.println("\n\t.................\n\t");
for(int i=0;i<rowsOfA;i++)
{
for(int j=0;j<columnsOfA;j++)
{
System.out.print(matrixA[i][j] +" ");
}
System.out.println( );
}



System.out.println("\n\t Matrix-B");
System.out.println("\n\t.................\n\t");
for(int i=0;i<rowsOfB;i++)
{
for(int j=0;j<columnsOfB;j++)
{
System.out.print(matrixB[i][j]+" ");
}
System.out.println( );
}



int[ ][ ] matrixC = new int[rowsOfA][columnsOfB];

System.out.println("\n\t Matrix-C");
System.out.println("\n\t.....................\n\t");

for(int i=0;i<rowsOfA;i++)
{
for(int j=0;j<columnsOfB;j++)
{
matrixC[i][j]=0;
for(int k=0;k<columnsOfA;k++){

matrixC[i][j]=matrixC[i][j]+matrixA[i][k]*matrixB[k][j];
System.out.print(matrixC[i][j] +" ");
}
System.out.println( );
}
}
}
 
else
{
System.out.println("\n Columns of matrix-A must be equal to rows of matrix-B \n");
System.out.println("\n Matrices cannot be multiplied \n");
}

 
} 
}