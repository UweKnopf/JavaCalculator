/* 
We only have to keep track of 3 values to perform basic calculations:
    -First Number (the one preceding the operator)
    -Second Number (the one after the operator)
    -The Operator

    For logic see the controller.

    This class needs to provide set, get and reset(? maybe better if done with set) (to 0) methods for each of these.
*/

enum Operator {
    PLUS,
    MINUS,
    MULTI,
    DEV,
    CAL, // Cal = Calculate
    NIL, // Nothing set
}

public class CalcModel {
    private int firstNum;
    private int secondNum;
    private Operator operator;

    // set all to zero/
    public CalcModel() {

    }

    // Methods for First Num
    public void setFirstNum() {

    }

    public void getFirstNum() {

    }

    // Methods for Second Num
    public void setSecondNum() {

    }

    public void getSecondNum() {

    }

    // Methods for Operator
    public void setOperator() {

    }

    public void getOperator() {

    }

}
