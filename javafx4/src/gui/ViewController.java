package gui;

import java.util.Locale;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController {

	@FXML
	private TextField txtNumber1;

	@FXML
	private TextField txtNumber2;

	@FXML
	private Label resultadoSoma;

	@FXML
	private Button botaoSoma;

	@FXML
	public void onBtSomaAction() {
		
		try {
			Locale.setDefault(Locale.US);
			double numero1 = Double.parseDouble(txtNumber1.getText());
			double numero2 = Double.parseDouble(txtNumber2.getText());
			double soma = numero1 + numero2;
			resultadoSoma.setText(String.format("Soma Total = %.2f", soma));
		} catch (NumberFormatException e) {
			Alerts.showAlert("Error", "Parse Error", e.getMessage(), AlertType.ERROR);
		}
	}

}
