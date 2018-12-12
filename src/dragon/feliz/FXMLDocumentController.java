/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dragon.feliz;

import java.awt.Desktop;
import java.awt.Rectangle;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.collections.FXCollections;
import static javafx.collections.FXCollections.observableList;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.StageStyle;

/**
 *
 * @author PC
 */
public class FXMLDocumentController implements Initializable {
    
    /*Hoja 1 de java fx  */
    @FXML private AnchorPane PuntoDeVenta;
    @FXML private ImageView imagenPlatilloInicio;
    @FXML private TextField NombreDelCliente;
    @FXML private Button BotonPuntoDeVenta;
    @FXML private TextField TotalDePlatillos;
    
    /*hoja 2 de java fx*/
    @FXML private AnchorPane Comanda;
    @FXML private TextField CantidadDeOrdenes;
    @FXML private TextField CapturaDeOrden;

    @FXML private CheckBox apio;
    @FXML private CheckBox zanahoria;
    @FXML private CheckBox cebolla;
    @FXML private CheckBox chile;
    @FXML private CheckBox calabaza;
    @FXML private CheckBox berenjena;
    @FXML private CheckBox hongos;
    @FXML private CheckBox bambu;
    @FXML private CheckBox brocoli;
    @FXML private CheckBox Camaron;
    @FXML private CheckBox Pescado;
    @FXML private CheckBox Res;
    @FXML private CheckBox Cordero;
    @FXML private CheckBox Cerdo;
    @FXML private CheckBox Pollo;
    @FXML private ComboBox<String>Servicios;
    ObservableList<String>servers=FXCollections.observableArrayList();
    @FXML private ToggleGroup RadiobuttonPastaArroz;
    @FXML private ToggleGroup salsa;
    @FXML private ToggleGroup topi;
    @FXML private Button combos;
    @FXML private AnchorPane Combos;
    @FXML private RadioButton PastaG;
    @FXML private RadioButton Arroz;
    @FXML private RadioButton PastaD;
    @FXML private RadioButton huevo;
    @FXML private RadioButton aguacate;
    @FXML private RadioButton ostiones;
    @FXML private RadioButton anguila;
    @FXML private AnchorPane Pagar;
    @FXML private AnchorPane Pedidos;
    @FXML private TextField colonia;
    @FXML private TextField calle;
    @FXML private TextField avenida;
    @FXML private TextField interior;
    @FXML private TextField exterior;
    @FXML private TextField tel;
    
    @FXML private TextField Total;
    @FXML private TextField importe;
    @FXML private TextField cambio;
    @FXML private Label mt;
    @FXML private Label iImporte;
    @FXML private Label ca;
    @FXML private Button PagarBoton;
    @FXML private AnchorPane Principal;
    @FXML private ImageView VolberDespuesDePagar;
    
    @FXML private AnchorPane EditarPedido;
  
    @FXML private ToggleGroup RadiobuttonPastaArroz_1;
    @FXML private ToggleGroup salsa_1;
    @FXML private ToggleGroup topi1;
    
    @FXML private CheckBox Camaron1;
    @FXML private CheckBox Pescado1;
    @FXML private CheckBox Res1;
    @FXML private CheckBox Cordero1;
    @FXML private CheckBox Cerdo1;
    @FXML private CheckBox Pollo1;
    
    @FXML private CheckBox apio1;
    @FXML private CheckBox zanahoria1;
    @FXML private CheckBox cebolla1;
    @FXML private CheckBox chile1;
    @FXML private CheckBox calabaza1;
    @FXML private CheckBox berenjena1;
    @FXML private CheckBox hongos1;
    @FXML private CheckBox bambu1;
    @FXML private CheckBox brocoli1;
    
    @FXML private RadioButton Arrozz;
    @FXML private RadioButton PastaDD;
    @FXML private RadioButton PastaGG;
    @FXML private RadioButton ostiones1;
    @FXML private RadioButton anguila1;
    @FXML private RadioButton huevo1;
    @FXML private RadioButton aguacate1;
     
    @FXML private ComboBox<String> Servicios1;
    ObservableList<String>servers1=FXCollections.observableArrayList();
    
    @FXML private AnchorPane VerOrdenes;
    @FXML private TextArea ListaOrdenes;
    @FXML private TextField OrdenABorrar; 
    
