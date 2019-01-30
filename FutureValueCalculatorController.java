/**
 * Sample Skeleton for 'Untitled' Controller Class
 */

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

import java.math.BigDecimal;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;


public class FutureValueCalculatorController {
    private int years;
    private double invAmount,rate;
    private BigDecimal invFinal;

    @FXML // fx:id="txtInvAmount"
    private TextField txtInvAmount; // Value injected by FXMLLoader

    @FXML // fx:id="txtYears"
    private TextField txtYears; // Value injected by FXMLLoader

    @FXML // fx:id="txtInterestRate"
    private TextField txtInterestRate; // Value injected by FXMLLoader

    @FXML // fx:id="txtFuture"
    private TextField txtFuture; // Value injected by FXMLLoader

    @FXML // fx:id="buttonCalculate"
    private Button buttonCalculate; // Value injected by FXMLLoader

    @FXML
    void calculateButtonPressed(ActionEvent event) {
        try{
            txtFuture.setText("");
            invAmount = Double.parseDouble(txtInvAmount.getText());
            years = Integer.parseInt(txtYears.getText());
            rate = Double.parseDouble(txtInterestRate.getText())/100;
            invFinal = new BigDecimal(invAmount * Math.pow(1+rate,years));
            txtFuture.setText("$" + invFinal.setScale(2,BigDecimal.ROUND_CEILING).toString());
        }
        catch(Exception e){
            txtFuture.setText("Error");
        }
    }

}
