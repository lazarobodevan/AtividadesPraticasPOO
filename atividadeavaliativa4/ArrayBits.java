/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeavaliativa4;

import java.util.InputMismatchException;
import javax.naming.spi.DirStateFactory;

/**
 *
 * @author Lázaro
 */
public class ArrayBits {
    private int tamArray;
    private int array[];
    
    public ArrayBits(int tamArray){
        this.tamArray = tamArray;
        this.array = new int[tamArray];
    }
    
    public int[] getArray(){
        return this.array;
    }
    
    public int getBitPos(int pos){
        try{
            return this.array[pos]; //retorna o bit na posição passada
        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Erro: "+ e);
            System.err.println("Posição excede o tamanho do array.");
        }catch(NegativeArraySizeException e){
            System.out.println("Erro: "+e);
            System.out.println("Posição negativa. Insira um valor positivo.");
        }catch(InputMismatchException e){
            System.out.println("Erro: "+e);
            System.out.println("O valor deve ser um inteiro 0 ou 1!");
        }finally{
            return pos; //retorna a posição passada
        } 
    }
    
    public void setBitPos(int pos, int bit){
        boolean done = false;
        do{
            try{
                if(bit == 0 || bit == 1){
                    this.array[pos] = bit; //retorna o bit na posição passada
                    done = true;
                }else{
                    System.err.println("Insira 0 ou 1!");
                }
            }catch(ArrayIndexOutOfBoundsException e){
                System.err.println("Erro: "+ e);
                System.err.println("Posição excede o tamanho do array.");
            }catch(NegativeArraySizeException e){
                System.out.println("Erro: "+e);
                System.out.println("Posição negativa. Insira um valor positivo.");
            }catch(RuntimeException e){
                System.out.println("Erro: "+e);
                System.out.println("O valor deve ser um inteiro 0 ou 1!");
            }
        }while(!done);
    }
    
    @Override
    public String toString(){
        String s = "";
        for(int bit: array){
            s += bit;
        }
        return s;
    }
    
    public boolean equals(int vet[]){
        try{
            if(this.tamArray == vet.length){
                for(int i=0; i < tamArray; i++){
                    if(this.array[i] != vet[i])
                        return false;
                }
                return true;
            }
            return false;
        }catch(NullPointerException e){
            System.out.println("Erro: "+ e);
            System.out.println("Vetor passado não foi instanciado.");
        }
        return false;
    }
    
    public int[] AND(int vet[]){
        int result[] = null;
        int aux[] = null;
        try{
            boolean valido = true;
            for(int i = 0; i < vet.length; i++){
                if(vet[i] != 0 && vet[i] != 1){
                    valido = false;
                    break;   
                }
            }
            if(!valido){
                System.err.println("Vetor passado é inválida");
                return vet;
            }
            
            if(tamArray > vet.length){
                result = new int[tamArray];
                aux = new int[tamArray];
                for(int i = 0; i < vet.length; i++){
                    aux[tamArray-1-i] = vet[vet.length-1-i];
                }
                for(int i = 0; i < tamArray; i++){
                    result[i] = this.array[i] & aux[i];
                }
                return result;
                
            }else{
                result = new int[vet.length];
                aux = new int[vet.length];
                for(int i = 0; i < tamArray; i++){
                    aux[vet.length-1-i] = this.array[tamArray-1-i];
                }
                for(int i = 0; i < vet.length; i++){
                    result[i] = aux[i] & vet[i];
                }
                return result;
            }
        }catch(NullPointerException e){
            System.out.println("Erro: "+e);
            System.out.println("Vetor passado não foi inicializado.");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Erro: "+e);
            System.out.println("Excedido os limites do vetor");
        }
        return result;
    }
    
    public int[] OR(int vet[]){
        int result[] = null;
        int aux[] = null;
        try{
            boolean valido = true;
            for(int i = 0; i < vet.length; i++){
                if(vet[i] != 0 && vet[i] != 1){
                    valido = false;
                    break;   
                }
            }
            if(!valido){
                System.err.println("Vetor passado é inválida");
                return vet;
            }
            
            if(tamArray > vet.length){
                result = new int[tamArray];
                aux = new int[tamArray];
                for(int i = 0; i < vet.length; i++){
                    aux[tamArray-1-i] = vet[vet.length-1-i];
                }
                for(int i = 0; i < tamArray; i++){
                    result[i] = this.array[i] | aux[i];
                }
                return result;
                
            }else{
                result = new int[vet.length];
                aux = new int[vet.length];
                for(int i = 0; i < tamArray; i++){
                    aux[vet.length-1-i] = this.array[tamArray-1-i];
                }
                for(int i = 0; i < vet.length; i++){
                    result[i] = aux[i] | vet[i];
                }
                return result;
            }
        }catch(NullPointerException e){
            System.out.println("Erro: "+e);
            System.out.println("Vetor passado não foi inicializado.");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Erro: "+e);
            System.out.println("Excedido os limites do vetor");
        }
        return result;
    }
    
    public int[] NOT(){
        int result[] = new int[tamArray];
        try{
            for(int i = tamArray-1; i > 0; i--){
                result[i] = ~this.array[i]+2;
            }
            return result;
        }catch(NullPointerException e){
            System.out.println("Erro: "+e);
            System.out.println("Vetor não foi inicializado.");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Erro: "+e);
            System.out.println("Excedido os limites do vetor");
        }
        return result;
    }
}
