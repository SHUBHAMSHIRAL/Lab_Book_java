public class Lab1_b {
   public static int difference(int n){
      
      int sumSquareN = (n * (n + 1) * (2 * n + 1)) / 6;
      
      int sumN = (n * (n + 1)) / 2;
      
      int squareSumN = sumN * sumN;
      
      return Math.abs(sumSquareN - squareSumN);
   }
   public static void main(String args[]){
      int n = 3;
      System.out.println("Number: " + n);
      System.out.println("Difference: " + difference(n));
   }
}