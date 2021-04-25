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
public class Exercicio3 {
    public static void main(String []args){
        double bruto, liquido, desconto, maximo, emprestimo;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Salario bruto: ");
        bruto = leitor.nextDouble();
        System.out.print("Descontos: ");
        desconto = leitor.nextDouble();
        
        liquido = bruto - desconto;
        
        maximo = liquido*0.3;
        
        System.out.print("Valor do emprestimo: ");
        emprestimo = leitor.nextDouble();
        
        if(emprestimo <= maximo){
            System.out.println("Emprestimo aprovado!");
        }else{
            System.out.println("Emprestimo negado!");
        }
    }
}
