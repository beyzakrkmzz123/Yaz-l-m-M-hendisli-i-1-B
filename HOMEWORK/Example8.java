/*Örnek76:

 */

/**
 *
 * @author beyza
 */import java.util.Scanner;
 
public class Example8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       System.out.print("Terim sayısı: ");
       int n = input.nextInt();
       int t=2;
       int f;
       int faktöriyel;
       for(int k=1;k<n;k++){
           f=faktöriyel(2*k+1);
           t=t+(2*k+2)/f;
       }
       System.out.println(t);
    }

    private static int faktöriyel(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    

   
    }
    
    

