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
public class Exercicio13 {
    public static void main(String []args){
        double minPlano = 100, minExtra = 50;
        double minLido;
        double cobrancaTotal = 50.00, cobranca;
        String opc = "";
        Scanner leitor = new Scanner(System.in);
        
        while(!opc.equals("s")){
            System.out.println("----------------------------");
            System.out.println("Minutos disponíveis: "+minPlano);
            System.out.println("Minutos extra: "+minExtra);
            System.out.println("Valor a pagar: "+cobrancaTotal);
            System.out.println("----------------------");
            System.out.println("|--> Tipo de ligação |");
            System.out.println("|v) Vai-Vai          |");
            System.out.println("|t) Fixo             |");
            System.out.println("|o) Outros           |");
            System.out.println("|s) Sair             |");
            System.out.println("----------------------");
            System.out.print("Opcao: ");
            opc = leitor.next();

            if(opc.equals("s")){
                System.out.println("\n\n--------------------------------");
                System.out.println("Minutos disponíveis: "+minPlano);
                System.out.println("Valor a pagar: "+cobrancaTotal);
                break;
            }
            
            System.out.print("Minutos:");
            minLido = leitor.nextDouble();
            
            
            if(opc.equals("v")){
                if(minLido >= (minPlano+minExtra)){
                    minLido = minLido - minExtra;
                    minExtra = 0;
                    minLido = minLido - minPlano;
                    if(minPlano+minExtra != 0)
                        minPlano = 0;
                    cobranca = minLido * 0.2;
                    System.out.println("-->Excedido cobrado: R$"+cobranca);
                    cobrancaTotal += cobranca;
                }else{
                    minLido = minExtra - minLido;
                    minExtra = minLido;
                    if(minExtra < 0){
                        minExtra *= -1; //Passar pra positivo;
                        minPlano = minPlano - minExtra;
                        minExtra = 0;
                    }
                }
                    
            }
            
            if(opc.equals("t")){
                if((minLido/2) > minPlano){
                    minLido = (minLido/2) - minPlano;
                    minPlano = 0;
                    cobranca = minLido * 0.2;
                    System.out.println("-->Excedido cobrado: R$"+cobranca);
                    cobrancaTotal += cobranca;
                }else
                    minPlano = minPlano - (minLido/2);
            }
            
            if(opc.equals("o")){
                if(minLido > minPlano){
                    minLido = minLido - minPlano;
                    minPlano = 0;
                    cobranca = minLido * 0.65;
                    System.out.println("Excedido cobrado: R$"+cobranca);
                    cobrancaTotal += cobranca;
                }else
                    minPlano = minPlano - minLido;
            }
        }
    }
}
