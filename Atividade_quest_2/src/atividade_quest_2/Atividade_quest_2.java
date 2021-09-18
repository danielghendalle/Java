
package atividade_quest_2;

import static atividade_quest_2.Comparavel.DiferenteDe;
import static atividade_quest_2.Comparavel.MaiorOuIgual;
import static atividade_quest_2.Comparavel.MenorOuIgual;
import java.util.Scanner;

public class Atividade_quest_2 {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
         
        
        System.out.println("Insira o número a ser comparado");
        double num = entrada.nextDouble();
        MaiorOuIgual(num);
        MenorOuIgual(num);
        DiferenteDe(num);
                
    }
    
}
