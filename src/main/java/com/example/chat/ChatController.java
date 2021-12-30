package com.example.chat;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ChatController {
    @FXML
    public TextArea textAreaMain;
    @FXML
    public TextField textFieldChat;

    public void btnSendOneClickAction(ActionEvent actionEvent) {
        textAreaMain.appendText(textFieldChat.getText() + "\n");
        textFieldChat.clear();
    }

    public void textFieldChatSend(ActionEvent actionEvent) {
        textAreaMain.appendText(textFieldChat.getText() + "\n");
        textFieldChat.clear();
    }
}