
package Factura;

/**
 *
 * @author Lenin
 */
public class Factura {
    
    String nombre;
    String direccion;
    String correo;
     int ruc;
    int telefono;
   
    
   public  Factura (String nombre, String correo,String direccion,int ruc,int telefono){
        this.nombre=nombre;
        this.correo=correo;
        this.direccion=direccion;
        this.ruc=ruc;
        this.telefono=telefono;
     
    }     
    void Recibo (){
     System.out.println("Farmacia Cuxibamba ");
     System.out.println("comprobante nº1123092");
     System.out.println("Av.Universitaria y 18 de Noviembre");
     System.out.println("El nombre del cliente es  "+nombre);
     System.out.println("El correo es : "+correo);
     System.out.println("La direccion es : "+direccion);
     System.out.println("Su numero de ruc es :"+ruc);
     System.out.println("Su numero de Telefono es :"+telefono);
      }
    }
 

 
