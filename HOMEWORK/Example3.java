/*Örnek70:
 */

/**
 *
 * @author beyza
 */import java.util.Scanner;
 
 
public class Example3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Açı değeri(derece):");
        double x = input.nextDouble();
        System.out.print("Terim sayısı:");
        int N = input.nextInt();
        int T=0;
        int F;
        int is=0;
        for(int i=1;i<=N;i++){
            F=1;
            for(int j=1;j<2*i-1;j++){
                F=F*j;
                is*=(-1);
                T+=is*Math.pow(x, 2*i-1)/F;
            }
        }
        System.out.println(T);
        
        
    }
    
}
