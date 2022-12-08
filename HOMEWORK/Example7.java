/*Örnek75:
 
 */

/**
 *
 * @author beyza
 */import java.util.Scanner;
 
public class Example7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       double x;
       double n;
       System.out.printf("exp(x=lim(1+x/n))^n\n\n");
       System.out.print("x: ");
        x = input.nextDouble();
       System.out.print("n: ");
       n = input.nextDouble();
        double sonuc = Math.pow((1+x/n), n);
        System.out.println(sonuc);
    }
    
}
