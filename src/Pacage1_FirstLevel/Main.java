package Pacage1_FirstLevel;

import Pacage1_FirstLevel.CalculatorController;
import Pacage1_FirstLevel.CalculatorModel;
import Pacage1_FirstLevel.CalculatorView;

/**
 * Created by Padma Gnanapiya (SE/2017/014)
 */


public class Main {
    public static void main(String[] args) {
        CalculatorView calculatorView=new CalculatorView();
        CalculatorModel calculatorModel=new CalculatorModel();
        CalculatorController calculatorController=new CalculatorController(calculatorView, calculatorModel);
        calculatorView.setVisible(true);
    }
}
