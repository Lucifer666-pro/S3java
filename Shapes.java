/** 
  *This the java program to calculate the area of different shapes namely circle,rectangle and triangle using the concept of the method Overloading.
  *@author :Ajith R B
  *16-06-2020
*/
package Javapack;
public class Shapes
{

void calArea(int x,int y)
{
float triangleArea=(x*y)/2;
System.out.println("Area of triangle :"+triangleArea+"sq units");
}
void calArea(float x,float y)
{
float rectangleArea=x*y;
System.out.println("Area of rectangle :"+rectangleArea+"sq units");
}
void calArea(double r)
{
final double pi=3.14;
double circleArea=pi*r*r;
System.out.println("Area of circle :"+circleArea+"sq units");
}

public static void main(String arr[]){
Shapes s1=new Shapes();
s1.calArea(5,4);
s1.calArea(10,22);
s1.calArea(6,1);
}
}
