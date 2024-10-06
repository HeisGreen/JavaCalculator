package com.example.calculatorapp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.nio.channels.IllegalBlockingModeException;

public class HelloController {

    @FXML
    private Button btn0;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btn4;

    @FXML
    private Button btn5;

    @FXML
    private Button btn6;

    @FXML
    private Button btn7;

    @FXML
    private Button btn8;

    @FXML
    private Button btn9;

    @FXML
    private Button btnAsteric;

    @FXML
    private Button btnC;

    @FXML
    private Button btnCe;

    @FXML
    private Button btnDot;

    @FXML
    private Button btnEqualTo;

    @FXML
    private Button btnMinus;

    @FXML
    private Button btnOnOff;

    @FXML
    private Button btnPlus;

    @FXML
    private Button btnSlash;

    @FXML
    private Label lbAnswer;

    @FXML
    private TextField txtShow;

    private double answer;
    private String function = "empty";

public void initialize(){
    answer=0;
    lbAnswer.setText(String.format("%.02f",answer));

    functions();
}


public void functions(){
    btnC.setOnAction(event -> {
        txtShow.clear();
    });
    btnCe.setOnAction(event -> {
        function = "empty";
        answer = 0;
        lbAnswer.setText("0");
    });
    btn0.setOnAction(event -> {
        txtShow.setText(txtShow.getText()!=null? txtShow.getText() + "0" :"0");
    });
    btn1.setOnAction(event -> {
        txtShow.setText(txtShow.getText()!=null? txtShow.getText() + "1" :"1");
    });
    btn2.setOnAction(event -> {
        txtShow.setText(txtShow.getText()!=null? txtShow.getText() + "2" :"2");
    });
    btn3.setOnAction(event -> {
        txtShow.setText(txtShow.getText()!=null? txtShow.getText() + "3" :"3");
    });
    btn4.setOnAction(event -> {
        txtShow.setText(txtShow.getText()!=null? txtShow.getText() + "4" :"4");
    });
    btn5.setOnAction(event -> {
        txtShow.setText(txtShow.getText()!=null? txtShow.getText() + "5" :"5");
    });
    btn6.setOnAction(event -> {
        txtShow.setText(txtShow.getText()!=null? txtShow.getText() + "6" :"6");
    });
    btn7.setOnAction(event -> {
        txtShow.setText(txtShow.getText()!=null? txtShow.getText() + "7" :"7");
    });
    btn8.setOnAction(event -> {
        txtShow.setText(txtShow.getText()!=null? txtShow.getText() + "8" :"8");
    });
    btn9.setOnAction(event -> {
        txtShow.setText(txtShow.getText()!=null? txtShow.getText() + "9" :"9");
    });
    btnDot.setOnAction(event -> {
        txtShow.setText(txtShow.getText()!=null? txtShow.getText() + "." :"0.");
    });

    btnPlus.setOnAction(event -> {
        action();
        function = "sum";
    });
    btnMinus.setOnAction(event -> {
        action();
        function = "minus";
    });
    btnSlash.setOnAction(event -> {
        action();
        function = "div";
    });
    btnAsteric.setOnAction(event -> {
        action();
        function = "multi";
    });
    btnEqualTo.setOnAction(event -> {
        action();
        function = "equal";
    });

}
    private void setAnswer(){
        lbAnswer.setText(String.format("%.02f", answer));
        txtShow.clear();
    }

    private void action(){
        switch (function){
            case "empty" : answer = Double.parseDouble(txtShow.getText());
                setAnswer();break;
            case "sum" : answer += Double.parseDouble(txtShow.getText());
                setAnswer();break;
            case "minus" : answer -= Double.parseDouble(txtShow.getText());
                setAnswer();break;
            case "multi" : answer *= Double.parseDouble(txtShow.getText());
                setAnswer();break;
            case "div" : answer /= Double.parseDouble(txtShow.getText());
                setAnswer();break;
            case "equal" : setAnswer();break;
        }

    }

    private void off(){
        btn0.setDisable(true);
        btn1.setDisable(true);
        btn2.setDisable(true);
        btn3.setDisable(true);
        btn4.setDisable(true);
        btn5.setDisable(true);
        btn6.setDisable(true);
        btn7.setDisable(true);
        btn8.setDisable(true);
        btn9.setDisable(true);
        btnAsteric.setDisable(true);
        btnC.setDisable(true);
        btnCe.setDisable(true);
        btnDot.setDisable(true);
        btnSlash.setDisable(true);
        btnPlus.setDisable(true);
        btnEqualTo.setDisable(true);
        btnMinus.setDisable(true);
        txtShow.clear();
        function = "empty";
        setAnswer();
        lbAnswer.setText("");
    }

    private void on(){
        btnOnOff.setDisable(false);
        btn0.setDisable(false);
        btn1.setDisable(false);
        btn2.setDisable(false);
        btn3.setDisable(false);
        btn4.setDisable(false);
        btn5.setDisable(false);
        btn6.setDisable(false);
        btn7.setDisable(false);
        btn8.setDisable(false);
        btn9.setDisable(false);
        btnAsteric.setDisable(false);
        btnC.setDisable(false);
        btnCe.setDisable(false);
        btnDot.setDisable(false);
        btnSlash.setDisable(false);
        btnPlus.setDisable(false);
        btnEqualTo.setDisable(false);
        btnMinus.setDisable(false);
        txtShow.clear();
        function = "empty";
        setAnswer();
        lbAnswer.setText("0");
    }
    @FXML
    private void onOffFunction() {
        if (btnOnOff.getText().equals("ON")) {
            off();
            btnOnOff.setText("OFF");
        } else {
            on();
            btnOnOff.setText("ON");
        }
    }

}