/*Örnek:74
 
 */

/**
 *
 * @author beyza
 */import java.util.Scanner;
 
public class Example6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Terim sayısını giriniz:");
        int N = input.nextInt();
        System.out.println("Hesaplanacak x değerini giriniz:");
        double x = input.nextDouble();
        int F=1;
        int T=1;
        for(int i=1;i<N;i++){
            F*=i;
            T+=Math.pow(x, i)/F;
        }
        System.out.println(T);
    }
    
}
