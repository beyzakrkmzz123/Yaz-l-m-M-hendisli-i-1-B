/*Örnek95:
 */

/**
 *
 * @author beyza
 */import java.util.Scanner;
 
public class Example27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       System.out.print("x sayısını giriniz: ");
       int x = input.nextInt();
       System.out.println("y sayısını giriniz: ");
       int y = input.nextInt();
       for(int i=2;i<x;i++){
           for(int j=2;j<y;j++){
               System.out.println(i^j+j^i);
           }
       }
    }
    
}
