import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.ScaleTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;

public class MainController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView btnClickHere;
    
    private ScaleTransition zoomIn;
    
    private ScaleTransition zoomOut;

    @FXML
    void handleBtnClickHere(MouseEvent event) {
        
        zoomIn.setOnFinished(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                
                zoomOut.setByX(-0.2);
                zoomOut.setByY(-0.2);
                zoomOut.play();
            }
            
        });
          
        zoomIn.setByX(0.2);
        zoomIn.setByY(0.2);
        
        zoomIn.play();

    }

    @FXML
    void initialize() {
        assert btnClickHere != null : "fx:id=\"btnClickHere\" was not injected: check your FXML file 'main.fxml'.";

        zoomIn = new ScaleTransition(Duration.millis(20), btnClickHere);
        
        zoomOut = new ScaleTransition(Duration.millis(20), btnClickHere);
        
    }

}







