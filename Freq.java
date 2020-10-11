/**the java program to find the frequency of a given character in a String.
  *@author: Ajith R B
  *date:  09-10-2020
*/
package Javapack;      //package
import java.util.Scanner;    //input data Scanner
public class Freq{
public static void main(String arr[]){  //main
int count=0;    //variable to count how many character frequency
String input;       //variable for string input
Scanner s=new Scanner(System.in);         //scanner
System.out.println("Please enter the String :");
input=s.nextLine();
String inputCopy =input.toLowerCase();          //convert string lowerCase
System.out.println("Please enter the character to Search:");

char charToSearch=s.next().charAt(0);           //character to search
char charToSearchCopy=Character.toLowerCase(charToSearch);     //to lowercase

char [] array=inputCopy.toCharArray();
for(char ch:array){
if(ch==charToSearchCopy){
count++;
}

}
System.out.println("The frequency of the a given character: "+charToSearch+" in the String : "+input+" is: "+count);
}
}
