/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadepratica3;
import atividadepratica3.MaquinaDeRefrigerante;
import atividadepratica3.Refrigerante;
/**
 *
 * @author Lázaro
 */
public class AtividadePratica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MaquinaDeRefrigerante m1 = new MaquinaDeRefrigerante(10, 0);
        Refrigerante r1 = new Refrigerante("ref1", 4.25);
        Refrigerante r2 = new Refrigerante("ref2", 4.00);
        Refrigerante r3 = new Refrigerante("ref3", 3.75);
        Refrigerante r4 = new Refrigerante("ref4", 6.20);
        Refrigerante r5 = new Refrigerante("ref5", 2.00);
        
        m1.recebeCredito(10); //tudo ok
        m1.escolherTipoRefri(r1.getNome(), r1.getValor());
        System.out.println("--------");
        
        m1.recebeCredito(4.25); // falta de estoque
        m1.escolherTipoRefri(r1.getNome(), r1.getValor());
        System.out.println("--------");
        
        m1.alteraEstoque(10, 1); //10 refrigerantes do refrigerante 1
        
        m1.recebeCredito(4.25); // tudo ok apos alterar o estoque
        m1.escolherTipoRefri(r1.getNome(), r1.getValor());
        System.out.println("--------");
        
        m1.recebeCredito(7.50); //cancelamento de venda durante a compra
        m1.cancelaVenda();
        m1.exibeCreditoAtual();
        System.out.println("--------");
        
        m1.recebeCredito(10);
        m1.escolherTipoRefri(r3.getNome(), r3.getValor());
        System.out.println("--------");
        
        m1.recebeCredito(10);
        m1.escolherTipoRefri(r2.getNome(), r2.getValor());
        System.out.println("--------");
        
        m1.recebeCredito(10);
        m1.escolherTipoRefri(r4.getNome(), r4.getValor());
        System.out.println("--------");
        
        m1.recebeCredito(10);
        m1.escolherTipoRefri(r5.getNome(), r5.getValor());
        System.out.println("--------");
        
    }
    
}
