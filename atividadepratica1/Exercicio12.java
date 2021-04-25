/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadepratica1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Lázaro
 */
public class Exercicio12 {
    public static void main(String []args) throws IOException{
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<String> sexos = new ArrayList<>();
        ArrayList<Double> pesos = new ArrayList<>();
        ArrayList<Integer> idades = new ArrayList<>();
        ArrayList<Double> alturas = new ArrayList<>();
        
        double mediaIdadeHomem = 0;
        int mulheresAlturaPeso = 0;
        int countIdade18e25 = 0;
        int maiorIdade = 0;
        double menorAltura = 0;
        
        BufferedReader buffRead = new BufferedReader(new FileReader("C:\\Users\\Lázaro\\Desktop"
                + "\\Lázaro\\UFV\\PER-2\\POO\\Projetos\\AtividadePratica1\\src"
                + "\\atividadepratica1\\pacientes.txt"));
		String linha = "";
		while (true) { //leitura do arquivo
			linha = buffRead.readLine();
                        if(linha == null)
                            break;
                        nomes.add(linha);
                        
                        linha = buffRead.readLine();
                        sexos.add(linha);
                        
                        linha = buffRead.readLine();
                        pesos.add(Double.parseDouble(linha));
                        
                        linha = buffRead.readLine();
                        idades.add(Integer.parseInt(linha));
                        
                        linha = buffRead.readLine();
                        alturas.add(Double.parseDouble(linha));
		}
		buffRead.close();
                
                 //calcula a idade media dos homens
                for(int i = 0; i < nomes.size(); i++){
                    if(sexos.get(i).equals("M")){
                        mediaIdadeHomem += idades.get(i);
                    }
                }
                
                //calcula quantas mulheres com altura entre 1.6 e 1.7 com peso maior que 70kg
                for(int i = 0; i < nomes.size(); i++){
                    if(sexos.get(i).equals("F")){
                        if((alturas.get(i) >= 1.6 && alturas.get(i) <= 1.7) && (pesos.get(i) > 70)){
                            mulheresAlturaPeso++;
                        }
                    }
                }
                
                //calcula quantas pessoas tem idade entre 18 e 25 anos
                for(int i = 0; i < nomes.size(); i++){
                    if(idades.get(i) >= 18 && idades.get(i) <= 25){
                        countIdade18e25++;
                    }
                }
               
                //encontra o paciente com mais idade
                maiorIdade = idades.get(0);
                int indiceIdade = 0;
                for(int i = 1; i < nomes.size(); i++){
                    if(idades.get(i) > maiorIdade){
                        maiorIdade = idades.get(i);
                        indiceIdade = i;
                    }
                }
                
                //encontra a mulher mais baixa
                menorAltura = alturas.get(0);
                int indiceAltura = 0;
                for(int i = 0; i < nomes.size(); i++){
                    if(sexos.get(i).equals("F")){
                        if(alturas.get(i) < menorAltura){
                            menorAltura = alturas.get(i);
                            indiceAltura = i;
                        }
                    }
                }
                
                
           //-----------------RelatorioFinal------------------     
                System.out.println("Quantidade de pacientes: "+nomes.size());
                System.out.println("Media da Idade dos Homens: "+(mediaIdadeHomem/nomes.size()));
                System.out.println("Mulheres com altura entre 1.6 e 1.7 com mais de 70Kg: "+mulheresAlturaPeso);
                System.out.println("Qtd de pessoas com idade entre 18 e 25 anos: "+countIdade18e25);
                System.out.println("Paciente mais velho: "+nomes.get(indiceIdade));
                System.out.println("Mulher mais baixa: "+nomes.get(indiceAltura));
    }
}
