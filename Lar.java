/** The java program to display largest ,smallest,secound smallest,secound largest number using class and objects.
  *@author Ajith R B
  *21-10-2020
*/
package Javapack;
import java.util.Scanner;
import java.util.Arrays;
 class A{
void sorting(int [] h,int po){    //sorting function
 Arrays.sort(h);
for(int j=0;j<po;j++){
if(j==0)
{System.out.println("Smallest number:"+h[j]);
}
else
if(j==1)
{System.out.println("2rd smallest number:"+h[j]);
}
else
if(j==po-2)
{System.out.println("2rd Largest number:"+h[j]);
}
else
if(j==po-1)
{System.out.println(" Largest number:"+h[j]);
}
else
System.out.print("");
}

}
}

public class Lar{
public static void main(String arr[])
{
int limit;
Scanner s=new Scanner (System.in);
A a=new A();
System.out.println("Enter the limit:");
limit=s.nextInt();
System.out.println("Enter the "+limit+" numbers :\n");
int array[]=new int[limit];//array
for(int i=0;i<limit;i++)
{array[i]=s.nextInt();
}

int po=limit;
a.sorting(array,po);



}
}

