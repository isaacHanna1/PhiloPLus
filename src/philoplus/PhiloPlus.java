/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package philoplus;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import philoplus.philoPlusClasses.*;

/**
 *
 * @author Seha
 */
public class PhiloPlus extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLFILES/user_login.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("فيلو للمصاعد");
        stage.show();
        ReadingFile.getLinePathToSaveImage("filePath");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);

    }
    
}
