package SoftwareCon3;

public class MVC {
    public static void main(String[] args) {
        CalView v = new CalView();
        CalModel m = new CalModel();
        CalController con = new CalController();
        con.setModel(m);
        con.setView(v);
        v.setVisible(true);
    }
}
