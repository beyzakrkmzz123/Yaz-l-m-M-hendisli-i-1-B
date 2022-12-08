/*Örnek82:
 */

/**
 *
 * @author beyza
 */import java.util.Scanner;  
 
public class Example14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      System.out.print("Bölüm sayısı: ");
      int n = input.nextInt();
      int t=1;
      for(int i=1;i<n;i++){
          t=4+1/t;
      }
      System.out.println(2+1/t);
    }
    
}
