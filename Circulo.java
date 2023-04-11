import javax.swing.*;

import java.awt.event.*;

public class Circulo extends JFrame implements ActionListener {

    JLabel labelRaio, labelArea;
    JTextField campoRaio, campoArea;
    JButton botaoCalcular;

    public Circulo() {

        labelRaio = new JLabel("Raio:");
        campoRaio = new JTextField(10);
        labelArea = new JLabel("Área:");
        campoArea = new JTextField(10);
        campoArea.setEditable(false);
        botaoCalcular = new JButton("Calcular");
        botaoCalcular.addActionListener(this);

        JPanel painel = new JPanel();
        painel.add(labelRaio);
        painel.add(campoRaio);
        painel.add(labelArea);
        painel.add(campoArea);
        painel.add(botaoCalcular);

        this.setContentPane(painel);
        this.setTitle("Cálculo de Área de Círculo");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        double raio = Double.parseDouble(campoRaio.getText());
        double area = Math.PI * raio * raio;
        campoArea.setText(String.format("%.2f", area));
    }

    public static void main(String[] args) {
        Circulo janela = new Circulo();
    }
}
