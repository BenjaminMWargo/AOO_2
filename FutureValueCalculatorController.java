/**
 * Sample Skeleton for 'Untitled' Controller Class
 */

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class FutureValueCalculatorController {

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

    }

}
