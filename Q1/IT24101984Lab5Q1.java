import java.util.Scanner;
public class IT24101984Lab5Q1  {
public static void main(String[] args)  {

  Scanner input = new Scanner(System.in);

 int num1,num2,num3,max,min;

  System.out.print("Enter the first integer : ");
  num1 = input.nextInt();

  System.out.print("Enter the second integer : ");
  num2 = input.nextInt();
 
  System.out.print("Enter the third integer : ");
  num3 = input.nextInt();

  //Find the maximum number
  if (num1 > num2 && num1 > num3)
   {
    max = num1;

    }
  
  else if (num2 > num1 && num2 > num3)
   {
    max = num2;
   }
  else
    {
    max = num3;
    
    }

//Find the smallest number
   if (num1 < num2 && num1 < num3)
   {
     min = num1;
   }

   else if (num2 < num1 && num2 < num3)
   {
     min = num2;
   }

   else
   {
    min = num3;
   }

   System.out.println("\n");  

  //Print the output
   System.out.println("User enterd numbers are : " + num1+" "+ num2 +" "+ num3);
   System.out.println("The Smallest number is : " + min);
   System.out.println("The Largest number is : " + max);


  }
}
  

  