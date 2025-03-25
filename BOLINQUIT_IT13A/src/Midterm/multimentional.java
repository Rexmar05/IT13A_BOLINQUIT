
package MIDTERM;

public class multimentional {
    public static void main(String[] args) {
       
         
        int[][] numb= {
                  {1, 2, 3, 4},
                  {5, 6, 7, 8}, 
                  {9, 10, 11, 12}    
        };
     for (int i = 0; i< numb.length; i++){
          System.out.print("The Elements in row" + (i + 1)+ ": ");
          for(int q = 0; q < numb[i].length; q++){
              System.out.print(numb[i][q] + " ");
          }
      System.out.println();
     }
}
}
