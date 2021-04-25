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
public class Exercicio8 {
    public static void main(String []args){
        int n, menor, maior, pares=0, impares=0;
        double media = 0;
        
        Scanner leitor = new Scanner(System.in);
        System.out.print("Tamanho: ");
        n = leitor.nextInt();
        
        if(n <= 0 || n >= 1000){
            System.out.println("Valor invalido");
            System.exit(1);
        }
        
        int vet[] = new int[n];
        
        for(int i = 0; i < n; i++){ //preencher o vetor
            System.out.print("Valor " + (i+1) +": ");
            vet[i] = leitor.nextInt();
        }
        
        maior = vet[0];
        for(int i = 1; i < n; i++){ //descobrir o maior valor
            if(vet[i] > maior)
                maior = vet[i];
        }
        
        menor = vet[0];
        for(int i = 1; i < n; i++){ //descobrir o menor valor
            if(vet[i] < menor)
                menor = vet[i];
        }
        
        for(int i = 0; i < n; i++){ //descobrir a media
            media += vet[i];
        }
        media = media/n;
        
         for(int i = 0; i < n; i++){ //qtd pares e impares
            if(vet[i]%2 == 0){
                pares++;
            }else{
                impares++;
            }
        }
         
         System.out.println("Maior: "+maior);
         System.out.println("Menor: "+menor);
         System.out.println("Media: "+media);
         System.out.println("Pares: "+pares);
         System.out.println("Impares: "+impares);
    }
}
