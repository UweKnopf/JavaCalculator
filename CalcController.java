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
            view.UpdateCalcView(model.getFirstNum());
        } else {
            model.setSecondNum(num + model.getSecondNum() * 10);
            view.UpdateCalcView(model.getSecondNum());
        }
        System.err.println(Integer.toString(model.getFirstNum()));
        System.err.println(Integer.toString(model.getSecondNum()));
    }

    private void numOpAction(int num) {
        // For chaining operators together
        if (model.getOperator() != CalcModel.Operator.NIL) {
            calculate();
        }
        switch (num) {
            // mult x
            case 0:
                model.setOperator(CalcModel.Operator.MULTI);

                break;
            // dev /
            case 1:
                model.setOperator(CalcModel.Operator.DEV);

                break;
            // add +
            case 2:
                model.setOperator(CalcModel.Operator.ADD);

                break;
            // sub -
            case 3:
                model.setOperator(CalcModel.Operator.SUB);

                break;
            // equal =
            case 4:
                // new method to calculate?
                // model.setOperator(CalcModel.Operator.CAL);
                if (model.getOperator() == CalcModel.Operator.NIL) {

                } else {
                    calculate();

                }

                // model.setFirstNum(num + model.getFirstNum() * 10);

                break;
            // Clear
            case 5:
                // Maybe better to set this somewhere else by using the setOperator
                model.setFirstNum(0);
                model.setSecondNum(0);
                model.setOperator(CalcModel.Operator.NIL);
                view.UpdateCalcView(model.getFirstNum());

                break;
            default:
                throw new NoSuchElementException("This Button should not exist");

        }
    }

    private void calculate() {
        switch (model.getOperator()) {
            case MULTI:
                model.setFirstNum(model.getFirstNum() * model.getSecondNum());
                model.setSecondNum(0);
                break;

            case DEV:
                model.setFirstNum(model.getFirstNum() / model.getSecondNum());
                model.setSecondNum(0);

                break;

            case ADD:
                model.setFirstNum(model.getFirstNum() + model.getSecondNum());
                model.setSecondNum(0);

                break;

            case SUB:
                model.setFirstNum(model.getFirstNum() - model.getSecondNum());
                model.setSecondNum(0);

                break;

            default:
                break;
        }

        model.setOperator(CalcModel.Operator.NIL);

        System.err.println(Integer.toString(model.getFirstNum()));
        System.err.println(Integer.toString(model.getSecondNum()));
        view.UpdateCalcView(model.getFirstNum());

    }
}
