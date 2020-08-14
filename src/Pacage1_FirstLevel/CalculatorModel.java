package Pacage1_FirstLevel;

/**
 * Created by Padma Gnanapiya (SE/2017/014)
 */


public class CalculatorModel {
    private int calculateValue;

    public void addTwoNumber(int firstNumber, int secondNumber){
        calculateValue=firstNumber+secondNumber;
    }

    public int getCalculateValue(){
        return calculateValue;
    }
}