    /*Vari
    able hoja uno*/
    String Nombre_Cliente="";
    int Total_Ordenes=0;
    double totales=0.0;
    /*------------------/
    /*Vriables hoja 2 */
    int Captura_Orden=0;
    String Captura_Orden_String;
    int numeroorden=0;
    RadioButton GrupoPastasArroz,GrupoTopi,GrupoSalsa;
    
 
    ArrayList<String>Verduras=new ArrayList<String>();
    ArrayList<String>Proteinas=new ArrayList<String>();
    ArrayList<String>radiosx=new ArrayList<String>();
    ArrayList<RadioButton>Radios=new ArrayList<RadioButton>();
    ArrayList<ArrayList<String>>ordenes =new ArrayList<ArrayList<String>>(); 
     
     
    @FXML
    void AbrirPuntoDeVenta(ActionEvent event) {
    
    Cliente cliente=new Cliente();
        
    Nombre_Cliente=NombreDelCliente.getText();
    cliente.setNombre(Nombre_Cliente);
    servers.removeAll(servers);
    numeroorden=1;
    boolean control=true;
    servers1.removeAll(servers1);
    
    if(cliente.getNombreBoolean()==true){
       Alert alert = new Alert(AlertType.ERROR);
       alert.setTitle("Dialogo De Error");
       alert.setHeaderText("Error En El Campo Nombre");
       alert.setContentText("Ingrese solo letras ");
       alert.showAndWait();
    }
    
    if(cliente.GetNombre().length()<1){
       Alert alert = new Alert(AlertType.ERROR);
       alert.setTitle("Dialogo De Error");
       alert.setHeaderText("Error En El Campo Nombre");
       alert.setContentText("El campo esta vacio ");
       alert.showAndWait();
    }
    
    if(cliente.GetNombre().length()>0&&cliente.getNombreBoolean()==false){
       System.out.println("correcto nombre del cliente "+cliente.GetNombre());
    }
     
try{
    Total_Ordenes=Integer.parseInt(TotalDePlatillos.getText());
    cliente.setNumeroDeOrdenes(Total_Ordenes);
    
    if(cliente.getNumeroDeOrdenes()>50){
       Alert alert = new Alert(AlertType.ERROR);
       alert.setTitle("Dialogo de error");
       alert.setHeaderText("Error");
       alert.setContentText("ingrese un numero de ordenes menor a 50!");
       alert.showAndWait(); //no puse un puto valor asignado perro
    }
    if(cliente.getNumeroDeOrdenes()<50){
        System.out.println("orden valida "+cliente.getNumeroDeOrdenes());
        control=false;
    }
   
  }catch(Exception e){
    Alert alert = new Alert(AlertType.ERROR);
    alert.setTitle("Dialogo de error");
    alert.setHeaderText("Error en el campo cantidad de ordenes");
    alert.setContentText("ingrese un numero!");
    alert.showAndWait(); 
    }
    
 
    if(cliente.GetNombre().length()>0&&cliente.getNombreBoolean()==false&&control==false){
       System.out.println("TODO PERFECTO");
       System.out.println("nombre "+cliente.GetNombre()+" numero de orden "+cliente.getNumeroDeOrdenes());
       
       CantidadDeOrdenes.setText(String.valueOf(Total_Ordenes));
       PuntoDeVenta.setVisible(false);
       Comanda.setVisible(true);
       
       servers.add("comer aqui");
       servers.add("llevar");
       servers.add("domicilio");
       Servicios.setItems(servers);
       
       servers1.add("comer aqui");
       servers1.add("llevar");
       Servicios1.setItems(servers1);
       
       Radios.add(Arroz);
       Radios.add(PastaD);
       Radios.add(PastaG);
       Radios.add(aguacate);
       Radios.add(huevo);
       Radios.add(ostiones);
       Radios.add(anguila);
       
       for(int i=0;i<Total_Ordenes+1;i++){
           ordenes.add(new ArrayList<String>());
       }
       
       CapturaDeOrden.setText(String.valueOf(numeroorden));
       File fichero=new File("nota.txt");
       MostrarOrdenes nota=new MostrarOrdenes();
       nota.eliminarFichero(fichero);
       
    }    
        
        
}
    
    @FXML
    void GenerarVenta(ActionEvent event) {
     
    Comanda verduras=new Comanda(apio,zanahoria,cebolla,chile,calabaza,berenjena,hongos,bambu,brocoli);
    Comanda proteinas=new Comanda(Camaron,Pescado,Res,Cordero,Cerdo,Pollo); 
    Comanda radios=new Comanda(RadiobuttonPastaArroz,salsa,topi);      
    int contradios=0;   
     
    
     for(int i=0;i<Radios.size();i++){
        if(Radios.get(i).isSelected()){
           radiosx.add(Radios.get(i).getText());
           Radios.get(i).setSelected(false);
           contradios++;
        }
     
      }
     
     Verduras=verduras.GetVerduras();
     if(Verduras.size()>0){
        verduras.GetDeselecionarVerduras();
      }
     
     Proteinas=proteinas.GetProteinas();
     if(Proteinas.size()>0){
        proteinas.GetDeselecionaProteinas();
     }
     
   
     
     if(Verduras.size()<1&&Proteinas.size()<1&&contradios<1){
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Dialogo de error");
        alert.setHeaderText("Error en la comanda");
        alert.setContentText("seleciones por lo menos un ingrediente");
        alert.showAndWait();  
        Verduras.clear();
        Proteinas.clear();
        radiosx.clear();
     }  
       
     if(Servicios.getValue()==null){
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Dialogo de error");
        alert.setHeaderText("Error en el servicio ");
        alert.setContentText("Elija un servicio porfavor");
        alert.showAndWait();  
        Verduras.clear();
        Proteinas.clear();
        radiosx.clear();
     }
  
 if(Servicios.getValue()!=null){
    if(Verduras.size()>0||Proteinas.size()>0||contradios>0){
           Alert alert = new Alert(AlertType.INFORMATION);
           alert.setTitle("Dialog De Venta");
           alert.setHeaderText("Informacion");
           alert.setContentText("Venta Generada Correctamente");
           alert.showAndWait();
           
        if(Servicios.getValue()!="domicilio"){
               
            if(Verduras.size()>0){
                for(int i=0;i<Verduras.size();i++){
                    ordenes.get(numeroorden).add(Verduras.get(i));
                } 
            }
                
            if(Proteinas.size()>0){
               for(int i=0;i<Proteinas.size();i++){
                   ordenes.get(numeroorden).add(Proteinas.get(i));
                   }    
            }
            
            if(radiosx.size()>0){
               for(int i=0;i<radiosx.size();i++){
                   ordenes.get(numeroorden).add(radiosx.get(i));
                   }    
            }
        ordenes.get(numeroorden).add("Servicio "+Servicios.getValue());   
        numeroorden++;
        CapturaDeOrden.setText(String.valueOf(numeroorden)); 
        Proteinas.clear();
        Verduras.clear();
        radiosx.clear();
        }
        
        if(Servicios.getValue()=="domicilio"){
           Comanda.setVisible(false);
           Pedidos.setVisible(true);
        }
            
    }   
 } 
    
     if(numeroorden==Total_Ordenes+1){
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Dragon feliz");
        alert.setHeaderText(null);
        alert.setContentText("Todas la ordenes capturadas correcta mente");
        alert.showAndWait();
        numeroorden=0;
        Comanda.setVisible(false);
        Pagar.setVisible(true);
        
     }
     
  
}
    
   
    
