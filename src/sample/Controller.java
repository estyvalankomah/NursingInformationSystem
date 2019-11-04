package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

import java.util.EventListener;

public class Controller {
    @FXML
    private Button prescriptionBtn;

    @FXML
    private Button drugsBtn;

    @FXML
    private Button scheduleBtn;

    @FXML
    private Button logoutBtn;

    @FXML
    private Button vitalsBtn;

    @FXML
    private Pane vitalsPane;

    @FXML
    private Pane prescriptionPane;

    @FXML
    private Pane drugsPane;

    @FXML
    private Pane schedulePane;

    @FXML   
    public void onButtonClicked(ActionEvent event){
        if(event.getSource() == vitalsBtn) {
            vitalsPane.toFront();
        }else if(event.getSource() == prescriptionBtn){
            prescriptionPane.toFront();
        }else if(event.getSource() == drugsBtn){
            drugsPane.toFront();
        }else if(event.getSource() == scheduleBtn){
            schedulePane.toFront();
        }else if(event.getSource() == logoutBtn){
            System.out.println("User logged out");
        }
    }
}
