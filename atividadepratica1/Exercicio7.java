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
public class Exercicio7 {
    public static void main(String []args){
        int N;
        double soma = 0, prod = 1;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Tamanho: ");
        N = leitor.nextInt();
        if(N <= 0 || N >= 1000){
            System.out.println("Valor inválido!");
            System.exit(1);
        }
        int vet[] = new int[N];
        
        for(int i = 0; i < N; i++){
            System.out.print("Valor " + (i+1) +": ");
            vet[i] = leitor.nextInt();
        }
        
        for(int i = 0; i < N; i++){
            soma += vet[i];
        }
        
        for(int i = 0; i < N; i++){
            prod *= vet[i];
        }
        
        System.out.println("Soma = "+soma);
        System.out.println("Produto = "+prod);
    }
}
