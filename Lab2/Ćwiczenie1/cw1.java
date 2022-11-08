import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cw1 extends JFrame {
    private JPanel mainPanel;
    private JPasswordField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel LabelText;
    private JTextField textField1;

    private String username = "Adrian", password = "Myszak";

    public cw1() {
        super("Logowanie");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setSize(400, 300);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((username.equals(textField1.getText()) && password.equals(new String(passwordField.getPassword())))){
                    LabelText.setText("User name: " + textField1.getText() + ", \tPassword: "+ new String(passwordField.getPassword()));
                }
                else LabelText.setText("Podane błędne dane");
            }
        });
    }


    public static void main(String[] args) {
        cw1 frame = new cw1();
        frame.setVisible(true);


    }
}
