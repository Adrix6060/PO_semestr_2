import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CoffeeShop extends JFrame {


    private JPanel mainPanel;
    private JCheckBox cappuccinoBox;
    private JCheckBox latteBox;
    private JCheckBox espressoBox;
    private JRadioButton zCukrem1złRadioButton;
    private JRadioButton zeŚmietanką3złRadioButton;
    private JRadioButton zCukrem1złRadioButton1;
    private JRadioButton zeŚmietanką3złRadioButton1;
    private JRadioButton zCukrem1złRadioButton2;
    private JRadioButton zeŚmietanką3złRadioButton2;
    private JRadioButton zCukrem1złRadioButton3;
    private JRadioButton zeŚmietanką3złRadioButton3;
    private JRadioButton dlaStudentaRadioButton;
    private JRadioButton dlaSenioraRadioButton;
    private JRadioButton bezZniżkiRadioButton;
    private JButton podsumowanieButton;
    private JCheckBox czarnaBox;
    double costs;
    double czarna = 8;
    double cappuccino =9;
    double latte = 10;
    double espresso = 6;
    String message = "";


    public CoffeeShop() {
        super("Coffe shop");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setSize(700,400);

        podsumowanieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (czarnaBox.isSelected()) {
                    costs += 8;
                    message += "\nCzarna kawa ";
                    if (zCukrem1złRadioButton.isSelected()){
                        costs += 1;
                        message += "+ cukier ";
                    }
                    if (zeŚmietanką3złRadioButton.isSelected()){
                        costs += 3;
                        message += "+ śmietanka ";
                    }
                }

                if (cappuccinoBox.isSelected()) {
                    costs += 9;
                    message += "\nCappuccino ";
                    if (zCukrem1złRadioButton1.isSelected()){
                        costs += 1;
                        message += "+ cukier ";
                    }
                    if (zeŚmietanką3złRadioButton1.isSelected()){
                        costs += 3;
                        message += "+ śmietanka ";
                    }
                }

                if (latteBox.isSelected()) {
                    costs += 10;
                    message += "\nCaffe latte ";
                    if (zCukrem1złRadioButton2.isSelected()){
                        costs += 1;
                        message += "+ cukier ";
                    }
                    if (zeŚmietanką3złRadioButton2.isSelected()){
                        costs += 3;
                        message += "+ śmietanka ";
                    }

                }

                if (espressoBox.isSelected()) {
                    costs += 6;
                    message += "\nEspresso ";
                    if (zCukrem1złRadioButton3.isSelected()){
                        costs += 1;
                        message += "+ cukier ";
                    }
                    if (zeŚmietanką3złRadioButton3.isSelected()){
                        costs += 3;
                        message += "+ śmietanka ";
                    }
                }

                if (dlaStudentaRadioButton.isSelected()){
                    costs = costs - (0.3 * costs) ;
                }
                if (dlaSenioraRadioButton.isSelected()){
                    costs = costs - (0.4 * costs) ;
                }
                if (bezZniżkiRadioButton.isSelected()){
                }
                message += "\n--------------------------- \n Kwota do zapłaty: " + String.format("%.2f", costs) + "zł";


                if (costs!=0) JOptionPane.showMessageDialog(null, message);
                else JOptionPane.showMessageDialog(null, "Nie zakupiłeś żadnej kawy");

                costs=0;
                message="";
            }
        });
    }



    public static void main(String[] args) {
        CoffeeShop frame = new CoffeeShop();
        frame.setVisible(true);
    }
}


