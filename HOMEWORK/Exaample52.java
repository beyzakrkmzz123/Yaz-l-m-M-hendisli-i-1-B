/*Örnek119:
 */

/**
 *
 * @author beyza
 */import java.util.Scanner;
 
public class Exaample52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Lütfen bir satır sayısı giriniz: ");
        int n = input.nextInt();
        int s=1;
        System.out.println("Floyd üçgeni");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.printf("%d\t",s);
                s=s+1;
            }
            System.out.println();
        }
    }
    
}
