import java.util.Scanner; //importing scanner class
public class Rectangle     //class name Rectangle
  {
public static void main(String[]args)  //main method
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the length:");  // get the value of length from user
  int length=sc.nextInt();
  System.out.println("Enter the width:");  // get the value of width from user
  int width=sc.nextInt();
  int area=length*width;                  // formula to calculate area of recatngle
  System.out.println("Area of rectangle:"+area);// printing the area of rectangle
  }
  }
  
