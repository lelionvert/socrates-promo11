package fr.lacombe;

public class CalculatorPrice {
    public int calculatePrice(Choice choice) {
        if(choice == Choice.SINGLE) return 610;
        return 410;
    }
}
