/*Örnek102:
 */

/**
 *
 * @author beyza
 */import java.util.Scanner;
 
public class Example35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Lütfen bir adet sayısı giriniz: ");
        int n = input.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(i);
            System.out.print(i+1);
            System.out.print(i*(i+1));
        }
    }
    
}
