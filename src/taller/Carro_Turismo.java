
package taller;
/**
 *
 * @author EduardoMendoza
 *          Axel Martinez
 */
public class Carro_Turismo  extends Automoviles{
    private String tipo,tipomotor;
    private int numpuertas;
    
    public Carro_Turismo(String marca, String placa, int numserie, int kilometraje, int cantidadcombustible, String tipo, int numpuertas, String tipomotor) {
        super(marca, placa, numserie, kilometraje, cantidadcombustible);
        
        this.tipo=tipo;
        this.numpuertas=numpuertas;
        this.tipomotor=tipomotor;
    }
     public String mostrar(){
        String resultado="";
        resultado ="Marca: "+ marca+  " Placa: "+ placa + " Numero de serie: "+ Integer.toString(numserie)+ " Kilometraje: "+ Integer.toString(kilometraje) +" K/h " +  " Cantidad de combustible: "+ Integer.toString(cantidadcombustible)+"Ltrs"+ 
                   "Tipo: "+tipo +"Tipo motor:"+tipomotor  + "Numero de puertas: "+ Integer.toString(numpuertas) ;
        return resultado; 
    }
     
      public void setnumpuertas ( int  numpuertas){
        this.numpuertas=numpuertas;
    }
}
