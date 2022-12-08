/*Örnek89:
 */

/**
 *
 * @author beyza
 */import java.util.Scanner;
 
public class Example21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       System.out.print("Pozitif bir tam sayı giriniz: ");
       int n = input.nextInt();
       if(n!=0){
           System.out.println("Girdiğiniz sayı asal değildir");   
       }
       else if(n+2!=1){
           System.out.println("Girdiğiniz sayı chen asalıdır");
       }
       else{
           System.out.println("Girdiğiniz sayı chen asalı değildir");
       }
    }
    
}
