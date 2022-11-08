import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class chackbox extends JFrame{
    private JCheckBox javaCheck;
    private JCheckBox cshCheck;
    private JCheckBox pythonCheck;
    private JCheckBox cppCheck;
    private JButton OKButton;
    private JPanel mainPanel;
    int costs;
    String message = "";

    public chackbox() {
        super("Chackbox");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setSize(400, 300);
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (javaCheck.isSelected()){
                    costs +=3500;
                    message += "\nJava #price 3500 PLN";
                }
                if (cppCheck.isSelected()){
                    costs +=4000;
                    message += "\nC++ #price 4000 PLN";
                }
                if (cshCheck.isSelected()){
                    costs +=3000;
                    message += "\nC# #price 3000 PLN";
                }
                if (pythonCheck.isSelected()){
                    costs +=5000;
                    message += "\nPython #price 5000 PLN";
                }
                message +="\n--------------------\nRazem: "+ costs;

                JOptionPane.showMessageDialog(null , message);
            }
        });
    }

    public static void main(String[] args) {
        chackbox frame = new chackbox();
        frame.setVisible(true);


    }
}
