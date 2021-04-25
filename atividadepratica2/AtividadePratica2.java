/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadepratica2;
import atividadepratica2.Funcionario;

/**
 *
 * @author Lázaro
 */
public class AtividadePratica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            LEMBRAR QUE O TIPO DE SALARIO ASSUME 2 TIPOS: 0 OU 1
                -0: FUNCIONARIO HORISTA
                -1: EFETIVO
        */
        
        Funcionario f1 = new Funcionario("Jodelvaldo", "15/06/1977");
        Funcionario f2 = new Funcionario("Isolde", "20/09/1992");
        
        f1.contratar(0, 1566.24, 2, "20/02/2021");
        f1.calcSalarioBruto(160, f1.getTipoContrato());
        f1.folhaDePagamento();
        
        f2.contratar(1, 20, 1, "20/02/2021");
        f2.calcSalarioBruto(160, f2.getTipoContrato());
        f2.folhaDePagamento();
        
        
        
    }
    
}
