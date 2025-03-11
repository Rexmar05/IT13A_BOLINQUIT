package Midterm;
import java.util.Scanner;
public class Palindrom {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       System.out.print("Enter a word or a number");
       String inputprocess = scan.nextLine();
       
       String reverse ="";
       
       for( int i = inputprocess.length()- 1; i>= 0;i--)
       {
           reverse+= inputprocess.charAt(i);
       }
       if(inputprocess.equalsIgnoreCase(reverse)){
        System.out.print("it's a Palindrom");
       }else{
            System.out.print("it's not a Palindrom");
            
           
       }
    }
}
