import java.util.NoSuchElementException;

public class CalcController {
    private CalcView view;
    private CalcModel model;

    public CalcController(CalcView view, CalcModel model) {
        this.view = view;
        this.model = model;

    }

    // Gets the Buttons from View and adds all the corresponding methods to them
    public void actionBinding() {
        for (int i = 0; i < view.ButtonNumArray.length; i++) {
            final int iCopy = i;
            view.ButtonNumArray[i].addActionListener(e -> numButtonAction(iCopy));
        }

        for (int i = 0; i < view.ButtonOpArray.length; i++) {
            final int iCopy = i;
            view.ButtonOpArray[i].addActionListener(e -> numOpAction(iCopy));
        }
    }

    private void numButtonAction(int num) {
        if (model.getOperator() == CalcModel.Operator.NIL) {
            model.setFirstNum(num + model.getFirstNum() * 10);
        }
        System.err.println(Integer.toString(model.getFirstNum()));
    }

    private void numOpAction(int num) {
        switch (num) {
            // mult x
            case 0:

                break;
            // dev /
            case 1:

                break;
            // add +
            case 2:

                break;
            // sub -
            case 3:

                break;
            // equal =
            case 4:

                break;
            // Clear
            case 5:

                break;
            default:
                throw new NoSuchElementException("This Button should not exist");

        }
    }
}
