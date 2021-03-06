import java.util.Scanner; //importing to be able to have user inputs

public class HelloWorld
{  
  public static void main(String[] args)
  {
    System.out.println("Hello World!!"); //displaying information to the console
    System.out.println("This is programming in Java!");
    System.out.println("My name is Noe Rivera Jr.");
    
    int x = 10; //using arthimetic operators with variables in Java
    int y =15;
    int sum = x + y;
    int div = y/x;
    int product = x*y;
    int remain = y%x;
    System.out.println("The sum of 10 and 15 is: " + sum);
    System.out.println("The quotient of 15 and 10 is: " + div); 
    System.out.println("The product of 10 and 15 is: " + product); 
    System.out.println("The remainder of 15 and 10 is: " + remain + "\n"); 
    
    System.out.println("Now I will print all even numbers from 0 to 10 using a for loop"); 
    for (int i = 2; i <= 10; i+=2)     //using for loops to iterate through even numbers
    {
      System.out.println(i);
    }
    System.out.println("\nNow I will print all odd numbers from 0 to 10 using a while loop"); 
    int i = 1;
    while(i<10)              //using while loops to iterate through odd numbers
    {
      System.out.println(i);
      i+=2;
    }
    
    int a= 10;    //using these variables, I will utilize if, and if-else decision statements
    int b= 20;
    int c= 30;
    if (a<b)
    {
      System.out.println("The number " + a + " is less than " + b);
    }
    else
    {
      System.out.println("The number " + b + " is less than " + a + "\n");
    }
    
    if (a>b)
    {
      System.out.println("The number" + a + " is greater than " + b);
    }
    else if (b>c)
    {
      System.out.println("The number" + b + " is greater than " + c);
    }
    else
    {
      System.out.println("The number " + c + " is greater than both the number " + a + " and the number " + b + "\n");
    }
    
   String hello = helloWorld(); //creating a method and calling it to assign its return value to a string
   System.out.println(hello);
   
   System.out.println("Please enter 3 numbers to calculate the average"); //the use of inputs and outputs with an average method
   Scanner input = new Scanner(System.in); //creating a new scanner object to use for inputs
   System.out.print("Enter number 1: ");
   int num1 = input.nextInt();
   System.out.print("Enter number 2: ");
   int num2 = input.nextInt();
   System.out.print("Enter number 3: ");
   int num3 = input.nextInt();
   int avg = Average(num1,num2,num3);
   System.out.print("The average of the 3 numbers is: " + avg + "\n");
   
   int[] myList = {1,2,3,4,5}; //creating an array and using a for loop to iterate through the array via indices
   for(int j = 0; j < myList.length;j++)
   {
     System.out.println(myList[j] +" ");
   }
  }
  
  
  
   public static String helloWorld() //static method that returns a string
  {
    String x = "Hello World";
    return x;
  }
   
   public static int Average(int a, int b, int c) //static method that calculates an average
   {
     int avg = (a + b + c)/3;
     return avg;
   }
}