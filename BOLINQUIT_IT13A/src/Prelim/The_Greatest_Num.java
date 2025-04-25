
package Prelim;

import java.util.Scanner;

public class The_Greatest_Num {
   
    
    public static void main(String[] args) {
        


        Scanner s=new Scanner(System.in);
        boolean u= true;
            while(u){
        System.out.print("Input the first number: ");
                int n1 = s.nextInt();
                
        System.out.print("Input the second number: ");
                int n2 =  s.nextInt();
                
         System.out.print("Input the third number: ");
                int n3=  s.nextInt();
                
                    int greatest = Math.max(Math.max(n1, n2), n3);
                    
                    System.out.println("The greatest number is: " + greatest);
                    
                    u=false;
                    
            }
       }
    }


