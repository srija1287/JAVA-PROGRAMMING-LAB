import java.util.Scanner;
class ArraySum{
   public static void main(String args[]){
      Scanner scanner = new Scanner(System.in);
      int[] array = new int[6];
      int sum = 0;
      System.out.println("Enter the elements:");
      for (int i=0; i<6; i++)
      {
    	  array[i] = scanner.nextInt();
      }
      for( int num : array) {
          sum = sum+num;
      }
      System.out.println("Sum of array elements is:"+sum);
   }
}