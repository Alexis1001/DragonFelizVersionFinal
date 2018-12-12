
package dragon.feliz;

import java.util.ArrayList;



public class Ordenes {
 
private ArrayList<ArrayList<String>>ordenes;
private ArrayList<String>productos;
ArrayList<String>encontrados;  
ArrayList<String>numeros;
String parteprecios[];  
ArrayList<String>precios;
Double total;
public Ordenes(){

productos=new ArrayList<String>();
this.productos.add("Pasta Gruesa 13.5$");this.productos.add("Pasta Delgada 15$");this.productos.add("Arroz 10$");

this.productos.add("Apio 3$");this.productos.add("Chile 2$");this.productos.add("Cebolla 2$");
this.productos.add("Brocoli 5$");this.productos.add("Bambu 12.5$");this.productos.add("Berenjena 4$");
this.productos.add("Hongo 3$");this.productos.add("Calabaza 7$");this.productos.add("Zanahoria 3.5$");

this.productos.add("Huevo 13$");this.productos.add("Aguacate 15$");

this.productos.add("Pescado 13$");this.productos.add("Camaron 20$");this.productos.add("Cerdo 15$");
this.productos.add("Pollo 18.5$");this.productos.add("Cordero 12.5$");this.productos.add("Res 19$");

this.productos.add("Ostiones 5$");this.productos.add("Anguila 6$");

this.total=0.0;
encontrados=new ArrayList<String>();
numeros=new ArrayList<String>();
precios=new ArrayList<String>();
ordenes=new ArrayList<ArrayList<String>>();
}



  public void SetRcibirOrdenes(ArrayList<ArrayList<String>>ordenes){
    
    this.ordenes=ordenes;
    
 
 }
  
  public Double  GetTotalDecompra(){
     int columnas=0;
     total=0.0;
   for(int i=0;i<ordenes.size();i++){
       for(int j=0;j<ordenes.get(columnas).size();j++){
            for(int k=0;k<productos.size();k++){
                 if(ordenes.get(i).get(j).equals(productos.get(k))){
                    System.out.println("encontrado "+ordenes.get(i).get(j)); //borrar
                    encontrados.add(ordenes.get(i).get(j));
                 }
            }     
        }   
   columnas++;
   }
   
   
    for(int i=0;i<encontrados.size();i++){
       
       if(encontrados.get(i).equals(productos.get(0))){ 
          numeros.add(encontrados.get(i).substring(encontrados.get(i).length()-5,encontrados.get(i).length()));
       }      
       if(encontrados.get(i).equals(productos.get(1))){
          numeros.add(encontrados.get(i).substring(encontrados.get(i).length()-3,encontrados.get(i).length()));
       }
       if(!encontrados.get(i).equals(productos.get(0))&&!encontrados.get(i).equals(productos.get(1))){
          parteprecios=encontrados.get(i).split(" ");
          numeros.add(parteprecios[1]);
       }
       
    }
    
    for(int i=0;i<numeros.size();i++){
        precios.add(numeros.get(i).substring(0,numeros.get(i).length()-1));
    }
    
    for(int i=0;i<precios.size();i++){//borrar
        System.out.println("precios "+precios.get(i));
    }
    
    
    for(int i=0;i<precios.size();i++){
        total=total+Double.parseDouble(precios.get(i));
        System.out.println("sumatoria "+total);
    }
   //System.out.println("total perros metodo "+total);
    precios.clear();
    numeros.clear();
    encontrados.clear();
  //ordenes.clear();

    return total;
 } 

    
    
    
}
