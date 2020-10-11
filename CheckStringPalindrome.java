/**the java program to check whether a string is a palindrome or not.
  *@author: Ajith R B
  *date:  09-10-2020
*/
package Javapack;
import java.util.Scanner;

public class CheckStringPalindrome{
public static void main(String arr[]){
Scanner s=new Scanner(System.in);
String word;
boolean isPalindrome=true;
System.out.println("Please enter the string to Check whether it is palindrome or not:");
word=s.nextLine();
String copy= word;
word=word.toLowerCase();
int length=word.length();
for(int i=0;i<length/2;i++){
if((word.charAt(i))!=(word.charAt(length-i-1)))
{

isPalindrome=false;
break;
}
}if(isPalindrome){
System.out.println("The given String "+copy+" is palindrome");
}
else{

System.out.println("The given string "+copy+" is not Palindrome");
}


}
}