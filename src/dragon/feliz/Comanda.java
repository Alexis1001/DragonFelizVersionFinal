/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dragon.feliz;

import java.util.ArrayList;
import javafx.collections.ObservableList;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

/**
 *
 * @author PC
 */
public class Comanda {
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
    private ToggleGroup RadiobuttonPastaArroz;
    private ToggleGroup salsa;
    private ToggleGroup topi;
    private RadioButton pasta_arroz,salsas,topis;
    private String texto1="",texto2="",texto3="";
    private ArrayList<CheckBox>verduras;
    private ArrayList<CheckBox>proteinas;
    private ArrayList<String>verduras1;
    private ArrayList<String>proteinas1;
    private ObservableList<String>servers;
    private ArrayList<CheckBox>DeselecCionarVerduras;
    private ArrayList<CheckBox>Deselecionarroteinas;
    
    public Comanda(CheckBox apio,CheckBox zanahoria,CheckBox cebolla,CheckBox chile,CheckBox calabaza
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
    verduras=new ArrayList<CheckBox>();
    verduras1=new ArrayList<String>();
    DeselecCionarVerduras=new ArrayList<CheckBox>();
    }
    
    public Comanda(CheckBox Camaron,CheckBox Pescado,CheckBox Res,CheckBox Cordero,CheckBox Cerdo,CheckBox Pollo){
    this.Camaron=Camaron;
    this.Pescado=Pescado;
    this.Res=Res;
    this.Cordero=Cordero;
    this.Cerdo=Cerdo;
    this.Pollo=Pollo;
    proteinas=new ArrayList<CheckBox>();
    proteinas1=new ArrayList<String>();
    Deselecionarroteinas=new ArrayList<CheckBox>();
    }
    
    public Comanda(ToggleGroup RadiobuttonPastaArroz,ToggleGroup salsa,ToggleGroup topi){
    this.RadiobuttonPastaArroz=RadiobuttonPastaArroz;
    this.salsa=salsa;
    this.topi=topi;
    }
    
    public Comanda(){
    
    }
    
    public String GetPastaArroz(){
     pasta_arroz=(RadioButton)RadiobuttonPastaArroz.getSelectedToggle();
     texto1=pasta_arroz.getText();
        return texto1;
    }
    
    public String GetSalsa(){
     salsas=(RadioButton)salsa.getSelectedToggle();
     texto2=salsas.getText();
       return texto2;
    }
    
    public String GetTopi(){
     topis=(RadioButton)topi.getSelectedToggle();
     texto3=topis.getText();
       return texto3;
    }
    
    public ArrayList<String> GetVerduras(){
    verduras.add(this.apio);verduras.add(this.zanahoria);
    verduras.add(cebolla);verduras.add(chile);
    verduras.add(this.calabaza);verduras.add(this.berenjena);
    verduras.add(this.hongos);verduras.add(this.bambu);
    verduras.add(this.brocoli);
      
       for(int i=0;i<verduras.size();i++){
       
           if(verduras.get(i).isSelected()){
              verduras1.add(verduras.get(i).getText());
              DeselecCionarVerduras.add(verduras.get(i));
           } 
           
        }
    
    return verduras1;
    }
    
    public ArrayList<String> GetProteinas(){
     proteinas.add(this.Camaron);proteinas.add(this.Pescado);
     proteinas.add(this.Res);proteinas.add(this.Cordero);
     proteinas.add(this.Cerdo);proteinas.add(this.Pollo);
      for(int i=0;i<proteinas.size();i++){
       
          if(proteinas.get(i).isSelected()){
            proteinas1.add(proteinas.get(i).getText());
             Deselecionarroteinas.add(proteinas.get(i));
          }       
      } 
       return proteinas1;
    }
    
    public String GetDeselecionaProteinas(){
      for(int i=0;i< Deselecionarroteinas.size();i++){
          Deselecionarroteinas.get(i).setSelected(false);
      }
    
    return "deselecionado todas las proteinas";
    }
    
    public String GetDeselecionarVerduras(){
       for(int i=0;i<DeselecCionarVerduras.size();i++){
           DeselecCionarVerduras.get(i).setSelected(false);
       }
        
     return "deselecionado todas las verduras";
    }
    
    
    
}