    @FXML
    void Salir(ActionEvent event) {
       NombreDelCliente.setText("");
       TotalDePlatillos.setText(""); 
       Comanda.setVisible(false);
       Principal.setVisible(true);
       NombreDelCliente.setText("");
       TotalDePlatillos.setText("");
       ordenes.clear();
       Comanda verduras=new Comanda(apio,zanahoria,cebolla,chile,calabaza,berenjena,hongos,bambu,brocoli);
       Comanda proteinas=new Comanda(Camaron,Pescado,Res,Cordero,Cerdo,Pollo); 
       Comanda radios=new Comanda(RadiobuttonPastaArroz,salsa,topi);
       Comanda comanda=new Comanda();
       ArrayList<String>Verduras=new ArrayList<String>();
       ArrayList<String>Proteinas=new ArrayList<String>(); 
       
       
       Verduras=verduras.GetVerduras();
    if(Verduras.size()>0){
       verduras.GetDeselecionarVerduras();
       Verduras.clear();
     }
   
       Proteinas=proteinas.GetProteinas();
     if(Proteinas.size()>0){
        proteinas.GetDeselecionaProteinas();
        Proteinas.clear();
     }
       
     for(int i=0;i<Radios.size();i++){
         if(Radios.get(i).isSelected()){
            Radios.get(i).setSelected(false);
           }
     }  
     
        
    
 }
    
    @FXML
    void VerCombos(ActionEvent event) {
      Comanda.setVisible(false);
      Combos.setVisible(true);
    }
    
    
    @FXML
    void AddCombo1(ActionEvent event) {
     ordenes.get(numeroorden).add("Pasta Delgada 15$");
     ordenes.get(numeroorden).add("Chile 2$");
     ordenes.get(numeroorden).add("Bambu 12.5$");
     ordenes.get(numeroorden).add("Camaron 20$");
     ordenes.get(numeroorden).add("Pollo 18.5$");
     ordenes.get(numeroorden).add("Ostiones 5$");
     ordenes.get(numeroorden).add("Servicio comer aqui");
     Alert alert = new Alert(AlertType.INFORMATION);
     alert.setTitle("Dialogo De Venta");
     alert.setHeaderText("Informacion");
     alert.setContentText("Venta Generada Correctamente");
     alert.showAndWait();
     
     numeroorden++;
     CapturaDeOrden.setText(String.valueOf(numeroorden)); 
    if(numeroorden==Total_Ordenes+1){
        alert.setTitle("Dragon feliz");
        alert.setHeaderText(null);
        alert.setContentText("Todas la ordenes capturadas correcta mente");
        alert.showAndWait();
        numeroorden=0;
        Combos.setVisible(false);
        Pagar.setVisible(true);
    }
    
    
     
    
}

    @FXML
    void AddCombo2(ActionEvent event) {
     ordenes.get(numeroorden).add("Pasta Gruesa 13.5$");
     ordenes.get(numeroorden).add("Zanahoria 3.5$");
     ordenes.get(numeroorden).add("Bambu 12.5$");
     ordenes.get(numeroorden).add("Cerdo 15$");
     ordenes.get(numeroorden).add("Res 19$");
     ordenes.get(numeroorden).add("Anguila 6$");
     ordenes.get(numeroorden).add("Servicio comer aqui");
     Alert alert = new Alert(AlertType.INFORMATION);
     alert.setTitle("Dialogo De Venta");
     alert.setHeaderText("Informacion");
     alert.setContentText("Venta Generada Correctamente");
     alert.showAndWait();
     
     numeroorden++;
     CapturaDeOrden.setText(String.valueOf(numeroorden)); 
    if(numeroorden==Total_Ordenes+1){
        alert.setTitle("Dragon feliz");
        alert.setHeaderText(null);
        alert.setContentText("Todas la ordenes capturadas correcta mente");
        alert.showAndWait();
        numeroorden=0;
        Combos.setVisible(false);
        Pagar.setVisible(true);
    }    
        

    }

    @FXML
    void AddCombo3(ActionEvent event) {
     ordenes.get(numeroorden).add("Arroz 10$");
     ordenes.get(numeroorden).add("Apio 3$");
     ordenes.get(numeroorden).add("Brocoli 5$");
     ordenes.get(numeroorden).add("Pescado 13$");
     ordenes.get(numeroorden).add("Camaron 20$");
     ordenes.get(numeroorden).add("Aguacate 15$");
     ordenes.get(numeroorden).add("Servicio comer aqui");
     Alert alert = new Alert(AlertType.INFORMATION);
     alert.setTitle("Dialogo De Venta");
     alert.setHeaderText("Informacion");
     alert.setContentText("Venta Generada Correctamente");
     alert.showAndWait();
     CapturaDeOrden.setText(String.valueOf(numeroorden)); 
     numeroorden++;
     
    if(numeroorden==Total_Ordenes+1){
        alert.setTitle("Dragon feliz");
        alert.setHeaderText(null);
        alert.setContentText("Todas la ordenes capturadas correcta mente");
        alert.showAndWait();
        numeroorden=0;
        Combos.setVisible(false);
        Pagar.setVisible(true);
    }    
         
        

    }

