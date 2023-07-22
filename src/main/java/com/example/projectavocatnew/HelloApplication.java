package com.example.projectavocatnew;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
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
    private Label lusername= new Label("اسم المستخدم :");
    private TextField username= new TextField();
    private Label lpassword= new Label("كلمة السر :");
    private PasswordField password= new PasswordField();
    private Button login= new Button(" تسجيل الدخول");
    private Button  signup= new Button("مستخدم جديد ");
    private Button click1 = new Button("انقر هنا");
    private Button click2 = new Button("انقر هنا");
    private Label FirstName= new Label("الاسم الشخصي :");
    private Label LastName= new Label("الاسم العائلي :");
    private  Label Gmail= new Label("البريد الالكتروني :");
    private Label Password= new Label("كلمة السر :");
    private Label bDateLbl = new Label("تاريخ الميلاد :");
    private Label genderLbl = new Label("جنس :");
    private Label clientsName = new Label ("الاسم الشخصي للعميل :");
    private Label clientLastName = new Label ("الاسم العائلي للعميل :");
    private Label genderLbl2 = new Label("جنس :");
    private Label bDateLbl2 = new Label("تاريخ الميلاد :");
    private Label courtName = new Label ("المحكمة :");
   private Label createFolder = new Label("إنشاء مجلد لعميل جديد :");
   private Label modidication = new Label("تعديل ملف العميل :");
   private Label courtCity = new Label("المدينة :");
   private Label welcome = new Label("مرحبا في فضائك الخاص");

    //DatePickers
    private DatePicker bDateFld = new DatePicker();
    private DatePicker bDateFld2 = new DatePicker();

    // ChoiceBoxes
    private ChoiceBox<String> genderFld = new ChoiceBox<>();
    private ChoiceBox<String> genderFld2 = new ChoiceBox<>();
    private ChoiceBox<String> courtFld = new ChoiceBox<>();
    private ChoiceBox<String> citiesFld = new ChoiceBox<>();

    // TextFields
    private TextField FName= new TextField();
    private TextField LName= new TextField();
    private TextField Gml= new TextField();
    private TextField Pass= new TextField();
    private TextField tfCliName= new TextField();
    private TextField tfCliLastName= new TextField();




    @Override
    public void start(Stage stage) throws IOException {

        lusername.setFont(Font.font("Times New Roman", FontWeight.NORMAL, REGULAR, 40));
        username.setFont(Font.font( "Times New Roman",  FontWeight.NORMAL, REGULAR, 30));
        lpassword.setFont(Font.font("Times New Roman", FontWeight.NORMAL, REGULAR, 40));
        password.setFont(Font.font( "Times New Roman",  FontWeight.NORMAL, REGULAR, 30));
        login.setFont(Font.font(    "Times New Roman",     FontWeight.NORMAL, REGULAR, 40));
        signup.setFont(Font.font("Times New Roman", FontWeight.NORMAL, REGULAR, 40));
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

        // Sign in
        login.setOnAction(e->
        {
            welcome.setFont(Font.font("Times New Roman", FontWeight.NORMAL, REGULAR, 40));
            createFolder.setFont(Font.font("Times New Roman", FontWeight.NORMAL, REGULAR, 40));
            click1.setFont(Font.font( "Times New Roman",  FontWeight.NORMAL, REGULAR, 30));
            modidication.setFont(Font.font("Times New Roman", FontWeight.NORMAL, REGULAR, 40));
            click2.setFont(Font.font( "Times New Roman",  FontWeight.NORMAL, REGULAR, 30));


            GridPane gridPane1=new GridPane();
            gridPane1.setHgap(5);
            gridPane1.setVgap(10);

            gridPane1.add(createFolder,1,0);
            gridPane1.add(click1,0,0);
            gridPane1.add(modidication,1,1);
            gridPane1.add(click2,0,1);

            gridPane1.setAlignment(Pos.CENTER);
            gridPane1.setStyle("-fx-background-color: #DAA520;");

            BorderPane pane = new BorderPane();
            pane.setRight(welcome);
            pane.setCenter(gridPane1);
            pane.setStyle("-fx-background-color: #DAA520;");

            Scene scene1= new Scene(pane, 500,500);
            stage.setScene(scene1);
        });

        // New Client
        click1.setOnAction( e-> {

            // setting Font for labels and textFields
            clientsName.setFont(Font.font("Times New Roman", FontWeight.NORMAL, REGULAR, 40));
            tfCliName.setFont(Font.font("Times New Roman", FontWeight.NORMAL, REGULAR, 30));
            clientLastName.setFont(Font.font("Times New Roman", FontWeight.NORMAL, REGULAR, 40));
            tfCliLastName.setFont(Font.font("Times New Roman", FontWeight.NORMAL, REGULAR, 30));
            bDateLbl2.setFont(Font.font("Times New Roman", FontWeight.NORMAL, REGULAR, 40));
            genderLbl2.setFont(Font.font("Times New Roman", FontWeight.NORMAL, REGULAR, 40));
            courtName.setFont(Font.font("Times New Roman", FontWeight.NORMAL, REGULAR, 40));
            courtCity.setFont(Font.font("Times New Roman", FontWeight.NORMAL, REGULAR, 40));



            // set Font for DatePicker
            Font customFont1 = new Font("Times New Roman", 30); // Replace with your desired font and size
            bDateFld2.setStyle("-fx-font-family: " + customFont1.getFamily() + "; -fx-font-size: " + customFont1.getSize() + "px;");

            // set Font for ChoiceBox
            Font customFont3 = new Font("Times New Roman", 30); // Replace with your desired font and size
            courtFld.setStyle("-fx-font-family: " + customFont3.getFamily() + "; -fx-font-size: " + customFont3.getSize() + "px;");

            Font customFont4 = new Font("Times New Roman", 30); // Replace with your desired font and size
            citiesFld.setStyle("-fx-font-family: " + customFont4.getFamily() + "; -fx-font-size: " + customFont4.getSize() + "px;");

            //add Items to choiceBox
            courtFld.getItems().addAll("محكمة الاستئناف","محكمة الاستئناف الإدارية", "المحكمة الابتدائية","المحكمة الابتدائية الإدارية",
                    "المحكمة العليا","محكمة النقض","محاكم الاستئناف الإدارية المتخصصة");

            citiesFld.getItems().addAll("مراكش","الرباط","الدارالبيضاء","فاس","طنجة","مكناس","أكادير","وجدة");

            genderFld2.getItems().addAll("ذكر", "أنثى");

            //create a gridPane
            GridPane gridPane3= new GridPane();
            gridPane3.setHgap(5);
            gridPane3.setVgap(10);

            gridPane3.add(clientsName,1,0);
            gridPane3.add(tfCliName,0,0);
            gridPane3.add(clientLastName,1,1);
            gridPane3.add(tfCliLastName,0,1);
            gridPane3.add(bDateLbl2,1,2);
            gridPane3.add(bDateFld2,0,2);
            gridPane3.add(genderLbl2,1,3);
            gridPane3.add(genderFld2,0,3);
            gridPane3.add(courtName,1,4);
            gridPane3.add(courtFld,0,4);
            gridPane3.add(courtCity,1,5);
            gridPane3.add(citiesFld,0,5);

            // resize choiceBox and DatePicker
            genderFld2.setPrefWidth(450);
            bDateFld2.setPrefWidth(450);
            courtFld.setPrefWidth(450);
            citiesFld.setPrefWidth(450);

            gridPane3.setAlignment(Pos.CENTER);
            gridPane3.setStyle("-fx-background-color: #DAA520;");


            Scene scene3= new Scene(gridPane3, 500,500);
            stage.setTitle("إنشاء مجلد لعميل جديد");
            stage.setScene(scene3);


        });

        // new signup
        signup.setOnAction( e-> {

            // setting Font for labels and textFields
            FirstName.setFont(Font.font("Times New Roman", FontWeight.NORMAL, REGULAR, 40));
            FName.setFont(Font.font("Times New Roman", FontWeight.NORMAL, REGULAR, 30));
            LastName.setFont(Font.font("Times New Roman", FontWeight.NORMAL, REGULAR, 40));
            LName.setFont(Font.font("Times New Roman", FontWeight.NORMAL, REGULAR, 30));
            Gmail.setFont(Font.font("Times New Roman", FontWeight.NORMAL, REGULAR, 40));
            Gml.setFont(Font.font("Times New Roman", FontWeight.NORMAL, REGULAR, 30));
            Password.setFont(Font.font("Times New Roman", FontWeight.NORMAL, REGULAR, 40));
            Pass.setFont(Font.font("Times New Roman", FontWeight.NORMAL, REGULAR, 30));
            bDateLbl.setFont(Font.font("Times New Roman", FontWeight.NORMAL, REGULAR, 40));
            genderLbl.setFont(Font.font("Times New Roman", FontWeight.NORMAL, REGULAR, 40));

            // set Font for DatePicker
            Font customFont = new Font("Times New Roman", 30); // Replace with your desired font and size
            bDateFld.setStyle("-fx-font-family: " + customFont.getFamily() + "; -fx-font-size: " + customFont.getSize() + "px;");

            // set Font for ChoiceBox
            Font customFont2 = new Font("Times New Roman", 30); // Replace with your desired font and size
            genderFld.setStyle("-fx-font-family: " + customFont2.getFamily() + "; -fx-font-size: " + customFont2.getSize() + "px;");

            //add genders to choiceBox
            genderFld.getItems().addAll("ذكر", "أنثى");

            //create a gridPane
            GridPane gridPane2= new GridPane();
            gridPane2.setHgap(5);
            gridPane2.setVgap(10);

            gridPane2.add(FirstName,1,0);
            gridPane2.add(FName,0,0);
            gridPane2.add(LastName,1,1);
            gridPane2.add(LName,0,1);
            gridPane2.add(Gmail,1,2);
            gridPane2.add(Gml,0,2);
            gridPane2.add(bDateLbl,1,3);
            gridPane2.add(bDateFld,0,3);
            gridPane2.add(genderLbl,1,4);
            gridPane2.add(genderFld,0,4);
            gridPane2.add(Password,1,5);
            gridPane2.add(Pass,0,5);

            // resize choiceBox and DatePicker
            genderFld.setPrefWidth(450);
            bDateFld.setPrefWidth(450);

            gridPane2.setAlignment(Pos.CENTER);
            gridPane2.setStyle("-fx-background-color: #DAA520;");


            Scene scene2= new Scene(gridPane2, 500,500);
            stage.setTitle("مستخدم جديد");
            stage.setScene(scene2);


        });


    }

    public static void main(String[] args) {
        launch();
    }
}

