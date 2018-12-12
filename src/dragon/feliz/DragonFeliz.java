/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dragon.feliz;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author PC
 */
public class DragonFeliz extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        stage.setTitle("Dragon Feliz");
        String css=DragonFeliz.class.getResource("estilo.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.show();
       // stage.getIcons().add(new Image("usuario1.jpg"));//(/carpeta/name.jpg);
      
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
