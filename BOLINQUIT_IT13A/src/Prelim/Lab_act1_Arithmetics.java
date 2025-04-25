package Prelim;

public class Lab_act1_Arithmetics {
  
      public static void main(String[] args){
       
       int k= 10;
       int l= 4;
       int m= 6;
       
       int first= k*l+m;
       int second= (k-l)%m;
       int third=(k+l+m)/3;
       int fourth=k*m-(l*l);
       
       System.out.println("10 * 4+ 6  = " + first);
       System.out.println("(10 - 4)%6 = " + second);
       System.out.println("(10+4+6)/3 = " + third);
       System.out.println("10 * 6-(4*4) = " + fourth);
       
        
    }
}

