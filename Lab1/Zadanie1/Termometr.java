import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Termometr extends JFrame {
    private JTextField textTemperatura;
    private JButton przeliczButton;
    private JTextField wynikLabel;
    private JPanel panel1;
    double temperatura, wynik;


    public static void main(String[] args) {
        Termometr Okienko = new Termometr();
        Okienko.setVisible(true);
    }

    public Termometr() {
        super("Zadanie 1");
        this.setContentPane(this.panel1); //wyswietlanie na ekranie
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);


        przeliczButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                temperatura = Double.parseDouble(textTemperatura.getText());
                wynik = temperatura * (9/5) + 32;

                wynikLabel.setText("Wynik to " + String.valueOf(wynik));
            }
        });
    }

}




