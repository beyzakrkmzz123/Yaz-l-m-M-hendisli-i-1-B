/*Örnek73:
 * 
 */

/**
 *
 * @author beyza
 */import java.util.Scanner;
import javafx.scene.input.KeyCode;
import static javafx.scene.input.KeyCode.X;
 
public class Example5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int max=90;
        int min=65;
        int Harf;
        Scanner input = new Scanner (System.in); 
        int randomsayi = (int) (Math.random()*(max-min-1))+min;
        Harf=ASCIIKar(X);
        int deneme=0;
        for(int i=1;i<=10;i++){
            System.out.print("Lütfen 65 ve 90 arasında bir sayı giriniz:");
            int tahmin = input.nextInt();
            deneme++;
            if(tahmin==Harf){
               System.out.println(deneme+" kadar tahminde doğru sonuca ulaştınız");
            }
            else{
                System.out.println("10 hakkınız bitti");
            }
            System.out.println(deneme+" kadar tahminde doğru sonuca ulaştınız"); 
        }
        
    }

    private static int ASCIIKar(KeyCode keyCode) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
