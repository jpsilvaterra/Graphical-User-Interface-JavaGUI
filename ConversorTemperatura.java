import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ConversorTemperatura extends JFrame implements ActionListener {
    private JLabel lblFahrenheit, lblCelsius;
    private JTextField txtFahrenheit, txtCelsius;
    private JButton btnConverter;

    public ConversorTemperatura() {
        setTitle("Conversor de Temperatura");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        lblFahrenheit = new JLabel("Temperatura em Fahrenheit:");
        add(lblFahrenheit);

        txtFahrenheit = new JTextField();
        add(txtFahrenheit);

        lblCelsius = new JLabel("Temperatura em Celsius:");
        add(lblCelsius);

        txtCelsius = new JTextField();
        txtCelsius.setEditable(false);
        add(txtCelsius);

        btnConverter = new JButton("Converter");
        btnConverter.addActionListener(this);
        add(btnConverter);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnConverter) {
            double fahrenheit = Double.parseDouble(txtFahrenheit.getText());
            double celsius = 5 * ((fahrenheit - 32) / 9);
            txtCelsius.setText(String.format("%.2f", celsius));
        }
    }

    public static void main(String[] args) {
        new ConversorTemperatura();
    }
}
