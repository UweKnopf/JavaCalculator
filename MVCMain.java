public class MVCMain {

    public static void main(String[] args) {
        CalcView view = new CalcView();
        CalcModel model = new CalcModel();
        CalcController controller = new CalcController(view, model);

        controller.actionBinding();

    }
}
