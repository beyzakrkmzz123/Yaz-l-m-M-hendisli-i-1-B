/*Örnek117:
 */

/**
 *
 * @author beyza
 */import java.util.Scanner;
 
public class Example50 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Lütfen bir terim sayısı giriniz: ");
        int n = input.nextInt();
        int p1=0;
        int p2=1;
        System.out.println(p1+" "+p2);
        for(int i=1;i<n-2;i++){
            int p3=2*p2+p1;
            System.out.println("p3:"+p3);
            p1=p2;
            p2=p3;
        }
    }
    
}
