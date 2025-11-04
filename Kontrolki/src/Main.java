import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Formularz");
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JTextField poleWieku = new JTextField(10);
        JCheckBox checkbox = new JCheckBox("Akceptuję regulamin");
        JButton zatwierdz = new JButton("Zatwierdź");

        frame.add(new JLabel("Wiek:"));
        frame.add(poleWieku);
        frame.add(checkbox);
        frame.add(zatwierdz);

        zatwierdz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // pobieramy tekst z pola wieku:
                String txt = poleWieku.getText();
                int wiek = Integer.parseInt(txt);   // tu w ćwiczeniu nie łapiemy błędów

                // sprawdzamy checkbox:
                boolean regulaminOK = checkbox.isSelected();

                // logika:
                if(wiek == 18 && regulaminOK){
                    JOptionPane.showMessageDialog(frame, "Rejestracja pomyślna!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Wymagany wiek 18+ i akceptacja regulaminu!");
                }
            }
        });

        frame.setVisible(true);
    }
}
