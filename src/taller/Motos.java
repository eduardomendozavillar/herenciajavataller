
package taller;
/**
 *
 * @author EduardoMendoza
 *          Axel Martinez
 */
public class Motos extends Automoviles {
   
    public Motos(String marca, String placa, int numserie, int kilometraje, int cantidadcombustible) {
        super(marca, placa, numserie, kilometraje, cantidadcombustible);
    }
    
    
     public String mostrar(){
        String resultado="";
        resultado ="Marca: "+ marca+ " Placa: "+ placa + " Numero de serie: "+ numserie + " Kilometraje: "+  kilometraje + " K/h " + 
                " Cantidad de combustible: "+  cantidadcombustible +"Ltrs";
        return resultado; 
    }
}