    @FXML
    void AddCombo4(ActionEvent event) {
     ordenes.get(numeroorden).add("Arroz 10$");
     ordenes.get(numeroorden).add("Chile 2$");
     ordenes.get(numeroorden).add("Bambu 12.5$");
     ordenes.get(numeroorden).add("Camaron 20$");
     ordenes.get(numeroorden).add("Cerdo 15$");
     ordenes.get(numeroorden).add("Huevo 13$");
     ordenes.get(numeroorden).add("Servicio comer aqui");
     Alert alert = new Alert(AlertType.INFORMATION);
     alert.setTitle("Dialogo De Venta");
     alert.setHeaderText("Informacion");
     alert.setContentText("Venta Generada Correctamente");
     alert.showAndWait();
     CapturaDeOrden.setText(String.valueOf(numeroorden)); 
     numeroorden++;
     
    if(numeroorden==Total_Ordenes+1){
        alert.setTitle("Dragon feliz");
        alert.setHeaderText(null);
        alert.setContentText("Todas la ordenes capturadas correcta mente");
        alert.showAndWait();
        numeroorden=0;
        Combos.setVisible(false);
        Pagar.setVisible(true);
    }    
            
        

    }
    
    @FXML
    void SalirCombos(ActionEvent event) {
     Comanda verduras=new Comanda(apio,zanahoria,cebolla,chile,calabaza,berenjena,hongos,bambu,brocoli);
     Comanda proteinas=new Comanda(Camaron,Pescado,Res,Cordero,Cerdo,Pollo); 
     Comanda radios=new Comanda(RadiobuttonPastaArroz,salsa,topi);    
     
     Verduras=verduras.GetVerduras();
     if(Verduras.size()>0){
        verduras.GetDeselecionarVerduras();
     }
     
     Proteinas=proteinas.GetProteinas();
     if(Proteinas.size()>0){
        proteinas.GetDeselecionaProteinas();
     }
     
    for(int i=0;i<Radios.size();i++){
        if(Radios.get(i).isSelected()){
           Radios.get(i).setSelected(false);
        }
     
      }
    
    Combos.setVisible(false);
    Comanda.setVisible(true);
     
     
    }
    
    
    @FXML
    
