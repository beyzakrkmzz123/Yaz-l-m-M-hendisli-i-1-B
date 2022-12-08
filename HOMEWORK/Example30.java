/*Örnek98:
 */

/**
 *
 * @author beyza
 */import java.util.Scanner;
 
public class Example30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
        int s;
        for(int i=1;i<=9;i++){
            for(int j=0;j<=9;j++){
                for(int k=0;k<=9;k++){
                   s=100*i+10*j+k;
                   if(s==(i^3)+(j^3)+(k^3)){
                       System.out.println(s);
                   }
                }
            }
        }
            
        
    }
    
}
