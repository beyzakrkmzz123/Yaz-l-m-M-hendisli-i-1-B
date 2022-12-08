
/*Örnek72:Bilgisayarın ürettiği 1-99 arası bir tam sayının tahmin edilme oyunu 
("sayı bulma oyunu") programı.
 */

/**
 *
 * @author beyza
 */import java.util.Scanner;
 
 
public class Example2 {

   
    public static void main(String[] args) {
        int max=99;
        int min=1;
        Scanner input = new Scanner (System.in); 
        int randomsayi = (int) (Math.random()*(max-min-1))+min;
        /*
        Random r = new Random();
        int randomsayi = r.nextInt(99)+1;
        */
        
        int deneme=0;
        while(true){
            System.out.print("Lütfen 1 ve 99 arası sayı giriniz:");
            int sayi = input.nextInt();
            deneme++;
            if(sayi>randomsayi){
                System.out.println("Lütfen daha küçük bir sayı giriniz");
            }
            else if (randomsayi>sayi){
                System.out.println("Lütfen daha büyük bir sayı giriniz");
            }
            else if(randomsayi==sayi){
                System.out.println("Tebrikler , doğru tahmin");
                break; // döngüden çıkar
            }
        }
        System.out.println(deneme+" kadar tahminde doğru sonuca ulaştınız");
        
    }
    
}

    
    

