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
public class Exercicio1 {
    public static void main(String[] args) {
        int nasc, ano;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Ano de nascimento: ");
        nasc = leitor.nextInt();
        System.out.print("Ano atual: ");
        ano = leitor.nextInt();
        System.out.println("Sua idade é " + (ano-nasc));
        
    }
    
}
