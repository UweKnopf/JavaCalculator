
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
    }

    private void numButtonAction(int num) {
        if (model.getOperator() == CalcModel.Operator.NIL) {
            model.setFirstNum(num + model.getFirstNum() * 10);
        }
        // System.err.println(Integer.toString(model.getFirstNum()));
    }

}