    void GenerarPedido(ActionEvent event) {
      Cliente Direcion1=new Cliente();
      Cliente Direcion2=new Cliente();
      Cliente Direcion3=new Cliente();
      String Colonia="";
      String Calle="";
      String Avenida="";
      long Interior=0,Exterior=0,Tel=0;
      boolean solonumeros=false,sololetras=false;

     Colonia=colonia.getText();
     Direcion1.setNombre(Colonia);
     Calle=calle.getText();
     Direcion2.setNombre(Calle);
     Avenida=avenida.getText();
     Direcion3.setNombre(Avenida);
     
    if(Direcion1.getNombreBoolean()==true){
       Alert alert = new Alert(AlertType.ERROR);
       alert.setTitle("Dialogo de error");
       alert.setHeaderText("campo colonia");
       alert.setContentText("ingrese solo letras");
       alert.showAndWait();  
       sololetras=true;
    }
    if(Direcion2.getNombreBoolean()==true){
       Alert alert = new Alert(AlertType.ERROR);
       alert.setTitle("Dialogo de error");
       alert.setHeaderText("campo calle");
       alert.setContentText("ingrese solo letras");
       alert.showAndWait();   
       sololetras=true;
    }
    
    if(Direcion3.getNombreBoolean()==true){
       Alert alert = new Alert(AlertType.ERROR);
       alert.setTitle("Dialogo de error");
       alert.setHeaderText("campo avenida");
       alert.setContentText("ingrese solo letras");
       alert.showAndWait();
       sololetras=true;
    }
    
    if(Colonia.length()<1){
       Alert alert = new Alert(AlertType.ERROR);
       alert.setTitle("Dialogo de error");
       alert.setHeaderText("campo colonia");
       alert.setContentText("campo vacio");
       alert.showAndWait();
       sololetras=true;
    }
     
    if(Calle.length()<1){
       Alert alert = new Alert(AlertType.ERROR);
       alert.setTitle("Dialogo de error");
       alert.setHeaderText("campo calle");
       alert.setContentText("campo vacio");
       alert.showAndWait();  
       sololetras=true;
    }
    
    if(Avenida.length()<1){
       Alert alert = new Alert(AlertType.ERROR);
       alert.setTitle("Dialogo de error");
       alert.setHeaderText("campo avenida");
       alert.setContentText("campo vacio");
       alert.showAndWait(); 
       sololetras=true;
    }
    
    try{
     Interior= Long.parseLong(interior.getText()); 
    }catch(Exception e){
      Alert alert = new Alert(AlertType.ERROR);
      alert.setTitle("Dialogo de error");
      alert.setHeaderText("campo numero Interior");
      alert.setContentText("ingrese solo numeros");
      alert.showAndWait(); 
      solonumeros=true;
    }
    
    try{
     Exterior= Long.parseLong(exterior.getText()); 
    }catch(Exception e){
      Alert alert = new Alert(AlertType.ERROR);
      alert.setTitle("Dialogo de error");
      alert.setHeaderText("campo numero Exterior");
      alert.setContentText("ingrese solo numeros");
      alert.showAndWait();   
      solonumeros=true;
    }
    
    try{
     Tel= Long.parseLong(tel.getText()); 
    }catch(Exception e){
      Alert alert = new Alert(AlertType.ERROR);
      alert.setTitle("Dialogo de error");
      alert.setHeaderText("campo numero telefonico");
      alert.setContentText("ingrese solo numeros");
      alert.showAndWait();
      solonumeros=true;
    }
    
    if(solonumeros==false&&sololetras==false){
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Dialogo De Venta");
        alert.setHeaderText("Informacion");
        alert.setContentText("Venta Generada Correctamente");
        alert.showAndWait();
        
        if(numeroorden<Total_Ordenes+1){
             if(Verduras.size()>0){
                for(int i=0;i<Verduras.size();i++){
                    ordenes.get(numeroorden).add(Verduras.get(i));
                } 
             }
            if(Proteinas.size()>0){
               for(int i=0;i<Proteinas.size();i++){
                   ordenes.get(numeroorden).add(Proteinas.get(i));
                }    
            }
            if(radiosx.size()>0){
               for(int i=0;i<radiosx.size();i++){
                    ordenes.get(numeroorden).add(radiosx.get(i));
                }    
            }
           ordenes.get(numeroorden).add("Servicio "+Servicios.getValue());  
           ordenes.get(numeroorden).add("Colinia "+Colonia);
           ordenes.get(numeroorden).add("Calle "+Calle);
           ordenes.get(numeroorden).add("Avenida "+Avenida);
           ordenes.get(numeroorden).add("N° Interior "+interior.getText());
           ordenes.get(numeroorden).add("N° Exterior "+exterior.getText());
           ordenes.get(numeroorden).add("Telefono "+tel.getText());
           
           colonia.setText("");
           calle.setText("");
           avenida.setText("");
           interior.setText("");
           exterior.setText("");
           tel.setText("");
           
           numeroorden++;
           CapturaDeOrden.setText(String.valueOf(numeroorden)); 
           Proteinas.clear();
           Verduras.clear();
           radiosx.clear();
           Comanda.setVisible(true);
           Pedidos.setVisible(false);
           }
        
        if(numeroorden==Total_Ordenes+1){
           alert.setTitle("Dragon feliz");
           alert.setHeaderText(null);
           alert.setContentText("Todas la ordenes capturadas correcta mente");
           alert.showAndWait();
           numeroorden=0;
           colonia.setText("");
           calle.setText("");
           avenida.setText("");
           interior.setText("");
           exterior.setText("");
           tel.setText("");
           Pagar.setVisible(true);
           Pedidos.setVisible(false);
           Comanda.setVisible(false);   
          
        }
        
    }
    
}
    
