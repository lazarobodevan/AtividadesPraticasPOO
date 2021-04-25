/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadepratica1;

import java.util.Scanner;

/**
 *
 * @author Lázaro
 */
public class Exercicio11 {
    public static void main(String []args){
        int sorteado;
        int valorLido;
        Scanner leitor = new Scanner(System.in);
        
        
        sorteado = (int)(Math.random()*((100-1)+1))+1;
        
        System.out.print("Adivinha: ");
        valorLido = leitor.nextInt();
        
        while(valorLido != sorteado){
            if(valorLido > sorteado)
                System.out.println("O valor sorteado é menor!");
            else
                System.out.println("O valor sorteado é maior!");
            
            System.out.print("Adivinha: ");
            valorLido = leitor.nextInt();
        }
        System.out.println("");
        System.out.println("PARABENS!");
    }
}
