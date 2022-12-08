/*Örnek92:
 */

/**
 *
 * @author beyza
 */import java.util.Scanner;
 
public class Example24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       System.out.print("Pozitif bir tam sayı giriniz: ");
       int n = input.nextInt();
       int a;
       int b;
       for(int i=1;i<n;i++){
           a=2^i;
           b=2^(i+1);
           if(b==0){
               System.out.println(a*b);
           }
           else{
           }
                       
                       }
       }
    }
    