    @FXML
    void SalirPedido(MouseEvent event) {
     Comanda verduras=new Comanda(apio,zanahoria,cebolla,chile,calabaza,berenjena,hongos,bambu,brocoli);
     Comanda proteinas=new Comanda(Camaron,Pescado,Res,Cordero,Cerdo,Pollo); 
     Comanda radios=new Comanda(RadiobuttonPastaArroz,salsa,topi);    
     
     Verduras=verduras.GetVerduras();
     if(Verduras.size()>0){
        verduras.GetDeselecionarVerduras();
     }
     
     Proteinas=proteinas.GetProteinas();
     if(Proteinas.size()>0){
        proteinas.GetDeselecionaProteinas();
     }
     
    for(int i=0;i<Radios.size();i++){
        if(Radios.get(i).isSelected()){
           Radios.get(i).setSelected(false);
        }
     
      }
        
      Pedidos.setVisible(false);
      Comanda.setVisible(true);
        
        
    }
    
    
     @FXML
    void PagarTodo(ActionEvent event) {
     double pago=0.0,resta=0.0;
     boolean control=false,control2=false;
     Ordenes total=new Ordenes(); 
     System.out.println("ordenes del metodo pagar todo "+ordenes);
     total.SetRcibirOrdenes(ordenes);
     total.GetTotalDecompra();
     
     try{
       pago=Double.parseDouble(importe.getText());
       System.out.println("pago perro viendo "+pago);
     }catch(Exception e){
       Alert alert = new Alert(AlertType.ERROR);
       alert.setTitle("Dialogo de error");
       alert.setHeaderText("campo ingrese importe");
       alert.setContentText("ingrese solo numeros");
       alert.showAndWait();
       control=true;
      }
      
     if(control==false){
     
       
        if(pago==total.GetTotalDecompra()){
           Alert alert = new Alert(AlertType.INFORMATION);
           alert.setTitle("Venta generada exitosamente");
           alert.setHeaderText(null);
           alert.setContentText("Cambio "+"0.0 $");
           alert.showAndWait();
           cambio.setText("0.0$");
           MostrarOrdenes nota=new MostrarOrdenes("nota.txt",ordenes,NombreDelCliente.getText(),TotalDePlatillos.getText(),
           total.GetTotalDecompra()-5,5.0,total.GetTotalDecompra(),pago,resta);
           nota.EscribirArchivo();
           nota.abrirarchivo("nota.txt");
            
           MostrarOrdenes Findia=new MostrarOrdenes("findia.txt",ordenes,NombreDelCliente.getText(),TotalDePlatillos.getText(),
           total.GetTotalDecompra()-5,5.0,total.GetTotalDecompra(),pago,resta);
           totales=totales+total.GetTotalDecompra();
           Findia.SetFinDia(totales);
           Findia.GetEscribirFindia();
           
           
           VolberDespuesDePagar.setVisible(true);
           PagarBoton.setVisible(false);
           ordenes.clear();       
           control2=true;
        }
        if(pago<total.GetTotalDecompra()){
           Alert alert = new Alert(AlertType.INFORMATION);
           alert.setTitle("Dialogo De Venta");
           alert.setHeaderText("Informacion");
           alert.setContentText("ingrese un monto mayor o igual a el total");
           alert.showAndWait();
           cambio.setText("0.0 $");
        }
        if(pago>total.GetTotalDecompra()&&control2==false){
           resta=pago-total.GetTotalDecompra();
           Alert alert = new Alert(AlertType.INFORMATION);
           alert.setTitle("Dialogo De Venta");
           alert.setHeaderText("Venta generada exitosamente");
           alert.setContentText("Cambio "+resta+" $");
           alert.showAndWait();
           cambio.setText(String.valueOf(resta));
           MostrarOrdenes nota=new MostrarOrdenes("nota.txt",ordenes,NombreDelCliente.getText(),TotalDePlatillos.getText(),
           total.GetTotalDecompra()-5,5.0,total.GetTotalDecompra(),pago,resta);
           nota.EscribirArchivo();
           nota.abrirarchivo("nota.txt");
           
           MostrarOrdenes Findia=new MostrarOrdenes("findia.txt",ordenes,NombreDelCliente.getText(),TotalDePlatillos.getText(),
           total.GetTotalDecompra()-5,5.0,total.GetTotalDecompra(),pago,resta);
           totales=totales+total.GetTotalDecompra();
           Findia.SetFinDia(totales);
           Findia.GetEscribirFindia();
           VolberDespuesDePagar.setVisible(true);
           PagarBoton.setVisible(false);
           ordenes.clear();
        }
        
      
      }

    
    
    }
    
    
   @FXML
    void imprimir(ActionEvent event) {
 
      
    }
    
    
    @FXML
    void PagarImage(MouseEvent event) {
    
    
    if(ordenes.size()>0){
       Total.setVisible(true);
       importe.setVisible(true);
       cambio.setVisible(true);
       mt.setVisible(true);
       iImporte.setVisible(true);
       ca.setVisible(true);
       PagarBoton.setVisible(true);
       System.out.println("ordenes del evento "+ordenes);
       Ordenes total=new Ordenes();
       total.SetRcibirOrdenes(ordenes);
       Total.setText(String.valueOf(total.GetTotalDecompra()));
       System.out.println("fin del evento image");
    }   
    if(ordenes.size()<1){
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Dialogo De Venta");
        alert.setHeaderText("lea la informacion");
        alert.setContentText("el pago ya se a realizado exitosamente ");
        alert.showAndWait();
    
    }
    
   
    
    }
    
    
    @FXML
    void EditarOrden(MouseEvent event) {
       String OrdenesCliente="";
       String TotalOrdenes=" ";
       boolean t=false;
        if(ordenes.size()<1){
           Alert alert = new Alert(AlertType.ERROR);
           alert.setTitle("Dialogo de error");
           alert.setHeaderText("error al ingresar");
           alert.setContentText("no cuenta con ninguna orden para editar");
           alert.showAndWait(); 
           t=true;
        }
        
        if(ordenes.size()>0&&t==false){
          // OrdenesCliente=NombreDelCliente.getText();
          // TotalOrdenes=TotalDePlatillos.getText();
           Pagar.setVisible(false);
           VerOrdenes.setVisible(true);
         //  MostrarOrdenes texto =new MostrarOrdenes(ordenes,OrdenesCliente,TotalOrdenes);
           MostrarOrdenes texto =new MostrarOrdenes(ordenes,NombreDelCliente.getText(),TotalDePlatillos.getText());
           ListaOrdenes.setText(texto.GetDebuelbeOrdenes());
        }
        
    
    
    }
    /////////////////////////////////////////////////// aqui  estoy
    @FXML
    void GuardarCambios(ActionEvent event) {
     boolean control=false;int numero=0;
     numero=Integer.parseInt(OrdenABorrar.getText());
     OrdenesDelaComadaEditada Verduras=new OrdenesDelaComadaEditada(apio1,zanahoria1,cebolla1,chile1,calabaza1,berenjena1,hongos1,bambu1,brocoli1);
     OrdenesDelaComadaEditada Proteinas=new OrdenesDelaComadaEditada(Camaron1,Pescado1,Res1,Cordero1,Cerdo1,Pollo1);
     OrdenesDelaComadaEditada Radios=new OrdenesDelaComadaEditada(Arrozz,PastaDD,PastaGG,ostiones1,anguila1,huevo1,aguacate1);   
     OrdenesDelaComadaEditada Edit=new OrdenesDelaComadaEditada();
     ArrayList<String> verduras=new ArrayList <String>();
     ArrayList<String> proteinas=new ArrayList <String>();
     ArrayList<String> radios=new ArrayList <String>();
        
     verduras=Verduras.GetVerduras();
     proteinas=Proteinas.GetProteinas();
     radios=Radios.GetRadios();
     
     try{
     
        System.out.println("verduras"+verduras);
        System.out.println("proteinas "+proteinas);
        System.out.println("radios "+radios);
     }catch(Exception e){
         System.out.println(" erro ");
      }  
   //  if(verduras.size()>0){
        //Verduras.DeselecionarVerduras();
   //  }
  //   if(proteinas.size()>0){
      // Proteinas.DeselecionarProteinas();
  //   }
  //   if(radios.size()>0){
      //  Radios.DeselecionarRadios();
  //   }
     
     
    if(Servicios1.getValue()==null){
       Alert alert = new Alert(AlertType.ERROR);
       alert.setTitle("Dialogo de error");
       alert.setHeaderText("error");
       alert.setContentText("eliga un servicio porfavor");
       alert.showAndWait();
       proteinas.clear();
       verduras.clear();
       radios.clear();
       control=true;
    }
    
    if(verduras.size()<1&&proteinas.size()<1&&radios.size()<1&&control==false){
       Alert alert = new Alert(AlertType.ERROR);
       alert.setTitle("Dialogo de error");
       alert.setHeaderText("error");
       alert.setContentText("la comanda esta vacia");
       alert.showAndWait();
       proteinas.clear();
       verduras.clear();
       radios.clear(); 
    }
    
    if(Servicios1!=null){
        
       if(verduras.size()>0||proteinas.size()>0||radios.size()>0){
           System.out.println("ordenes Real "+ordenes);
           Edit.RemoveOrdenAnterior(ordenes,numero);
           System.out.println("orden "+ordenes);
          
            if(verduras.size()>0){
               for(int i=0;i<verduras.size();i++){
                 ordenes.get(numero).add(verduras.get(i));
               }
             verduras.clear();
             Verduras.DeselecionarVerduras();
          }
          if(proteinas.size()>0){
             for(int i=0;i<proteinas.size();i++){
                 ordenes.get(numero).add(proteinas.get(i));
             }
             proteinas.clear();
             Proteinas.DeselecionarProteinas();
          }
          if(radios.size()>0){
             for(int i=0;i<radios.size();i++){
                 ordenes.get(numero).add(radios.get(i));
             }
             radios.clear();
             Radios.DeselecionarRadios();
          }     
          ordenes.get(numero).add("Servicio "+Servicios1.getValue());
          OrdenABorrar.setText("");
          System.out.println("orden final"+ordenes);
          MostrarOrdenes texto =new MostrarOrdenes(ordenes,NombreDelCliente.getText(),TotalDePlatillos.getText());
          ListaOrdenes.setText(texto.GetDebuelbeOrdenes());
          EditarPedido.setVisible(false);
          VerOrdenes.setVisible(true);
          Alert alert = new Alert(AlertType.INFORMATION);
          alert.setTitle("Dialogo De Venta");
          alert.setHeaderText("informacion de venta");
          alert.setContentText("La orden se a editado exitosamente ");
          alert.showAndWait();
       
       }
    
    }
    
    
    
        
       
    
    }
    
    
    @FXML
    void EliminarProducto(MouseEvent event) {
      boolean t=false;
      int numero=0;
      String OrdenesCliente="";
      String TotalOrdenes=" ";
      
       if(ordenes.size()<1){
         Alert alert = new Alert(AlertType.ERROR);
         alert.setTitle("Dialogo de error");
         alert.setHeaderText("error al eliminar");
         alert.setContentText("no cuenta con ninguna orden para aliminar");
         alert.showAndWait();
         t=true;
       }
       
      if(ordenes.size()>0&&t==false){
      
         try{
           numero=Integer.parseInt(OrdenABorrar.getText());
           
           if(numero<ordenes.size()&&numero>0){
              ordenes.remove(numero);
              MostrarOrdenes texto =new MostrarOrdenes(ordenes,NombreDelCliente.getText(),TotalDePlatillos.getText());
              ListaOrdenes.setText(texto.GetDebuelbeOrdenes());
              OrdenABorrar.setText("");
              Alert alert = new Alert(AlertType.INFORMATION);
              alert.setTitle("Dialogo De Venta");
              alert.setHeaderText("informacion de venta");
              alert.setContentText("La orden se a borrado exitosamente ");
              alert.showAndWait();  
           }
           else{
               Alert alert = new Alert(AlertType.ERROR);
               alert.setTitle("Dialogo de error");
               alert.setHeaderText("error al eliminar");
               alert.setContentText("orden inexistente");
               alert.showAndWait();
            }
           
           
           
         }catch(Exception e){
           Alert alert = new Alert(AlertType.ERROR);
           alert.setTitle("Dialogo de error");
           alert.setHeaderText("error al eliminar");
           alert.setContentText("ingrese un numero de las ordenes porfavor");
           alert.showAndWait(); 
         }
     }
      
       
        
}
 
   
    @FXML
    void AddProducto(MouseEvent event) {
       boolean control=false;
       int numero=0;
       if(ordenes.size()<1){
           Alert alert = new Alert(AlertType.ERROR);
           alert.setTitle("Dialogo de error");
           alert.setHeaderText("error al ingresar");
           alert.setContentText("no cuenta con ninguna orden para editar");
           alert.showAndWait(); 
           control=true;
        }
       
       if(ordenes.size()>0&&control==false){
      
        try{
           
              numero=Integer.parseInt(OrdenABorrar.getText());
           if(numero<ordenes.size()&&numero>0){
              OrdenesDelaComadaEditada verduras=new OrdenesDelaComadaEditada(apio1,zanahoria1,cebolla1,chile1,calabaza1,berenjena1,hongos1,bambu1,brocoli1);
              OrdenesDelaComadaEditada proteinas=new OrdenesDelaComadaEditada(Camaron1,Pescado1,Res1,Cordero1,Cerdo1,Pollo1);
              OrdenesDelaComadaEditada radios=new OrdenesDelaComadaEditada(Arrozz,PastaDD,PastaGG,ostiones1,anguila1,huevo1,aguacate1);
              EditarPedido.setVisible(true);
              VerOrdenes.setVisible(false);
              verduras.GetSelecionarVerduras(ordenes,numero);
              proteinas.GetSelecionarProteinas(ordenes,numero);
              radios.GetSelecionarRadios(ordenes,numero);
            }
           else{
              Alert alert = new Alert(AlertType.ERROR);
              alert.setTitle("Dialogo de error");
              alert.setHeaderText("error al editar");
              alert.setContentText("ingrese un numero de orden existente porfavor");
              alert.showAndWait(); 
           }
           
        }catch(Exception e){
           Alert alert = new Alert(AlertType.ERROR);
           alert.setTitle("Dialogo de error");
           alert.setHeaderText("error al editar");
           alert.setContentText("ingrese un numero de las ordenes porfavor");
           alert.showAndWait(); 
        }
     }
       

       
        
        
    }
    
