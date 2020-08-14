import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Padma Gnanapiya (SE/2017/014)
 */


public class CalculatorController {
    private CalculatorView theView;
    private CalculatorModel theModel;

    public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
        this.theView = theView;
        this.theModel = theModel;

        this.theView.addCalculationListener(new CalculateListener());
    }


    public class CalculateListener implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            int firstNumber, secondNumber = 0;
            try {
                firstNumber = theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();
                theModel.addTwoNumber(firstNumber, secondNumber);
                theView.setCalcSolution(theModel.getCalculateValue());
            } catch (NumberFormatException ex) {
                theView.displayErrorMessage("You need enter 2 numbers");
            }
        }


    }
}