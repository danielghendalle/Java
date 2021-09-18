
package entrada.de.dados;

import java.util.Scanner;

public class EntradaDeDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner sx = new Scanner(System.in);
     
     System.out.print("Insira o dado abaixo: ");      
     String nome = sx.nextLine();
        
        System.out.println("Seu nome é " + nome);
            
              
        
    }
    
}
