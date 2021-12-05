/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplicationtest;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author didik
 */
public class JavaFXApplicationTest extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btnOK = new Button();
        Button btnCancel = new Button();
        TextField tf = new TextField();
        Label labelInput = new Label("Input Nama: ");
        Label labelOutput = new Label("Output: ");
        Rectangle rect = new Rectangle(5,95,290,30);
        rect.setFill(Color.BURLYWOOD);
        
        btnOK.setText("OK");
        btnCancel.setText("Cancel");
        
        btnOK.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                labelOutput.setText("Output: "+tf.getText());
            }
        });
        
        btnCancel.setOnAction(event -> {
            System.out.println("Btn Cancel diklik");
        });
        
        btnCancel.setOnMouseEntered(event -> {
            System.out.println("Mouse masuk");
        });
        
        btnCancel.setOnMouseExited(event -> {
            System.out.println("Mouse Keluar");
        });
        
        
        Group root = new Group();
        HBox panel1 = new HBox();
        TilePane panel2 = new TilePane();
        
        panel1.getChildren().add(labelInput);
        panel1.getChildren().add(tf);
        
        panel2.getChildren().addAll(btnCancel,btnOK);
        
        panel1.setLayoutX(10);
        panel1.setLayoutY(10);
        
        panel2.setLayoutX(100);
        panel2.setLayoutY(50);
        
        labelOutput.setLayoutX(10);
        labelOutput.setLayoutY(100);
        
        root.getChildren().addAll(rect,panel1,panel2,labelOutput);
        
        Scene scene = new Scene(root, 300, 250);
        scene.setFill(Color.DARKCYAN);
        panel1.setBackground(new Background(new BackgroundFill(Color.ANTIQUEWHITE,null,null)));
        panel1.setPadding(new Insets(5,5,5,5));
        
        primaryStage.setTitle("Test JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
