module com.example.interest_calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.interest_calculator to javafx.fxml;
    exports com.example.interest_calculator;
}