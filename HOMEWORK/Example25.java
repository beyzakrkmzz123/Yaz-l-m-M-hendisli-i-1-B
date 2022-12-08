/*Örnek93:
 */

/**
 *
 * @author beyza
 */import java.util.Scanner;
 
public class Example25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       System.out.print("Terim sayısı: ");
       int n = input.nextInt();
       for(int i=1;i<n;i++){
           System.out.println(i*2^i+1);
       }
    }
    
}
