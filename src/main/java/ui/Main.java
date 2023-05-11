package ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import jfxtras.styles.jmetro.JMetro;
import jfxtras.styles.jmetro.Style;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/ui/homeView/Home.fxml"));

        Parent root = fxmlLoader.load();

        JMetro jMetro = new JMetro(root, Style.LIGHT);

        primaryStage.setScene(new Scene(root));

        primaryStage.sizeToScene();

        primaryStage.show();
    }
}
