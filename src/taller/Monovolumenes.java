
package taller;
/**
 *
 * @author EduardoMendoza
 *          Axel Martinez
 */
public class Monovolumenes  extends Automoviles{
    private boolean puertaslaterales;
      private  String tipomotor ;
       private int numpuertas,númerodeasientos;
       private double capacidaddecarga;
               
    
    public Monovolumenes(String marca, String placa, int numserie, int kilometraje, int cantidadcombustible, boolean puertaslaterales,String tipomotor,
            int numpuertas,int númerodeasientos,double capacidaddecarga) {
        super(marca, placa, numserie, kilometraje, cantidadcombustible);
        this.puertaslaterales=puertaslaterales;
        this.tipomotor=tipomotor;
        this.numpuertas=numpuertas;
        this.númerodeasientos=númerodeasientos;
        this.capacidaddecarga=capacidaddecarga;
    }
     public String mostrar(){
        String resultado="";
         String puertas="";
        if (this.puertaslaterales){
            puertas="si";
        }else{
            puertas="no";
        }
        resultado = marca+ placa + numserie+ kilometraje+ cantidadcombustible+ tipomotor + Integer.toString(númerodeasientos)+ 
                puertaslaterales+ tipomotor + Integer.toString(numpuertas)+ Double.toString(capacidaddecarga);
        return resultado; 
    }
      public void settipomotor ( String tipomotor){
        this.tipomotor=tipomotor;
    }
      public void setcapacidaddecarga ( double capacidaddecarga){
        this.capacidaddecarga=capacidaddecarga;
    }
}
