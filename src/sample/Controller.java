package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.awt.*;

public class Controller {
    @FXML
    private TextArea textArea1;
    @FXML
    private TextField textField1;


    @FXML
    public void clickBtn2(ActionEvent actionEvent) {
        textArea1.appendText(textField1.getText() + "\n");
        textField1.clear();
        textField1.requestFocus();
    }
    
}
