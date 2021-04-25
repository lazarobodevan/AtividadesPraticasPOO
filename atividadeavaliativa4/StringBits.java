/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeavaliativa4;

/**
 *
 * @author Lázaro
 */
public class StringBits extends ArrayBits{
    
    private String bits;
    
    public StringBits(int tamArray) {
        super(tamArray);
        this.bits = "";
    }
    
    
    public String getString(){
        return this.bits;
    }
    
    public void setBits(String s){
        boolean valido = true;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != '0' && s.charAt(i) != '1'){
                valido = false;
                break;   
            }
        }
        if(valido)
            this.bits = s;
        else
            System.out.println("String invalida");
    }
    
    @Override
    public int getBitPos(int pos){
        try{
            return (int) this.bits.charAt(pos); //retorna o bit na posição passada
        }catch(StringIndexOutOfBoundsException e){
            System.err.println("Erro: "+ e);
            System.err.println("Posição excede o tamanho da String.");
        }finally{
            return pos; //retorna a posição passada
        } 
    }
    
    @Override
    public void setBitPos(int pos, int bit){
        boolean done = false;
        StringBuilder sBits = new StringBuilder(bits);
        try{
            if(bit == 0 || bit == 1){
                sBits.setCharAt(pos, (char)(bit+'0'));
                this.bits = sBits.toString();
                done = true;
            }else{
                System.err.println("Insira 0 ou 1!");
            }
        }catch(StringIndexOutOfBoundsException e){
            System.err.println("Erro: "+ e);
            System.err.println("Posição excede o tamanho da String.");
        }
    }
    
    public boolean equals(String bit2){
        try{
            return this.bits.equals(bit2);
        }catch(NullPointerException e){
            System.err.println("Erro: "+ e);
            System.err.println("String passada não foi instanciado.");
        }
        return false;
    }
    
    
    
    public String AND(String bit2){
        int result[] = null;
        int vet[] = new int[bit2.length()];
        int array[] = new int[this.bits.length()];
        int aux[] = null;
        String resultado="";
        
        try{
            int tamArray = this.bits.length();
            
            boolean valido = true;
            for(int i = 0; i < bit2.length(); i++){
                if(bit2.charAt(i) != '0' && bit2.charAt(i) != '1'){
                    valido = false;
                    break;   
                }
            }
            if(!valido){
                System.err.println("String passada é inválida");
                return "";
            }
            
            for(int i = 0; i < bit2.length(); i++){
                vet[i] = Character.getNumericValue(bit2.charAt(i));
            }
            for(int i = 0; i < this.bits.length(); i++){
                array[i] = Character.getNumericValue(this.bits.charAt(i));
            }
            
            if(tamArray > vet.length){
                result = new int[tamArray];
                aux = new int[tamArray];
                for(int i = 0; i < vet.length; i++){
                    aux[tamArray-1-i] = vet[vet.length-1-i];
                }
                for(int i = tamArray-1; i > 0; i--){
                    result[i] = array[i] & aux[i];
                }
                
                for(int i = 0; i< tamArray; i++){
                    resultado += (char)(result[i]+'0'); ;
                }
                return resultado;
                
            }else{
                result = new int[vet.length];
                aux = new int[vet.length];
                for(int i = 0; i < tamArray; i++){
                    aux[vet.length-1-i] = array[tamArray-1-i];
                }
                for(int i = 0; i < vet.length; i++){
                    result[i] = aux[i] & vet[i];
                }
                
                
                for(int i = 0; i< result.length; i++){
                    resultado += (char)(result[i]+'0'); ;
                }
                return resultado;
            }
        }catch(NullPointerException e){
            System.err.println("Erro: "+e);
            System.err.println("Vetor passado não foi inicializado.");
        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Erro: "+e);
            System.err.println("Excedido os limites do vetor");
        }
        return resultado;
    }
    
    public String OR(String bit2){
        int result[] = null;
        int vet[] = new int[bit2.length()];
        int array[] = new int[this.bits.length()];
        int aux[] = null;
        String resultado="";
        try{
            boolean valido = true;
            for(int i = 0; i < bit2.length(); i++){
                if(bit2.charAt(i) != '0' && bit2.charAt(i) != '1'){
                    valido = false;
                    break;   
                }
            }
            if(!valido){
                System.err.println("String passada é inválida");
                return "";
            }
            
            int tamArray = this.bits.length();
            
            
            for(int i = 0; i < bit2.length(); i++){
                vet[i] = Character.getNumericValue(bit2.charAt(i));
            }
            for(int i = 0; i < this.bits.length(); i++){
                array[i] = Character.getNumericValue(this.bits.charAt(i));
            }
            
            if(tamArray > vet.length){
                result = new int[tamArray];
                aux = new int[tamArray];
                for(int i = 0; i < vet.length; i++){
                    aux[tamArray-1-i] = vet[vet.length-1-i];
                }
                for(int i = tamArray-1; i > 0; i--){
                    result[i] = array[i] | aux[i];
                }
                
                for(int i = 0; i< tamArray; i++){
                    resultado += (char)(result[i]+'0'); ;
                }
                return resultado;
                
            }else{
                result = new int[vet.length];
                aux = new int[vet.length];
                for(int i = 0; i < tamArray; i++){
                    aux[vet.length-1-i] = array[tamArray-1-i];
                }
                for(int i = 0; i < vet.length; i++){
                    result[i] = aux[i] | vet[i];
                }
                
                
                for(int i = 0; i< result.length; i++){
                    resultado += (char)(result[i]+'0'); ;
                }
                return resultado;
            }
        }catch(NullPointerException e){
            System.err.println("Erro: "+e);
            System.err.println("Vetor passado não foi inicializado.");
        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Erro: "+e);
            System.err.println("Excedido os limites do vetor");
        }
        return resultado;
    }
    
    
    @Override
    public int[] NOT(){
        int result[] = new int[this.bits.length()];
        int tamArray = this.bits.length();
        try{
            for(int i = 0; i < tamArray; i++){
                result[i] = ~(Character.getNumericValue(this.bits.charAt(i)))+2;
            }
            return result;
        }catch(StringIndexOutOfBoundsException e){
            System.err.println("Erro: "+e);
            System.err.println("Excedido os limites da String");
        }
        return result;
    }
}
    
    
