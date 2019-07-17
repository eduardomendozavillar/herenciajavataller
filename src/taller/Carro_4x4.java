/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

/**
 *
 * @author Eduardo Mendoza
 *          Axel Martinez 
 */
public class Carro_4x4 extends Automoviles{
    private String tipomotor;
    private int númerodeasientos;
    
    public Carro_4x4(String marca, String placa, int numserie, int kilometraje, int cantidadcombustible,String tipomotor,int númerodeasientos ) {
        super(marca, placa, numserie, kilometraje, cantidadcombustible);
        this.tipomotor=tipomotor;
        this.númerodeasientos=númerodeasientos;
    }
    
     public String mostrar(){
        String resultado="";
        resultado = marca+ placa + numserie+ kilometraje+ cantidadcombustible+ tipomotor + Integer.toString(númerodeasientos);
        return resultado; 
    }
     
     public void settipomotor ( String tipomotor){
        this.tipomotor=tipomotor;
    }
}
