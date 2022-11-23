/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */


import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author terer
 */
public class PizzaFXMain extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        try{
            //the root of the scene shown in the main window
           Parent root = FXMLLoader.load(getClass().getResource("PizzaOrderFXML.fxml"));
           //create the scene specifying the root
           Scene scene = new Scene(root);
        
        primaryStage.setTitle("Pizza Order");
        //add scene to the stage
        primaryStage.setScene(scene);
        //make the stage visible
        primaryStage.show();
       }catch(IOException e){
           System.out.println(e.toString());
       }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
