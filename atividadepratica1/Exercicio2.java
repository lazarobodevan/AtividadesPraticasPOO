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
public class Exercicio2 {
    public static void main(String []args){
        double num, den;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Numerador: ");
        num = leitor.nextInt();
        System.out.println("Denominador: ");
        den = leitor.nextInt();
        if(den == 0){
            System.out.println("Aviso! Denominador 0");
            System.exit(1);
        }
        System.out.println("Numero Real = "+ (num/den));
        
    }
}
