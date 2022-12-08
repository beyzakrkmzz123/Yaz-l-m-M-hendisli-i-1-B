/*Örnek77:
 */

/**
 *
 * @author beyza
 */import java.util.Scanner;
 
public class Example9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Terim sayısı: ");
       int n = input.nextInt();
       int t = 0;
       for(int k=0;k<n-1;k++){
           t=t+(-1)^k/((2*k+1)*3^k);
       }
       System.out.println((12)^(1/2)*t);
    }

   
    }
    

