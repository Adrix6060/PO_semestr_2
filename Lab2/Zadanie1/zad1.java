import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class zad1  extends JFrame{
    private JButton OKButton;
    private JPasswordField firstPassword;
    private JPasswordField secondPassword;
    private JPanel mainPanel;

    String password1, password2;

    public zad1() {
        super("Passwords");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setSize(300, 150);


        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                password1 = new String(firstPassword.getPassword());
                password2 = new String(secondPassword.getPassword());

                if (password1.equals(password2)){
                    if (password1.equals("codejava")) JOptionPane.showMessageDialog(null, "Congratulation! You entered correct password.");
                    else JOptionPane.showMessageDialog(null, "Wrong password!");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Passwords are not matched!");
                }


            }
        });
    }



    public static void main(String[] args) {
        zad1 frame = new zad1();
        frame.setVisible(true);
    }


}
