/*Örnek94:
 */

/**
 *
 * @author beyza
 */import java.util.Scanner;
 
public class Example26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Terim sayısı: ");
        int n = input.nextInt();
        for(int i=0;i<n-1;i++){
            System.out.println(2^(2^i)+1);
        }
    }
    
}
