/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dragon.feliz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author PC
 */
public class Cliente {
    
  
  int NumeroDeOrdenes;
  
  private String nombre;
  private String letras="[^a-zA-Z]";
  private boolean error=false;
  private String  NombreSinEspacioBlanco="";
 
  public Cliente(String nombre, int NumeroDeOrdenes){
   this.nombre=nombre;
   this.NumeroDeOrdenes=NumeroDeOrdenes;
   }
  
   public Cliente(){
   
   } 

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
  
    public boolean getNombreBoolean() {
       
      for(int i=0;i<nombre.length();i++){
          if (nombre.charAt(i)!=' '){
              NombreSinEspacioBlanco= NombreSinEspacioBlanco+nombre.charAt(i);
              }
          }
     Pattern patron1=Pattern.compile(letras);
     Matcher matcher1=patron1.matcher(NombreSinEspacioBlanco);
     while(matcher1.find()){
           error=true;
           break;
     }
    return error;  
        
    }
    
    public String GetNombre(){
     return nombre;
    }
    
    public void setNumeroDeOrdenes(int NumeroDeOrdenes) {
       this.NumeroDeOrdenes = NumeroDeOrdenes;
    }

    public int getNumeroDeOrdenes() {
      return NumeroDeOrdenes;
    }
    
     
    
}
