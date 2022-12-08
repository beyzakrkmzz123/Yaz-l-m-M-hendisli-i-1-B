/*Örnek91:
 */

/**
 *
 * @author beyza
 */import java.util.Scanner;
 
public class Example23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz:");
        int s = input.nextInt();
        int t = 0;
        for(int i = 1;i<=s-1;i++){
            if(s%i==0){
                t=t+i;               
            }
            else if(s==t){
                System.out.println("Mükemmel sayıdır");
            }
            else{
                System.out.println("Mükemmel sayı değildir");
            }
        }
    }
    
}
