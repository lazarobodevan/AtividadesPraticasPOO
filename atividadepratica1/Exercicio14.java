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
public class Exercicio14 {
    public static void main(String []args){
        int qtd = 0;
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Quantidade: ");
        qtd = leitor.nextInt();
        
        for(int i = 1; i <= qtd; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
