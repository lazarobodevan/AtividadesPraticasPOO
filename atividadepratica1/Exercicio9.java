/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadepratica1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Lázaro
 */
public class Exercicio9 {
    public static void main(String []args){
        String valorLido;
        int aux;
        ArrayList<Integer> vet = new ArrayList<>();
        
        Scanner leitor = new Scanner(System.in);
        
        while(true){ //lendo os diversos valores até a palavra "fim"
            System.out.print("Valor: ");
            valorLido = leitor.nextLine();
            if("fim".equals(valorLido))
                break;
            else
                vet.add(Integer.parseInt(valorLido));
        }
        
        Collections.sort(vet);
        System.out.println("----ORDENADOS----");
        for(int i = 0; i < vet.size(); i++){
            System.out.println(" "+vet.get(i));
        }
    }
}
