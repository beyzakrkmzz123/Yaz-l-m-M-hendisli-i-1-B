/*Örnek120:
 */

/**
 *
 * @author beyza
 */import java.util.Scanner;
 
public class Example53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       System.out.println("Lütfen bir terim sayısı giriniz: ");
       int n = input.nextInt();
       int t1=1;
       int t2=1;
       int t3=2;
       System.out.print(t1+""+t2+""+t3);
       for(int i=1;i<=n-3;i++){
           int t4= t1+t2+t3;
           System.out.println(t4);
           t1=t2;
           t2=t3;
           t3=t4;
       }
    }
    
}