    @FXML
    void ReturnACaja(MouseEvent event) {
       
       if(ordenes.size()<2){
         VerOrdenes.setVisible(false); 
         Principal.setVisible(true);
         NombreDelCliente.setText("");
         TotalDePlatillos.setText("");
        /* inicianilizando el  total el importe y el combio 
           inicialisando todas las ordenes*/
         Total.setText("");
         importe.setText("");
         cambio.setText("");
         ordenes.clear();
       /*oculatando  el  total el importe el combio 
         y los label y el boton*/
        Total.setVisible(false);
        importe.setVisible(false);
        cambio.setVisible(false);
        mt.setVisible(false);
        iImporte.setVisible(false);
        ca.setVisible(false);
        PagarBoton.setVisible(false);   
        VerOrdenes.setVisible(false);
        Principal.setVisible(true);
         
       }
       if(ordenes.size()>0){
          OrdenABorrar.setText("");
          Total.setText("");
          importe.setText("");
          cambio.setText("");
          Total.setVisible(false);
          importe.setVisible(false);
          cambio.setVisible(false);
          mt.setVisible(false);
          iImporte.setVisible(false);
          ca.setVisible(false);
          PagarBoton.setVisible(false);
          VerOrdenes.setVisible(false); 
          Pagar.setVisible(true);
       }
       
       
           
    }

    

