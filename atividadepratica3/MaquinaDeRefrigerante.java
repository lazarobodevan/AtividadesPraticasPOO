/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadepratica3;
import atividadepratica3.Refrigerante;
/**
 *
 * @author Lázaro
 */
public class MaquinaDeRefrigerante {
    private double saldo;
    private int qtdRefrigerantes[] = {1, 7, 3, 4, 5};
    private double creditoAtual;

    public MaquinaDeRefrigerante(double saldo, double creditoAtual) {
        this.saldo = saldo;
        this.creditoAtual = creditoAtual;
    }
    
    public void recebeCredito(double credito){
        this.creditoAtual = 0;
        this.creditoAtual += credito;
    }
    
    public void exibeCreditoAtual(){
        System.out.println(this.creditoAtual);
    }
    
    public void cancelaVenda(){
        System.out.println("Venda cancelada.");
        this.saldo -= this.creditoAtual;
        this.creditoAtual = 0;
    }
    
    
    public void escolherTipoRefri(String tipoRefri, double valorRefri){
        //para finalizar o pedido, o refrigerante tem que ter seu nome encontrado, quantidade disponivel e creditos suficientes
            if(tipoRefri.equals("ref1") && qtdRefrigerantes[0] >0 && this.creditoAtual >= valorRefri){
                System.out.println("Receba seu refrigerante!");
                qtdRefrigerantes[0]--;
                System.out.println("Troco = R$"+ (this.creditoAtual - valorRefri));
                this.saldo += valorRefri;
            }else if(tipoRefri.equals("ref2") && qtdRefrigerantes[1] >0 && this.creditoAtual >= valorRefri){
                System.out.println("Receba seu refrigerante!");
                qtdRefrigerantes[1]--;
                System.out.println("Troco = R$"+ (this.creditoAtual - valorRefri));
                this.saldo += valorRefri;
            }else if(tipoRefri.equals("ref3") && qtdRefrigerantes[2] >0 && this.creditoAtual >= valorRefri){
                System.out.println("Receba seu refrigerante!");
                qtdRefrigerantes[2]--;
                System.out.println("Troco = R$"+ (this.creditoAtual - valorRefri));
                this.saldo += valorRefri;
            }else if(tipoRefri.equals("ref4") && qtdRefrigerantes[3] >0 && this.creditoAtual >= valorRefri){
                System.out.println("Receba seu refrigerante!");
                qtdRefrigerantes[3]--;
                System.out.println("Troco = R$"+ (this.creditoAtual - valorRefri));
                this.saldo += valorRefri;
            }else if(tipoRefri.equals("ref5") && qtdRefrigerantes[4] >0 && this.creditoAtual >= valorRefri){
                System.out.println("Receba seu refrigerante!");
                qtdRefrigerantes[4]--;
                System.out.println("Troco = R$"+ (this.creditoAtual - valorRefri));
                this.saldo += valorRefri;
            }else{
                System.out.println("Refrigerante indisponivel");
                System.out.println("Troco = R$"+ this.creditoAtual);
                this.cancelaVenda();
            }
    }
    
    public void alteraEstoque(int qtd, int posicao){
        if((qtd >= 0 && qtd <=20) && (posicao-1 >=0 && posicao-1 < 5))
            this.qtdRefrigerantes[posicao-1] = qtd;
    }
}
