/*Örnek85:
 */

/**
 *
 * @author beyza
 */import java.util.Scanner;
 
public class Example17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       System.out.print("Doğru parçası uzunluğu: ");
       int u = input.nextInt();
       int a; 
       int b;
       b=u/(2+2^5);
       a=u-b;
       System.out.println("a: "+a+ " b: "+b);
       
    }
    
}
