/*Örnek99:
 */

/**
 *
 * @author beyza
 */import java.util.Scanner;
 
public class Example31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Birinci doğal sayıyı giriniz: ");
        int a = input.nextInt();
        System.out.print("İkinci doğal sayıyı giriniz: ");
        int b = input.nextInt();
        int a0=a%10;
        int b0=b%10;
        int a1=(a-a0)/10;
        int b1=(b-b0)/10;
        if((a1==b1)&&(a0+b0==10)){
        System.out.println("Bağdaşık sayılar");
        }
        else{
            System.out.println("Bağdaşık sayılar değil");
        }
   
        
    

   
    }

    
    
    
}
