/*Örnek104:
 */

/**
 *
 * @author beyza
 */import java.util.Scanner;
 
public class Example37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       for(int x=1;x<=50;x++){
           for(int y=x;y<=50;y++){
               for(int z=y;z<=50;z++){
                   if(x*x+y*y+z*z==3*x*y*z){
                       System.out.println(x+" "+y+" "+z);
                   } else {
                   }
               }
           }
       }
    }
    
}
