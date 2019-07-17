/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;
/**
 *
 * @author EduardoMendoza
 *          Axel Martinez
 */
public class Carro_Deportivo extends Automoviles {
    private double caballosdepotencia;
    private int númerodeasientos;
    private boolean turbo;
            
    
    public Carro_Deportivo(String marca, String placa, int numserie, int kilometraje, int cantidadcombustible,double caballosdepotencia,int númerodeasientos,boolean turbo) {
        super(marca, placa, numserie, kilometraje, cantidadcombustible);
        
        this.caballosdepotencia=caballosdepotencia;
        this.númerodeasientos=númerodeasientos;
        this.turbo=turbo;
    }
    
     public String mostrar(){
        String resultado="";
        String nitro="";
        if (this.turbo){
            nitro="si";
        }else{
            nitro="no";
        }
        resultado = marca+ placa + numserie+ kilometraje+ cantidadcombustible+ caballosdepotencia +Integer.toString(númerodeasientos)+ turbo;
        return resultado;
        
}
public void setcaballosdepotencia ( double caballosdepotencia){
        this.caballosdepotencia=caballosdepotencia;
    }
public void setturbo ( boolean turbo){
        this.turbo=turbo;
    }



}
