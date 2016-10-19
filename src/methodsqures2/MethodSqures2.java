 
package methodsqures2;

import java.util.Scanner;

public class MethodSqures2 {

    public static void main(String[] args) 
    {
       Scanner input = new Scanner(System.in);
       int int1 = isValidInt(input, "Enter an integer between 1 and 50 & I'll square it: ", 1, 50);
       print_output(int1);
    }
    //method : void print output(int i)
    public static void print_output(int int1)
    {
      System.out.println("Number \tSquared");
       for(int i = 1; i <= int1; i++)
       {
           int i_squared = (int)Math.pow(i, 2);
          
          
           System.out.println(i + "\t" + i_squared);
       }
        
    }
    //method:isValidInt(Scanner sc, String str) return i
    public static int isValidInt(Scanner sc, String str, int min, int max)
    {
        int i = 0;
        boolean isValid = false;
        while(isValid == false)
        {
            System.out.print(str);
            if(sc.hasNextInt())
            {
                i = sc.nextInt();
                if (i >= min && i <= max)
                    isValid = true;
                    
                else
                    System.out.println("Int must be between 1 and 50.");
            }
            else
            {
                System.out.println("Not a number. Try again: ");
            }
            
            //discard previous input
            sc.nextLine();
        }
        return i;
    }
}
