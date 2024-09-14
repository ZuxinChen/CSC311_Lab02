package com.example.csc311_lab02;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class LoanController {
    @FXML
    private TextField totalPayment;

    @FXML
    private TextField monthlyPayment;

    @FXML
    private TextField annualInterestRate;

    @FXML
    private TextField numberOfYears;

    @FXML
    private TextField loanAmount;

    @FXML
    private Text errorMessage;

    @FXML
    void loanCalculator(ActionEvent event) {
        calculateLoan();
    }

    private void calculateLoan(){
        double r =getAnnualInterestRate(); // r = Annual Interest Rate
        int t =getNumberOfYears();         // t = number of years
        double P =getLoanAmount();         // P = amount of loan
        double R;                          // R = monthly payment
        double T;                          // T = total payment
        int n = 12;                        // n = 12 monthly payment per years

        R = (P*(r/n))/(1-Math.pow((1+(r/n)),-n*t)); // formula for monthly payment
        T = R*n*t; // total payment

        setMonthlyPayment(R); // print Monthly Payment
        setTotalPayment(T); // print Total Payment
    }


    private void setTotalPayment(double totalPayment) {
        //shows the result in TextField with $ and remain as 2 decimal
        this.totalPayment.setText("$"+String.format("%.2f", totalPayment));
    }

    private void setMonthlyPayment(double monthlyPayment) {
        //shows the result in TextField with $ and remain as 2 decimal
        this.monthlyPayment.setText("$"+String.format("%.2f", monthlyPayment));
    }

    private double getAnnualInterestRate() {
        return getValue(annualInterestRate)/100; // % to decimal number
    }

    private int getNumberOfYears() {
        return (int)getValue(numberOfYears); // integer value for years
    }

    private double getLoanAmount() {
        return getValue(loanAmount); // double value
    }

    // a tool class to using duplicate code
    private double getValue(TextField value){
        String str = value.getText(); // get value from different text field
        // try to converse the string value to be digit value,
        // if the input not digit that will clear and let user enter again
        try{
            errorMessage.setText(""); // Display message is empty for initial settings
            return Double.parseDouble(str);
        }catch (NumberFormatException e){
            value.clear(); // clear the input
            errorMessage.setText("Error!!! Please Enter digit values!!");
        }
        return 0;
    }

}