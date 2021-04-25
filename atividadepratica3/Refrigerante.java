/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadepratica3;

/**
 *
 * @author Lázaro
 */
public class Refrigerante {
    private String nome;
    private double valor;

    public Refrigerante(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }
    
    public void alteraValor(double val){
        if(val <= 0){
            this.valor = 1.00; 
        }else
            this.valor = val;
    }
    
    public double getValor(){
        return this.valor;
    }
    
    public String getNome(){
        return this.nome;
    }
}
