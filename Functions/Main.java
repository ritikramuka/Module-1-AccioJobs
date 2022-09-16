import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    
    // static return_type function_name (Empty / arguments) {
    //      body
    //      return_statment     
    // }
    
    static void addTwoNumbers (int num1, int num2) {
        int add = num1 + num2;
        System.out.println(add);
    }
    
    // return_type: int[], String[], int, float, boolean, boolean[]
    // primitive and non-primitive data types
    
    
    public static int getSum (int num1, int num2) {
        int add = num1 + num2;
        return add;
    }
    
    public static void sayHello() {
        System.out.println("hello");
    }
    
    public static void sayHello2(String naam) {
        System.out.println("hello" + naam);
    }
    
    public static int getFactorial (int n) {
        int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    
    public static String fun(int n) {
        if(n % 2 == 0) {
            return "even";
        }
        else {
            return "odd";
        }
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // // System.out.println(a + b);
        // for(int i = 0; i < 10; i++) {
        //     addTwoNumbers(a, b);
        // }
        
        // sayHello();
        // String name = "Ritik";
        // sayHello2(name);
        
        // int a = 10;
        // int b = 20;
        // int sum = getSum(a, b);
        // System.out.println(sum);
        
        // System.out.println(getFactorial(10));
        
        // System.out.println(fun(4));
        // System.out.println(fun(5));
        
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
	   // swap(a, b);
	   // System.out.println("a -> " + a +" b -> "+ b);
	   
	   //int[] arr = {1, 3, 4, 288, 90};
	   
	   //for(int i = 0; i < arr.length; i++) {
	   //    System.out.print(arr[i] + " ");
	   //}
	   //System.out.println();
	   
	   //updateArray(arr);
	   
	   //for(int i = 0; i < arr.length; i++) {
	   //    System.out.print(arr[i] + " ");
	   //}
	   //System.out.println();
	   
	   //String name = "Ritik";
	   //System.out.println(name);
	   //updateName(name);
	   //System.out.println(name);
	   //int add = 10;
	   
	   //for(int i = 0; i < 10; i++) 
	   //{
	   //    int temp = 10;
	   //    System.out.println(temp);
	   //}
	   
	   //System.out.println(add);
	   
	   
	   // will not work
	   //int a = 10;
	   //int b = 20;
	   //swap(a, b);
	   //System.out.println("a -> " + a +" b -> "+ b);
	   
	   int[] arr = new int[2];
	   // arr[0] -> a, arr[1] -> b;
	   arr[0] = 10;
	   arr[1] = 20;
	   swap2(arr);
	   System.out.println("a -> " + arr[0] +" b -> "+ arr[1]);
	}
	
	public static void swap2(int[] brr) 
	{
	    int temp = brr[0];
	    brr[0] = brr[1];
	    brr[1] = temp;
	}
	
	public static void updateName(String bname) {
	    bname = "Ronak";
	}
	
	public static void updateArray(int[] brr) {
	    brr[1] = -100;
	}
	
	public static void display(int[] arr) {
	    for(int i = 0; i < arr.length; i++) {
	        System.out.print(arr[i] + " ");
	    }
	    System.out.println();
	}
	
	public static void swap(int a, int b) {
	    int temp = a;
	    a = b;
	    b = temp;
	}
}
