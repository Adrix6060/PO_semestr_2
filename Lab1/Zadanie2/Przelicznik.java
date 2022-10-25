import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Przelicznik extends JFrame{
    private JPanel mainPanel;
    private JLabel LabelTytul;
    private JPanel Tytul;
    private JLabel Waga;
    private JLabel Wzrost;
    private JTextField textFieldWaga;
    private JTextField textFieldWzrost;
    private JButton obliczButton;
    private JTextField wynikBMI;
    private JTextField textFieldWniosek;
    public ImageIcon icon = new ImageIcon("src/icon.png");
    double waga, wzrost, bmi;


    public static void main(String[] args) {
        Przelicznik Okienko = new Przelicznik();
        Okienko.setVisible(true);
    }


    public Przelicznik() {
        super("Kalkulator BMI");
        this.setContentPane(this.mainPanel); //wyswietlanie na ekranie
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setIconImage(icon.getImage());



        obliczButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                waga = Double.parseDouble(textFieldWaga.getText());
                wzrost = Double.parseDouble(textFieldWzrost.getText());
                bmi = waga/Math.pow(wzrost, 2);
                if (bmi<16) textFieldWniosek.setText("Wygłodzenie");
                else if (bmi <16.99) textFieldWniosek.setText("Wychudzenie");
                else if (bmi<18.45) textFieldWniosek.setText("Niedowaga");
                else if (bmi<24.99) textFieldWniosek.setText("Wartość prawidłowa");
                else if (bmi<29.99) textFieldWniosek.setText("Nadwaga");
                else if (bmi<34.99) textFieldWniosek.setText("I stopień otyłosci");
                else if (bmi<39.99) textFieldWniosek.setText("II stopień otyłosci");
                else  textFieldWniosek.setText("Otyłość skrajna");
                wynikBMI.setText(String.valueOf(bmi));


            }
        });


    }

}
