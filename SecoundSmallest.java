/**the java program to find the secound smallest element in an array.
  *@author: Ajith R B
  *date:  09-10-2020
*/
package Javapack;
import java.util.Scanner;
public class SecoundSmallest{
public static void main(String arr[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the number of element  in the integer array:");
int noOfElement=s.nextInt();
int [] array=new int [noOfElement];
System.out.println("Enter the "+noOfElement+" elements:");
for(int i=0; i < noOfElement; i++)
{
array[i] = s.nextInt();
}
int largest =array[0];
int secondLargest = array[0];
for (int i = 0; i < array.length; i++)
{
if (array[i] > largest)
{
secondLargest = largest;
largest = array[i];
}
else if (array[i] > secondLargest)
{
secondLargest = array[i];
}
}
System.out.println("\nSecound largest number is:"+secondLargest);
s.close();
}
}



