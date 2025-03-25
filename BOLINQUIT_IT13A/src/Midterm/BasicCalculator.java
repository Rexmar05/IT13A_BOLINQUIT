
package MIDTERM;

public class BasicCalculator {
  public static int Addition(int a, int b){
        return a + b;
    }
    public static int Subtraction(int a, int b){   
         return a - b;
    }
    public static int Multiplication(int a, int b){   
        return a * b;
    }
    
     public static int Division(int a, int b){   
         return a / b;
     }    
     public static float Module (int a, int b){   
         return (a * b/100);
     }   
      
     public static void main( String[] argrs){
    int result = Addition( 10,10);
    System.out.println("Add: " + result);
     
    int result1 = Subtraction ( 8,5);
    System.out.println("Sub: " + result1);
    
    int result2 =  Multiplication( 5,5);
    System.out.println("Mul: " + result2);
   
    int result3 = Division ( 20,10);
    System.out.println("Div: " + result3);
    
    float result4 = Module (100, 50);
    System.out.println("Mod: " + result4);
    
     }
     
  
}   

