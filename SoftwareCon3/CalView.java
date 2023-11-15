package SoftwareCon3;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author surface
 */
public class CalView extends javax.swing.JFrame {

    private final JTextField txtNum1 = new JTextField(10);
    private final JLabel lblAdd = new JLabel("-");
    private final JTextField txtNum2 = new JTextField(10);
    private final JButton btnSum = new JButton("Calculate");
    private final JTextField txtAns = new JTextField(10);

    public CalView() {
        // set all of component to JPanal via constructor
        JPanel calcPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);

        calcPanel.add(txtNum1);

        calcPanel.add(lblAdd);

        calcPanel.add(txtNum2);

        calcPanel.add(btnSum);

        calcPanel.add(txtAns);

        this.add(calcPanel);
    }

    public int getTxtNum1() {

        return Integer.parseInt(txtNum1.getText());
    }

    public int getTxtNum2() {

        return Integer.parseInt(txtNum2.getText());

    }

    public void setTxtAns(int sum) {

        txtAns.setText(Integer.toString(sum));

    }

    // If btnSum clicked execute a method

    // use to set action of button

    void addActionListener(ActionListener actionPerformed) {

        btnSum.addActionListener(actionPerformed);
    }

    // show error message

    void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}
