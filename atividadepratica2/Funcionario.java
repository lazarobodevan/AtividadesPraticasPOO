/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadepratica2;

/**
 *
 * @author Lázaro
 */
public class Funcionario {
    private String nome;
    private String dataNas;
    private int tipoContrato; //0 ou 1
    private double salario; //qtd por hora ou o total caso seja efetivo
    private int numFilhoMenor;
    private String dataAdmissao;
    
    private double salarioBruto; //atributo auxiliar
    
    public Funcionario(String nome, String dataNas){
        this.nome = nome;
        this.dataNas = dataNas;
        this.tipoContrato = 0;
        this.salario = 0;
        this.numFilhoMenor = 0;
        this.dataAdmissao = "00/00/0000";
    }
    
    public int contratar(int tipoContrato, double salario, int numFilhosMenor, String dataAdmissao){
        this.tipoContrato = tipoContrato;
        this.salario = salario;
        this.numFilhoMenor = numFilhosMenor;
        this.dataAdmissao = dataAdmissao;
        return 1;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNas() {
        return dataNas;
    }

    public int getTipoContrato() {
        return tipoContrato;
    }

    public double getSalario() {
        return salario;
    }

    public int getNumFilhoMenor() {
        return numFilhoMenor;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setTipoContrato(int tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setNumFilhoMenor(int numFilhoMenor) {
        this.numFilhoMenor = numFilhoMenor;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
    
    public double calcSalarioBruto(int horas, int tipoContrato){ 
        if(this.tipoContrato == 0){ // efetivo
            this.salarioBruto = this.salario;
            return 0;
        }else if(this.tipoContrato == 1){ //horista
            this.salarioBruto =  horas * this.salario;
            return 0;
        }else{
            return 1;
        }
    }
    
    public double descontoINSS(){
        if(this.salarioBruto <= 1659.38){
            return this.salarioBruto * 0.08;
        }else if(this.salarioBruto > 1659.38 && this.salarioBruto <= 2765.66){
            return this.salarioBruto * 0.09;
        }else if(this.salarioBruto > 2765.66 && this.salarioBruto <= 5521.21){
            return this.salarioBruto * 0.11;
        }else
            return 5531.31 * 0.11;
    }
    
    public double descontoIR(){
        double salario = this.salarioBruto - this.descontoINSS();
        if(salario <= 1903.98){
            return 0;
        }else if(salario >= 1903.99 && salario <=2826.65){
            return (salario * 0.075) - 142.8;
        }else if(salario >= 2826.66 && salario <= 3751.05){
            return (salario * 0.15) - 354.8;
        }else if(salario >= 3751.06 && salario <= 4664.68){
            return (salario * 0.225) - 636.13;
        }else
            return (salario * 0.275) - 869.36;
    }
    
    public double calcSalarioLiquido(){
        return this.salarioBruto - (this.descontoINSS() + this.descontoIR());
    }
    
    public void folhaDePagamento(){
        System.out.println("-------------Folha de Pagamento-------------");
        System.out.println("Nome: "+ this.nome);
        System.out.println("Data de Nascimento: "+ this.dataNas);
        System.out.println("Salario Bruto: "+ this.salarioBruto);
        System.out.print("Tipo de contrato: ");
        
        if(this.tipoContrato == 0){
            System.out.println("Efetivo");
        }else
            System.out.println("Horista");
        
        System.out.println("Descontos IR: " + this.descontoIR());
        System.out.println("Descontos INSS: " + this.descontoINSS());
        System.out.println("Descontos Totais: "+ (this.descontoINSS() + this. descontoIR()));
        System.out.println("Salario Liquido: " + this.calcSalarioLiquido());
        System.out.println("");
    }
    
    
}
