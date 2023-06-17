import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
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

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("view/VentanaPrincipal.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("MSP");
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}