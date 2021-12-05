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
        Button btnRegister = new Button("Register");

        Label label_FirstName = new Label("First Name ");
        Label label_LastName = new Label("Last Name ");
        Label label_Email = new Label("E-Mail Address ");
        Label label_Contact = new Label("Contact No ");
        Label label_Password = new Label("Password ");
        Label label_ConfirmPassword = new Label("Confirm Password ");

        TextField tf_FirstName = new TextField();
        TextField tf_LastName = new TextField();
        TextField tf_Email = new TextField();
        TextField tf_Contact = new TextField();
        TextField tf_Password = new TextField();
        TextField tf_ConfirmPassword = new TextField();

        HBox hbox_FirstName = new HBox();
        HBox hbox_LastName = new HBox();
        HBox hbox_Email = new HBox();
        HBox hbox_Contact = new HBox();
        HBox hbox_Password = new HBox();
        HBox hbox_ConfirmPassword = new HBox();
        
        VBox vbox_FieldHolder = new VBox();
        
        /*Button btnCancel = new Button();
        Label labelOutput = new Label("Output: ");
        Rectangle rect = new Rectangle(5,95,290,30);
        rect.setFill(Color.BURLYWOOD);
        
        
        btnCancel.setText("Cancel");
        
        btnOk.setOnAction(new EventHandler<ActionEvent>() {
            
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
        });*/
        
        hbox_FirstName.getChildren().addAll(label_FirstName, tf_FirstName);
        hbox_FirstName.setSpacing(50);

        hbox_LastName.getChildren().addAll(label_LastName, tf_LastName);
        hbox_LastName.setSpacing(51);

        hbox_Email.getChildren().addAll(label_Email, tf_Email);
        hbox_Email.setSpacing(29);

        hbox_Contact.getChildren().addAll(label_Contact, tf_Contact);
        hbox_Contact.setSpacing(49);

        hbox_Password.getChildren().addAll(label_Password, tf_Password);
        hbox_Password.setSpacing(59);
        
        hbox_ConfirmPassword.getChildren().addAll(label_ConfirmPassword, tf_ConfirmPassword);
        hbox_ConfirmPassword.setSpacing(14);

        vbox_FieldHolder.getChildren().addAll(hbox_FirstName, hbox_LastName, hbox_Email, hbox_Contact, hbox_Password, hbox_ConfirmPassword);
        vbox_FieldHolder.setSpacing(10);

        vbox_FieldHolder.setLayoutX(30);
        vbox_FieldHolder.setLayoutY(30);

        Group group = new Group();
        TilePane tp_Panel2 = new TilePane();
        
        tp_Panel2.getChildren().addAll(btnRegister);
        btnRegister.setStyle("-fx-background-color: #3d85c6; ");
        
        tp_Panel2.setLayoutX(150);
        tp_Panel2.setLayoutY(250);
        
        //labelOutput.setLayoutX(10);
        //labelOutput.setLayoutY(100);
        
        group.getChildren().addAll(vbox_FieldHolder, tp_Panel2);//,labelOutput);
        
        Scene scene = new Scene(group, 350, 300);
        scene.setFill(Color.WHITE);
        //hbox_Panel1.setBackground(new Background(new BackgroundFill(Color.ANTIQUEWHITE,null,null)));
        //hbox_Panel1.setPadding(new Insets(5,5,5,5));
        
        primaryStage.setTitle("Registrasi");
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