import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ConversorDeMetros {
    private JFrame frame;
    private JPanel panel;
    private JLabel labelMetros;
    private JTextField textFieldMetros;
    private JButton buttonConverter;
    private JLabel labelCentimetros;
    private JTextField textFieldCentimetros;

    public ConversorDeMetros() {
        frame = new JFrame("Conversor de Metros para Centímetros");
        panel = new JPanel();
        labelMetros = new JLabel("Metros:");
        textFieldMetros = new JTextField(10);
        buttonConverter = new JButton("Converter");
        labelCentimetros = new JLabel("Centímetros:");
        textFieldCentimetros = new JTextField(10);

        panel.setLayout(new GridLayout(3, 2));
        panel.add(labelMetros);
        panel.add(textFieldMetros);
        panel.add(buttonConverter);
        panel.add(labelCentimetros);
        panel.add(textFieldCentimetros);
        textFieldCentimetros.setEditable(false);

        buttonConverter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double metros = Double.parseDouble(textFieldMetros.getText());
                double centimetros = metros * 100;
                textFieldCentimetros.setText(Double.toString(centimetros));
            }
        });

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        ConversorDeMetros conversorDeMetros = new ConversorDeMetros();
    }
}
