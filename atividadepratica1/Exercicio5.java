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
public class Exercicio5 {
    public static void main(String []args){
        int dia, mes;
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Dia: ");
        dia = leitor.nextInt();
        System.out.print("Mes: ");
        mes = leitor.nextInt();
        
        if(mes == 2 && (dia <= 28 && dia >= 1)){
            System.out.println("Válido");
        }else if((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia >=1 && dia <=30)){
            System.out.println("Válido");
        }else if((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia >=1 && dia <=31)){
            System.out.println("Válido");
        }else
            System.out.println("Inválido");
        
        
    }
}
