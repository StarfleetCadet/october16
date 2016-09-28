/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author aviva
 */
public class Car2 extends Application {
    
    @Override
    public void start(Stage stage) 
    {
        Label label = new Label ("");
        Button btnRun = new Button ("RUN");
        Button btnStop = new Button ("STOP");
        
        btnRun.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
            
                label.setText("drive");
            }
        });
        
        btnStop.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                // carLabel.setText() statt sout
                label.setText("stop");
            }
        });
        
        // Scene Layout einrichten, Border Pane einrichten
        BorderPane pane = new BorderPane();        
        
        pane.setCenter(label);
        pane.setLeft(btnRun);
        pane.setRight(btnStop);
        // Scene einrichten
        Scene scene = new Scene(pane);
        // Stage einrichten
        stage.setScene(scene);
        //stage.setOnCloseRequest(event -> { beenden(); });
        stage.setHeight(150); // Höhe
        stage.setWidth(200);  // Breite
        stage.setX(1000);
        stage.centerOnScreen();  // Position des linken, oberen Rand
        stage.setTitle("Car");
        stage.show();
      
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
