/* 
We only have to keep track of 3 values to perform basic calculations:
    -First Number (the one preceding the operator)
    -Second Number (the one after the operator)
    -The Operator

    For logic see the controller.

    This class needs to provide set, get and reset(? maybe better if done with set) (to 0) methods for each of these.
*/

public class CalcModel {

    enum Operator {
        PLUS,
        MINUS,
        MULTI,
        DEV,
        CAL, // Cal = Calculate
        NIL, // Nothing set
    }

    private int firstNum;
    private int secondNum;
    private Operator operator;

    // set all to zero/
    public CalcModel() {

    }

    // Methods for First Num
    public void setFirstNum() {

    }

    public int getFirstNum() {
        return firstNum;
    }

    // Methods for Second Num
    public void setSecondNum() {

    }

    public int getSecondNum() {
        return secondNum;

    }

    // Methods for Operator
    public void setOperator() {

    }

    public Operator getOperator() {
        return operator;
    }

}
