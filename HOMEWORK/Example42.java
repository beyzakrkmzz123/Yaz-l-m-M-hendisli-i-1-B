/*Örnek109:
 */

/**
 *
 * @author beyza
 */import java.util.Scanner;
 
public class Example42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir terim sayısı giriniz: ");
        int n = input.nextInt();
        for(int i=1;i<=n;i++){
            int u=i*(i+1)/2;
            System.out.println(u);
        }
    }
    
}
