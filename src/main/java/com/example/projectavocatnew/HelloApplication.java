package com.example.projectavocatnew;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.scene.text.FontPosture.*;

public class HelloApplication extends Application {
    private Label lusername= new Label("اسم المستخدم");
    private TextField username= new TextField();
    private Label lpassword= new Label(("كلمة السر"));
    private PasswordField password= new PasswordField();

    private Button login= new Button(" تسجيل الدخول");
    private Button  signup= new Button("مستخدم جديد");
    private Label FirstName= new Label("الاسم الشخصي");
    private Label LastName= new Label("الاسم العاىلي");
    private  Label Gmail= new Label("البريد الالكتروني");
    private Label Password= new Label("كلمة السر");
    private TextField FName= new TextField();
    private TextField LName= new TextField();
    private TextField Gml= new TextField();
    private TextField Pass= new TextField();

    @Override
    public void start(Stage stage) throws IOException {
        lusername.setFont(Font.font("Times New Roman",
                FontWeight.NORMAL, REGULAR, 40));
        username.setFont(Font.font("Times New Roman",
                FontWeight.NORMAL, REGULAR, 30));
        lpassword.setFont(Font.font("Times New Roman",
                FontWeight.NORMAL, REGULAR, 40));
        password.setFont(Font.font("Times New Roman",
                FontWeight.NORMAL, REGULAR, 30));
        login.setFont(Font.font("Times New Roman",
                FontWeight.NORMAL, REGULAR, 40));
        signup.setFont(Font.font("Times New Roman",
                FontWeight.NORMAL, REGULAR, 40));
        GridPane gridPane= new GridPane();
        gridPane.setHgap(5);
        gridPane.setVgap(10);


        gridPane.add(lusername,1,0);
        gridPane.add(username,0,0);
        gridPane.add(lpassword,1,1);
        gridPane.add(password,0,1);
        gridPane.add(login,0,2);
        gridPane.add(signup,0,3);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setStyle("-fx-background-color: #DAA520;");
        Scene scene=new Scene(gridPane, 600,600);
        stage.setTitle("Advocate");
        stage.setScene(scene);
        stage.show();

        login.setOnAction(e->
        {
            GridPane gridPane1=new GridPane();
            Scene scene1= new Scene(gridPane1, 500,500);
            stage.setScene(scene1);
        });
        signup.setOnAction(e->{
            GridPane gridPane1= new GridPane();


        });


    }

    public static void main(String[] args) {
        launch();
    }
}

//uhikjij