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
public class AtividadeAvaliativa4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //------------------------------------------
        //---------IMPLEMENTACAO COM ARRAY
        //-----------------------------------------
        
        
        int resultado[];
        
        ArrayBits a = new ArrayBits(2);
        a.setBitPos(0,1);
        a.setBitPos(1, 1);
        
        ArrayBits b = new ArrayBits(2);
        b.setBitPos(0,1);
        b.setBitPos(1, 1);
        
        ArrayBits c = new ArrayBits(3);
        c.setBitPos(0,1);
        c.setBitPos(1, 0);
        c.setBitPos(2, 0);
        
        resultado = a.AND(b.getArray());
        System.out.println("AND");
        for(int i: resultado){
            System.out.print(i);
        }
        
        resultado = a.OR(b.getArray());
        System.out.println("\nOR");
        for(int i: resultado){
            System.out.print(i);
        }
        
        System.out.println("\nNOT");
        for(int i: a.NOT()){
            System.out.print(i);
        }
        
        System.out.println("\nEquals");
        System.out.println(a.equals(b.getArray()));
        
        System.out.println("AND diff size");
        resultado = a.AND(c.getArray());
        for(int i: resultado){
            System.out.print(i);
        }
        
        System.out.println("\nOR diff size");
        resultado = a.OR(c.getArray());
        for(int i: resultado){
            System.out.print(i);
        }
        System.out.println("");
        
        //------------------------------------------
        //---------IMPLEMENTACAO COM STRING
        //-----------------------------------------
        System.out.println("--------------------------");
        StringBits d = new StringBits(2);
        d.setBits("11");
        
        StringBits e = new StringBits(2);
        e.setBits("11");
        
        StringBits f =  new StringBits(3);
        f.setBits("100");
        
        System.out.println("AND");
        System.out.println(d.AND(e.getString()));
        
        System.out.println("OR");
        System.out.println(d.OR(e.getString()));
        
        System.out.println("EQUALS");
        System.out.println(d.equals(e.getString()));
        
        System.out.println("AND diff size");
        System.out.println(d.AND(f.getString()));
        
        System.out.println("OR diff size");
        System.out.println(d.OR(f.getString()));
    }
    
}
