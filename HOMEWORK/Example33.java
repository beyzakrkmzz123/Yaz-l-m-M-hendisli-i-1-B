/*Örnek101:
 */

/**
 *
 * @author beyza
 */import java.util.Scanner;
 
public class Example33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Bir tamsayı giriniz: ");
        int n = input.nextInt();
        for(int i=1;i<n;i++){
            int s=0;
            for(int j=1;j<i;j++){
                if(i%j==0){
                    s=s+1;
                } 
            if(i%s==0){
                System.out.println(i);
            }   
    }
    
}
    } }