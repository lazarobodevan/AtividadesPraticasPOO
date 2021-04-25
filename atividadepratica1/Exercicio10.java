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
public class Exercicio10 {
    public static void main(String []args){
        String comando, operacao, stringVal1, stringVal2;
        double val1, val2;
        
        Scanner leitor = new Scanner(System.in);
        comando = leitor.nextLine();
        String[] partes = comando.split(" ");
        operacao = partes[0];
        stringVal1 = partes[1];
        stringVal2 = partes[3];
        
        val1 = Double.parseDouble(stringVal1);
        val2 = Double.parseDouble(stringVal2);
        
        if(operacao.equals("MULTIPLICA")){
            System.out.println("Resposta: "+(val1*val2));
        }else if(operacao.equals("DIVIDE")){
            System.out.println("Resposta: "+(val1/val2));
        }else if(operacao.equals("SOMA")){
            System.out.println("Resposta: "+(val1+val2));
        }else if(operacao.equals("SUBTRAI")){
            System.out.println("Resposta: "+(val1-val2));
        }
        
    }
}
