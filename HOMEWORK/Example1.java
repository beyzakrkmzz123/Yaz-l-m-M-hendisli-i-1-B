/*Örnek69:Cos(x) fonksiyonu,Maclaurin serisin aşağıdaki gibi açılmaktadır.
Buna göre klavyeden girilen x değerinin kosinüsünü belirtilen terim sayısına
kadar seriye açarak hesaplaya program.
 
 */

/**
 *
 * @author beyza
 */import java.util.Scanner;
 
 
public class Example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Açı değeri(derece):");
        double aci = input.nextDouble();
        System.out.print("Terim sayısı: ");
        int N = input.nextInt();
        int T = 1;
        int is = 1;
        int F;
        double X = Math.toRadians(aci);
        for(int i=1;i<=N;i++){
            F=1;
            for(int j=1;j<=2;j++){
                F*=j;
                is*=(-1);
                T+=is*Math.pow(X, 2*i)/F;
            }
        }
        System.out.println(T);
    }
    
}
