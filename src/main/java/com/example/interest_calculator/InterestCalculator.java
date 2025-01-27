package com.example.interest_calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class InterestCalculator {
    @FXML
    private TextField principle;
    @FXML
    private TextField time;
    @FXML
    private TextField rate;
    @FXML
    private TextField interest;
    @FXML
    private Button calculate;
    @FXML
    private Label result;

    @FXML
    protected void onCalculateButtonClick() {
        try {
            // Parse input values from text fields
            double p = Double.parseDouble(principle.getText());
            double t = Double.parseDouble(time.getText());
            double r = Double.parseDouble(rate.getText());

            // Calculate simple interest
            double simpleInterest = (p * r * t) / 100;

            // Display result in the interest text field
            interest.setText(String.format("%.2f", simpleInterest));

            // Optionally display a message in the result label
            result.setText("Calculation successful!");
        } catch (NumberFormatException e) {
            // Handle invalid input
            result.setText("Please enter valid numeric values!");
        }
    }
}
