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
public class Exercicio6 {
    public static void main(String []args){
        int h1, m1, s1, h2, m2, s2;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Aviso: assuma 24 como meia noite!");
        
        System.out.print("Hora 1: ");
        h1 = leitor.nextInt();
        System.out.print("Minuto 1: ");
        m1 = leitor.nextInt();
        System.out.print("Segundo 1: ");
        s1 = leitor.nextInt();
        System.out.print("Hora 2: ");
        h2 = leitor.nextInt();
        System.out.print("Minuto 2: ");
        m2 = leitor.nextInt();
        System.out.print("Segundo 2: ");
        s2 = leitor.nextInt();
        
        if(h1 > h2){
            h1 = h1-h2;
        }else
            h1 = h2-h1;
        
        if(m1 > m2){
            m1 = m1-m2;
        }else
            m1 = m2-m1;
        
        if(s1 > s2)
            s1 = s1-s2;
        else
            s1 = s2-s1;
        
        h1 = h1*3600;
        m1 = m1*60;
        System.out.println("Total: "+ (h1+m1+s1+s2));
    }
}
