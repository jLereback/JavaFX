package se.iths.javafx.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.PrintWriter;
import java.net.Socket;

public class ChatViewModel {


    StringProperty message = new SimpleStringProperty();

    ObservableList<String> observableList = FXCollections.observableArrayList();



    public String getMessage() {
        return message.get();
    }

    public StringProperty messageProperty() {
        return message;
    }

    public void setMessage(String message) {
        this.message.set(message);
    }

    public ObservableList<String> getObservableList() {
        return observableList;
    }

    public void setObservableList(ObservableList<String> observableList) {
        this.observableList = observableList;
    }

    public void sendMessage() {
        getObservableList().add(getMessage());
        setMessage("");
    }
}
