/*Örnek102:
 */

/**
 *
 * @author beyza
 */import java.util.Scanner;
 
public class Example34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      System.out.print("Lütfen bir üst sınır giriniz: ");
      int n = input.nextInt();
      for(int i=1;i<=n;i++){
          int s=0;
          for(int j=1;j<i;j++){
              if(i%j==0){
                  s=s+1;
              }
              while(i%s==0){
                  System.out.println(i);
              }
          }
      }
    }
}
