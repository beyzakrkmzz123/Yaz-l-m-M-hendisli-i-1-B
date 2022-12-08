/*Örnek78:
 
 */

/**
 *
 * @author beyza
 */import java.util.Scanner;
 
public class Example10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Terim sayısı: ");
       int n = input.nextInt();
       int t=0;
       int c=1;
       int c1;
       for(int k=1;k<n;k++){
           c1=4*k*k;
           c=c*c1/(c1-1);
       }
       System.out.println(2*c);
    }
    
}