    @FXML
    void ElimniarTodo(MouseEvent event) {
     boolean t=true;
        
   if(ordenes.size()>0){
       Alert alert = new Alert(AlertType.INFORMATION);
       alert.setTitle("Ventas  Eliminadas correctamente");
       alert.setHeaderText(null);
       alert.setContentText("Ordenes elminadas correctamente");
       alert.showAndWait(); 
     /*inicializando nombre del cliente en vacio y el total de platillos*/
       NombreDelCliente.setText("");
       TotalDePlatillos.setText("");
    /* inicianilizando el  total el importe y el combio 
       inicialisando todas las ordenes*/
       Total.setText("");
       importe.setText("");
       cambio.setText("");
       ordenes.clear();
    /*oculatando  el  total el importe el combio 
      y los label y el boton*/
      Total.setVisible(false);
      importe.setVisible(false);
      cambio.setVisible(false);
      mt.setVisible(false);
      iImporte.setVisible(false);
      ca.setVisible(false);
      PagarBoton.setVisible(false);   
      Pagar.setVisible(false);
      Principal.setVisible(true);
      t=false;
    }
   
    if(ordenes.size()<1&&t==true){
       Alert alert = new Alert(AlertType.INFORMATION);
       alert.setTitle("Dialogo De Venta");
       alert.setHeaderText("lea la informacion");
       alert.setContentText("Las ordenes  ya no se pueden eliminar una vez relizado el pago exitosamente");
       alert.showAndWait();
    }
   
     
}
    
    @FXML
    void Findia(ActionEvent event) {

        MostrarOrdenes Findia=new MostrarOrdenes();
        Findia.abrirarchivo("findia.txt");
           
    }

    @FXML
    void VolberDespuesDepagar(MouseEvent event) {
     Alert alert = new Alert(AlertType.INFORMATION);
     alert.setTitle("Dialogo De Venta");
     alert.setHeaderText("lea la informacion");
     alert.setContentText("ha salido correcta mente");
     alert.showAndWait();
        
     VolberDespuesDePagar.setVisible(false);
     NombreDelCliente.setText("");
     TotalDePlatillos.setText("");
     Total.setText("");
     importe.setText("");
     cambio.setText("");
     Total.setVisible(false);
     importe.setVisible(false);
     cambio.setVisible(false);
     mt.setVisible(false);
     iImporte.setVisible(false);
     ca.setVisible(false);
     Pagar.setVisible(false);
     Principal.setVisible(true);
     }
    
    
    @FXML
    void IrAregistro(ActionEvent event) {
     Principal.setVisible(false);
     PuntoDeVenta.setVisible(true);
        
    }
    
    
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb){
     // TODO
    }    
    
}



    
    

        
       
 
    

    
 
 
   
    
    


  