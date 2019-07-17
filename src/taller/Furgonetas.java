
package taller;
/**
 *
 * @author EduardoMendoza
 *          Axel Martinez
 */
public class Furgonetas extends Automoviles {
           private double capacidaddecarga;
           private double altura;

    
    public Furgonetas(String marca, String placa, int numserie, int kilometraje, int cantidadcombustible,double capacidaddecarga, double altura) {
        super(marca, placa, numserie, kilometraje, cantidadcombustible);
        this.capacidaddecarga=capacidaddecarga;
        this.altura=altura;
     }
    
    
    public String mostrar(){
        String resultado="";
       
        resultado = marca+ placa + numserie+ kilometraje+ cantidadcombustible+ Double.toString(capacidaddecarga) + Double.toString(altura);
        return resultado; 
}
     public void setcapacidaddecarga (double capacidaddecarga){
        this.capacidaddecarga=capacidaddecarga;
    }
}
