package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Main extends Application {

    private static Stage stg;

    @Override
    public void start(Stage primaryStage) throws Exception{
        stg = primaryStage;
        primaryStage.setResizable(false); // No permite redimensionar la ventana
        Parent root = FXMLLoader.load(getClass().getResource("LoginMSP.fxml"));
        primaryStage.setTitle("Login"); // Establece el título de la ventana
        primaryStage.setScene(new Scene(root, 800, 600)); // Establece el tamaño de la ventana
        primaryStage.show();
        primaryStage.requestFocus();

        //primaryStage.initStyle(StageStyle.UNDECORATED);
    }


    public void changeScene(String fxml) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource(fxml)); // Carga el archivo FXML correspondiente
        stg.getScene().setRoot(pane); // Establece la raíz de la escena como el nuevo pane
        stg.setResizable(true); // Permite redimensionar la ventana
        stg.setMaximized(true); // Maximiza la ventana
        stg.setTitle("Market Sales Pro"); // Establece el título de la ventana
        //stg.setMaximized(false);
        //stg.setScene(new Scene(pane, 1000, 800));
        //stg.setScene(new Scene(root, 800, 600));
        //stg.initStyle(StageStyle.UNDECORATED);
    }
//    @Override
//    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("vistaPrueba.fxml"));
        //Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//        stage.setTitle("Hola mundo");
//        stage.setScene(scene);
//        stage.show();


//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("LoginMSP.fxml"));
//        Scene scene = new Scene(fxmlLoader.load());
//        stage.setTitle("Market Sales Pro");
//        stage.setScene(scene);
//        stage.show();

//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("VentanaRubros.fxml"));
//        Scene scene = new Scene(fxmlLoader.load());
//        stage.setTitle("Gestión de Rubros");
//        stage.setScene(scene);
//        stage.show();

//        FXMLLoader fxmlLoader = new FXMLLoader(view.Main.class.getResource("view/LoginMSP.fxml"));
//        Scene scene = new Scene(fxmlLoader.load());
 //       stage.setTitle("MSP");
 //       stage.setScene(scene);
 //       stage.setMaximized(true);
//        stage.show();
//    }

    public static void main(String[] args) {
        launch();
    }
}