package se.iths.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;

public class HelloController {
    @FXML
    private Label textField;

    public Button button1;

    @FXML
    protected void onHelloButtonClick() {
        button1.setText("Orange!");
    }

    public void buttonClicked(MouseEvent mouseEvent) {
        if (mouseEvent.isControlDown()) {
            textField.setBackground(Background.fill(Color.ORANGE));
            textField.setText("I am Orange");
            button1.setText("Invisible");
        }
        else {
            textField.setBackground(Background.fill(Color.TRANSPARENT));
            textField.setText("I am invisible");
            button1.setText("Orange");
        }

    }
}