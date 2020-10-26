/** 
  *This the java program to find the volume of a box using object.
  *@author :Ajith R B
  *16-06-2020
*/
package Javapack;
class box{
double height;
double width;
double depth;
public double calVolume()
{
return width*height*depth;
}
}
public class BoxDemo
{
public static void main(String arr[]){
box x1=new box();
box x2=new box();
x1.height =20;
x1.width=10;
x1.depth=15;
x2.height =70;
x2.width=50;
x2.depth=55;
double volumeX1=x1.calVolume();
System.out.println("Volume of box 1 ="+volumeX1);
double volumeX2=x2.calVolume();
System.out.println("Volume of box 2 ="+volumeX2);

}
}
