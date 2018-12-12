/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dragon.feliz;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class MostrarOrdenes {
    private ArrayList<ArrayList<String>>ordenes;
    private String nombrefichero;
    private String nombreCliente;
    private String totalPlatillos;
    private int fila;
    private String parte1;    
    private String parte2;
    private String parte3;
    private String parte4;
    private String parte5;
    private String parte6;
    private String parte7;
    private String parte8;
    private String parte9;
    private String parte10,parte11,parte12,parte13,parte14,parte15,parte16,
    parte17,parte18;
    private String TodasLasOrdenes;
    private double subtotal,iva,total,recibido,cambio;
    private double totales;
    public MostrarOrdenes(){
    
    }
    
   public MostrarOrdenes(String nombrefichero,ArrayList<ArrayList<String>>ordenes,String nombreCliente,String totalPlatillos,
   double subtotal,double iva,double total,double recibido,double cambio){
    this.nombrefichero=nombrefichero;
    this.nombreCliente=nombreCliente;
    this.totalPlatillos=totalPlatillos;
    this.ordenes=ordenes;
    this.subtotal=subtotal;
    this.iva=iva;
    this.total=total;
    this.recibido=recibido;
    this.cambio=cambio;
    
    parte1= "Dragon Feliz S.A DE C.V";
    parte2="EXPEDIDO EN: tuxtla gutierrez,chiapas";
    parte3="DOMICILIO :  colonia nopalera";
    parte4="======================================";
    parte5="TUXTLA GUTIERREZ,CHIAPAS";
    parte6="RFC: 222-020226-009";
    parte7="Caja #1 dragon feliz";
    parte8="LE ATENDIO : Alexis Perez Gomez";
    parte9="FECHA : 7/12/2018\n";
       
    parte10="SUBTOTAL : "+subtotal;
    parte11="IVA : "+iva;
    parte12="TOTAL : "+total;
    parte13="RECIBIDO : "+recibido;
    parte14="CAMBIO : "+cambio;
    parte15="=====================================";
    parte16="DRAGON FELIZ NUESTRA PASION ES ATENDERTE";
    parte17="GRACIAS POR SU COMPRA";
    parte18="Dragon Feliz S.A DE C.V";
  
   
    
   }
   
   public MostrarOrdenes(ArrayList<ArrayList<String>>ordenes,String nombreCliente,String totalPlatillos){
    this.TodasLasOrdenes="";
    this.ordenes=ordenes;
    this.nombreCliente=nombreCliente;
    this.totalPlatillos=totalPlatillos;
   }
   
   public void SetFinDia(double totales){
    this.totales=totales;
   
   }
   
   public void GetEscribirFindia(){
     File archivo;
     FileWriter escribir;
     PrintWriter linea;
     archivo=new File(nombrefichero);
   
    if(!archivo.exists()){
        try{
           archivo.createNewFile();
           escribir=new FileWriter(archivo,true);
           linea=new PrintWriter(escribir);
           linea.println(parte1);linea.println(parte2);linea.println(parte3);linea.println(parte4);
           linea.println(parte5);linea.println(parte6);linea.println(parte7);linea.println(parte8);linea.println(parte9);
           linea.println(" ");
           linea.println(nombreCliente+" ordenes : "+totalPlatillos);
           linea.println(" ");
           int fila = 1;
           for(int i=1;i<ordenes.size();i++){
               linea.println("Orden :"+String.valueOf(fila));
               for(int j=0;j<ordenes.get(fila).size();j++){
                   linea.println(ordenes.get(i).get(j));
                }
           linea.println(" "); 
           fila++;
           }
        linea.println(parte10);linea.println(parte11);linea.println(parte12);linea.println(parte13);
        linea.println(parte14);linea.println(parte15);linea.println(parte16);linea.println(parte17);linea.println(parte18);
        linea.println(" ");
        linea.println(" ");
        linea.close();
        escribir.close();
        
        }catch(Exception e){
         System.out.println("Error ala ora de crear");
         }
    }
    else{
       try{
          escribir=new FileWriter(archivo,true);
          linea=new PrintWriter(escribir);
          linea=new PrintWriter(escribir);
          linea.println(parte1);linea.println(parte2);linea.println(parte3);linea.println(parte4);
          linea.println(parte5);linea.println(parte6);linea.println(parte7);linea.println(parte8);linea.println(parte9);
          linea.println(" ");
          linea.println(nombreCliente+" ordenes : "+totalPlatillos);
          linea.println(" ");
          int fila = 1;
            for(int i=1;i<ordenes.size();i++){
                for(int j=0;j<ordenes.get(fila).size();j++){
                    linea.println(ordenes.get(i).get(j));
                }
                linea.println(" ");
                linea.println("Orden :"+String.valueOf(fila));
                fila++;
            }
        linea.println(parte10);linea.println(parte11);linea.println(parte12);linea.println(parte13);
        linea.println(parte14);linea.println(parte15);linea.println(parte16);linea.println(parte17);linea.println(parte18);
        linea.println("MONTO TOTAL DE TODAS LAS VENTAS "+totales);
        linea.close();
        escribir.close();
        }catch(Exception e){
           System.out.println("Error");
          }
    }
      
   
   
   }
    
   public void EscribirArchivo(){
   
    File archivo;
    FileWriter escribir;
    PrintWriter linea;
    archivo=new File(nombrefichero);
   
    if(!archivo.exists()){
        try{
           archivo.createNewFile();
           escribir=new FileWriter(archivo,true);
           linea=new PrintWriter(escribir);
           linea.println(parte1);linea.println(parte2);linea.println(parte3);linea.println(parte4);
           linea.println(parte5);linea.println(parte6);linea.println(parte7);linea.println(parte8);linea.println(parte9);
           linea.println(" ");
           linea.println(nombreCliente+" ordenes : "+totalPlatillos);
           linea.println(" ");
           int fila = 1;
           for(int i=1;i<ordenes.size();i++){
               linea.println("Orden :"+String.valueOf(fila));
               for(int j=0;j<ordenes.get(fila).size();j++){
                   linea.println(ordenes.get(i).get(j));
                }
           linea.println(" "); 
           fila++;
           }
        linea.println(parte10);linea.println(parte11);linea.println(parte12);linea.println(parte13);
        linea.println(parte14);linea.println(parte15);linea.println(parte16);linea.println(parte17);linea.println(parte18);
        
        linea.close();
        escribir.close();
        
        }catch(Exception e){
         System.out.println("Error ala ora de crear");
         }
    }
    else{
       try{
          escribir=new FileWriter(archivo,true);
          linea=new PrintWriter(escribir);
          linea=new PrintWriter(escribir);
          linea.println(parte1);linea.println(parte2);linea.println(parte3);linea.println(parte4);
          linea.println(parte5);linea.println(parte6);linea.println(parte7);linea.println(parte8);linea.println(parte9);
          linea.println(" ");
          linea.println(nombreCliente+" ordenes : "+totalPlatillos);
          linea.println(" ");
          int fila = 1;
            for(int i=1;i<ordenes.size();i++){
                linea.println("Orden :"+String.valueOf(fila));
                for(int j=0;j<ordenes.get(fila).size();j++){
                    linea.println(ordenes.get(i).get(j));
                }
                linea.println(" ");
                
                fila++;
            }
        linea.println(parte10);linea.println(parte11);linea.println(parte12);linea.println(parte13);
        linea.println(parte14);linea.println(parte15);linea.println(parte16);linea.println(parte17);linea.println(parte18);
            
        linea.close();
        escribir.close();
        }catch(Exception e){
           System.out.println("Error");
          }
    }
      
        
}
   
   public void abrirarchivo(String archivo){
     try {
       File Documento = new File (archivo);
       Desktop.getDesktop().open(Documento);
     }catch (Exception e) {
      System.out.println("Error"); 
     }
  
 }
 
 public void eliminarFichero(File fichero) {

    if (!fichero.exists()) {
        System.out.println("El archivo data no existe.");
    } else {
        fichero.delete();
        System.out.println("El archivo data fue eliminado.");
    }

}
   
   
   
  public String GetDebuelbeOrdenes(){
      fila=1;
        
    TodasLasOrdenes=TodasLasOrdenes+"Nombre del cliente  "+this.nombreCliente+" Cantidad de ordenes "+this.totalPlatillos+"\n"+"\n";
         
     for(int i=1;i<ordenes.size();i++){
         TodasLasOrdenes=TodasLasOrdenes+"ORDEN  : "+String.valueOf(i)+"\n";
         for(int j=0;j<ordenes.get(fila).size();j++){
             TodasLasOrdenes=TodasLasOrdenes+ordenes.get(i).get(j)+"\n";
         }
         TodasLasOrdenes=TodasLasOrdenes+"\n";
         fila++;        
     }      
    return TodasLasOrdenes;  
  }
  
   
    
    
}
