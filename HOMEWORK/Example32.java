/*Örnek100:
 */

/**
 *
 * @author beyza
 */import java.util.Scanner;
 
public class Example32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       System.out.print("Bir tamsayı giriniz: ");
       int s = input.nextInt();
       int t=0; 
       for(int i=1;i<s;i++){
           if(s%i==0){
               t=t+i;
           }
    }
       if(t<2*s){
           System.out.printf("Eksik sayıdır");
       }
       else{
           System.out.println("Eksik sayı değildir");
       }
    
}
}