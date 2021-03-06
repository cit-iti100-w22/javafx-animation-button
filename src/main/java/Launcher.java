import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class Launcher extends Application {

    int count = 0;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("/fxml/main.fxml"));

        Scene scene = new Scene(root);

        primaryStage.setTitle("animation");
        primaryStage.setMinHeight(480);
        primaryStage.setMinWidth(640);
        primaryStage.setScene(scene);
        
        primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
        
        	@Override
            public void handle(WindowEvent t) {
                Platform.exit();
                System.exit(0);
            }
        });
        
        primaryStage.show();
    }
}