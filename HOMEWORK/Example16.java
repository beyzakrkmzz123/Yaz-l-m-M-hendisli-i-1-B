/*Örnek84:
 */

/**
 *
 * @author beyza
 */import java.util.Scanner;
 
public class Example16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Kısa kenar: ");
        int a = input.nextInt();
        int b;
        b=a*(1+5^(1/2))/2;
        System.out.println("a: "+a+ " b: "+b);
    }
    
}
