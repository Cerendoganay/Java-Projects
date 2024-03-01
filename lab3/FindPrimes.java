
import java.util.Scanner;


public class FindPrimes {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        System.out.println("enter a number : ");
        int max = tara.nextInt();

       for (int i = 2 ; i < max ; i++){
           boolean isPrime = true;
           for( int divisor = 2; divisor < i; divisor++){
               if(i % divisor == 0) {
                   isPrime = false;
                   break;
               }
           }
           if(isPrime){
               System.out.print( i+ ",");
           }
       }

    }
}
