/**the java program to reverse an given string.
  *@author: Ajith R B
  *date:  09-10-2020
*/
package Javapack;   
import java.util.Scanner;
public class RevString
{
public static void main(String[ ] args)
{
String str, reverse = " ";
Scanner in = new Scanner(System.in);
System.out.println("Enter a string to reverse");
str = in.nextLine();
int length = str.length();
for (int i = length - 1 ; i >= 0 ; i--)
reverse = reverse + str.charAt(i);
System.out.println("Reverse of the string: " + reverse);
}
}
