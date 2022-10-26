package se.iths.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;

public class HelloController {

    HelloModel helloModel = new HelloModel();

    @FXML
    public Button button1;
    public Label label1;

    @FXML
    public TextField textField1;

    @FXML
    protected void initialize() {
        textField1.textProperty().bindBidirectional(helloModel.textProperty());
        label1.textProperty().bind(helloModel.textProperty());
    }

    @FXML
    protected void onHelloButtonClick() {
        button1.setText("Orange!");
    }
    public void buttonClicked(MouseEvent mouseEvent) {
        if (mouseEvent.isControlDown()) {
            label1.setBackground(Background.fill(Color.ORANGE));
            label1.setText("I am Orange");
            button1.setText("Invisible");
        }
        else {
            label1.setBackground(Background.fill(Color.TRANSPARENT));
            label1.setText("I am invisible");
            button1.setText("Purple");
        }

    }
}