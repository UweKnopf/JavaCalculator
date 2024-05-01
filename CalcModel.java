/* 
We only have to keep track of 3 values to perform basic calculations:
    -First Number (the one preceding the operator)
    -Second Number (the one after the operator)
    -The Operator

    For logic see the controller.

    This class needs to provide set, get and reset(? maybe better if done with set) (to 0) methods for each of these.
*/

public class CalcModel {

    public enum Operator {
        PLUS,
        MINUS,
        MULTI,
        DEV,
        CAL, // Cal = Calculate
        NIL, // Nothing set
    };

    private int firstNum;
    private int secondNum;
    private Operator operator;

    // set all to zero/
    public CalcModel() {
        firstNum = 0;
        secondNum = 0;
        operator = Operator.NIL;
    }

    // Methods for First Num
    public void setFirstNum(int num) {
        firstNum = num;
    }

    public int getFirstNum() {
        return firstNum;
    }

    // Methods for Second Num
    public void setSecondNum(int num) {
        secondNum = num;
    }

    public int getSecondNum() {
        return secondNum;

    }

    // Methods for Operator
    public void setOperator(Operator op) {
        operator = op;
    }

    public Operator getOperator() {
        return operator;
    }

}
