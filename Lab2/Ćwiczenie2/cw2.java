import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cw2 extends JFrame {
    private JPanel mainPanel;
    private JPasswordField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel LabelText;
    private JTextField textField1;
    private JRadioButton radioButtonMac;
    private JRadioButton radioButtonWin;
    private JRadioButton radioButtonLinux;
    private JLabel ImageLabel;
    private JButton okButton;

    private ImageIcon winIcon = new ImageIcon(new ImageIcon(getClass().getResource("WindowsIcon.png")).getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
    private ImageIcon macIcon = new ImageIcon(new ImageIcon(getClass().getResource("MacIcon.png")).getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
    private ImageIcon linuxIcon = new ImageIcon(new ImageIcon(getClass().getResource("LinuxIcon.png")).getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));


    public cw2() {
        super("System operacyjny");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setSize(400, 300);


        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (radioButtonWin.isSelected())  ImageLabel.setIcon(winIcon);
                if (radioButtonMac.isSelected())  ImageLabel.setIcon(macIcon);
                if (radioButtonLinux.isSelected())  ImageLabel.setIcon(linuxIcon);
            }
        };
        radioButtonMac.addActionListener(listener);
        radioButtonWin.addActionListener(listener);
        radioButtonLinux.addActionListener(listener);
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (radioButtonWin.isSelected()) JOptionPane.showMessageDialog(null, "You selected: Windows");
                if (radioButtonMac.isSelected()) JOptionPane.showMessageDialog(null, "You selected: Mac");
                if (radioButtonLinux.isSelected()) JOptionPane.showMessageDialog(null, "You selected: Linux");
            }
        });
    }


    public static void main(String[] args) {
        cw2 frame = new cw2();
        frame.setVisible(true);


    }
}
