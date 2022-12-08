/*Örnek96:
 */

/**
 *
 * @author beyza
 */import java.util.Scanner;
 
public class Example28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       System.out.print("Pozitif bir tam sayı giriniz: ");
       int s = input.nextInt();
       if((s-1)%4==0){
           System.out.println("Hilbert sayısıdır");
       }
       else{
           System.out.println("Hilbert sayısı değildir");
       }
    }
    
}
