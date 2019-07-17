
package taller;
/**
 *
 * @author EduardoMendoza
 *          Axel Martinez
 */
public class Automoviles {
    
    protected String marca,placa;
    protected int numserie,kilometraje,cantidadcombustible;

    public Automoviles(String marca, String placa, int numserie, int kilometraje, int cantidadcombustible) {
        this.marca = marca;
        this.placa = placa;
        this.numserie = numserie;
        this.kilometraje = kilometraje;
        this.cantidadcombustible = cantidadcombustible;
    }
    
    public String mostraraInfo(){
        String resultado="";
        resultado = marca+ placa + Integer.toString(numserie)+ Integer.toString(kilometraje)+ Integer.toString(cantidadcombustible);
        return resultado; 
    }
    
    public void setnumserie (int numserie){
        this.numserie=numserie;
    }
     public void setkilometraje (int kilometraje){
        this.kilometraje=kilometraje;
    }
      public void setcantidadcombustible (int cantidadcombustible){
        this.cantidadcombustible=cantidadcombustible;
    }
    
    
    
    
}
