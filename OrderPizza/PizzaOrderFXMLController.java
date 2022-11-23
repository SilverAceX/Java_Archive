/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import PizzaClasses.PizzaOrder;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 *
 * @author terer
 */
public class PizzaOrderFXMLController implements Initializable {

    PizzaOrder pizza;
    private TextField txtSize;
    @FXML
    private TextField txtQuantity;
    @FXML
    private Button btnOrder;
    @FXML
    private Button btnReset;
    @FXML
    private TextArea taDisplay;
    @FXML
    private RadioButton radSmall;
    @FXML
    private ToggleGroup pzSizes;
    @FXML
    private RadioButton radMedium;
    @FXML
    private RadioButton radXLarge;
    @FXML
    private RadioButton radLarge;
    @FXML
    private CheckBox chkPepperoni;
    @FXML
    private CheckBox chkMushroom;
    @FXML
    private CheckBox chkGreen;
    @FXML
    private CheckBox chkBacon;
    String toppings = "";

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btnOrder.setDefaultButton(true);  //keyboard shortcut to Enter 
        btnReset.setCancelButton(true); // keyboard shortcut to esc
    }

    @FXML
    private void OnClickOrder(ActionEvent event) {
        if (chkPepperoni.isSelected()){
            toppings += "Pepperoni\n";
        }
        if (chkMushroom.isSelected()){
            toppings += "Mushroom\n";
        }
        if (chkGreen.isSelected()){
            toppings += "Green Peppers\n";
        }
        if (chkBacon.isSelected()){
            toppings += "Bacon\n";
        }
        pizza = new PizzaOrder(((RadioButton) pzSizes.getSelectedToggle()).getText(), Integer.parseInt(txtQuantity.getText()),toppings);
        taDisplay.appendText(pizza.toString());
    }

    @FXML
    private void OnClickReset(ActionEvent event) {
        radSmall.setSelected(false);
        radMedium.setSelected(false);
        radLarge.setSelected(false);
        radXLarge.setSelected(false);
        chkBacon.setSelected(false);
        chkGreen.setSelected(false);
        chkMushroom.setSelected(false);
        chkPepperoni.setSelected(false);
        txtQuantity.clear();
        taDisplay.clear();
    }
}
