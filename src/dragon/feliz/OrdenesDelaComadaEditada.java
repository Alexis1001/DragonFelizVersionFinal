
package dragon.feliz;

import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;







public class OrdenesDelaComadaEditada {
    
    private CheckBox apio;
    private CheckBox zanahoria;
    private CheckBox cebolla;
    private CheckBox chile;
    private CheckBox calabaza;
    private CheckBox berenjena;
    private CheckBox hongos;
    private CheckBox bambu;
    private CheckBox brocoli;
    private CheckBox Camaron;
    private CheckBox Pescado;
    private CheckBox Res;
    private CheckBox Cordero;
    private CheckBox Cerdo;
    private CheckBox Pollo;
    private RadioButton Arroz;
    private RadioButton PastaD;
    private RadioButton PastaG;
    private RadioButton ostiones;
    private RadioButton anguila;
    private RadioButton huevo;
    private RadioButton aguacate;
    
    int numero;
    ArrayList<CheckBox>piezas1;
    ArrayList<CheckBox>piezas2;
    ArrayList<RadioButton>piezas3;
    ArrayList<ArrayList<String>>ordenes;
    
    ArrayList<String>proteinas;
    ArrayList<String>verduras;
    ArrayList<String>radios;
    
    ArrayList<CheckBox>Proteinas;
    ArrayList<CheckBox>Verduras;
    ArrayList<RadioButton>Radios;
    
    
    public OrdenesDelaComadaEditada(){
    
    }
    
    public OrdenesDelaComadaEditada(CheckBox apio,CheckBox zanahoria,CheckBox cebolla,CheckBox chile,CheckBox calabaza
    ,CheckBox berenjena,CheckBox hongos,CheckBox bambu,CheckBox brocoli){
    this.apio=apio;
    this.zanahoria=zanahoria;
    this.cebolla=cebolla;
    this.chile=chile;
    this.calabaza=calabaza;
    this.berenjena=berenjena;
    this.hongos=hongos;
    this.bambu=bambu;
    this.brocoli=brocoli;   
    piezas1=new ArrayList<CheckBox>();
    ordenes=new ArrayList<ArrayList<String>>();
    verduras=new ArrayList<String>();
    Verduras=new ArrayList<CheckBox>();
    piezas1.add(this.apio);piezas1.add(this.zanahoria);
    piezas1.add(cebolla);piezas1.add(chile);
    piezas1.add(this.calabaza);piezas1.add(this.berenjena);
    piezas1.add(this.hongos);piezas1.add(this.bambu);
    piezas1.add(this.brocoli);
    
    }
    
    public OrdenesDelaComadaEditada(CheckBox Camaron,CheckBox Pescado,CheckBox Res,CheckBox Cordero,CheckBox Cerdo,CheckBox Pollo){
     this.Camaron=Camaron;
     this.Pescado=Pescado;
     this.Res=Res;
     this.Cordero=Cordero;
     this.Cerdo=Cerdo;
     this.Pollo=Pollo; 
     piezas2=new ArrayList<CheckBox>();
     proteinas=new ArrayList<String>();
     Proteinas=new ArrayList<CheckBox>();
     piezas2.add(this.Camaron);piezas2.add(this.Pescado);
     piezas2.add(this.Res);piezas2.add(this.Cordero);
     piezas2.add(this.Cerdo);piezas2.add(this.Pollo);
    
    }
    
    public OrdenesDelaComadaEditada(RadioButton Arroz,RadioButton PastaD,RadioButton PastaG,RadioButton ostiones,RadioButton anguila,
     RadioButton huevo,RadioButton aguacate){
     this.anguila=anguila;
     this.ostiones=ostiones;
     this.Arroz=Arroz;
     this.PastaD=PastaD;
     this.PastaG=PastaG;
     this.huevo=huevo;
     this.aguacate=aguacate;
     radios=new ArrayList<String>();
     piezas3=new ArrayList<RadioButton>();
     Radios=new ArrayList<RadioButton>();
     piezas3.add(this.PastaD);piezas3.add(this.PastaG);piezas3.add(this.Arroz);
     piezas3.add(this.aguacate);piezas3.add(this.huevo);
     piezas3.add(this.ostiones);this.piezas3.add(this.anguila);
    }
    
    
    public void GetSelecionarVerduras(ArrayList<ArrayList<String>> ordenes,int numero){
     this.ordenes=ordenes;
     this.numero=numero;   
    
    
  
   System.out.println("ordenes "+ordenes);
  
        for(int j=0;j<piezas1.size();j++){
            for(int i=0;i<ordenes.get(numero).size();i++){
                 if(piezas1.get(j).getText().equals(ordenes.get(numero).get(i))){
                    piezas1.get(j).setSelected(true);
                 }    
            }    
        }
       
    
    }
    
    public void GetSelecionarProteinas(ArrayList<ArrayList<String>> ordenes,int numero){
     this.ordenes=ordenes;
     this.numero=numero;   
     
         for(int j=0;j<piezas2.size();j++){
             for(int i=0;i<ordenes.get(numero).size();i++){
                 if(piezas2.get(j).getText().equals(ordenes.get(numero).get(i))){
                    piezas2.get(j).setSelected(true);
                 }    
             }  
         }
     
   }
   
   public void GetSelecionarRadios(ArrayList<ArrayList<String>> ordenes,int numero){
       this.ordenes=ordenes;
       this.numero=numero;  
     
       for(int j=0;j<piezas3.size();j++){
           for(int i=0;i<ordenes.get(numero).size();i++){
               if(piezas3.get(j).getText().equals(ordenes.get(numero).get(i))){
                    piezas3.get(j).setSelected(true);
                }    
            }  
        }
   
   
   } 
   
public ArrayList<String> GetVerduras(){ 
    
    for(int i=0;i<piezas1.size();i++){
       
        if(piezas1.get(i).isSelected()){
           verduras.add(piezas1.get(i).getText());
           Verduras.add(piezas1.get(i));
        }
    }    
    

   return verduras;
 }

public ArrayList<String> GetProteinas(){ 
    
    for(int i=0;i<piezas2.size();i++){
       
        if(piezas2.get(i).isSelected()){
           proteinas.add(piezas2.get(i).getText());
           Proteinas.add(piezas2.get(i));
        }
    }    
    

   return proteinas;
 }

public ArrayList<String> GetRadios(){ 
    
    for(int i=0;i<piezas3.size();i++){
       
        if(piezas3.get(i).isSelected()){
           radios.add(piezas3.get(i).getText());
           Radios.add(piezas3.get(i));
        }
    }    
    return radios;
 }


public void DeselecionarProteinas(){
   
     for(int i=0;i<Proteinas.size();i++){
         Proteinas.get(i).setSelected(false);
     }
     
}

public void DeselecionarVerduras(){
   
     for(int i=0;i<Verduras.size();i++){
         Verduras.get(i).setSelected(false);
     }
     
}

public void DeselecionarRadios(){
   
     for(int i=0;i<Radios.size();i++){
         Radios.get(i).setSelected(false);
     }
     
}

 public void RemoveOrdenAnterior(ArrayList<ArrayList<String>> ordenes,int numero){
     this.numero=numero;
      
     
         System.out.println("Ordenes del metodo "+ordenes);
     
         for(int i=0;i<ordenes.get(numero).size();i++){
             System.out.println("seen "+ordenes.get(numero).get(i));
         }
         ordenes.get(numero).clear();
         System.out.println("ordenes del metodo limpiado "+ordenes);
 
  }



}

