import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculoSalario extends JFrame implements ActionListener {
    JLabel labelGanhoHora, labelHorasTrabalhadas, labelSalario;
    JTextField campoGanhoHora, campoHorasTrabalhadas, campoSalario;
    JButton botaoCalcular;

    public CalculoSalario() {
        setTitle("Cálculo de Salário");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel painelPrincipal = new JPanel(new GridLayout(4, 2, 10, 10));
        labelGanhoHora = new JLabel("Valor da hora trabalhada (R$):");
        campoGanhoHora = new JTextField();
        labelHorasTrabalhadas = new JLabel("Horas trabalhadas no mês:");
        campoHorasTrabalhadas = new JTextField();
        labelSalario = new JLabel("Salário mensal (R$):");
        campoSalario = new JTextField();
        campoSalario.setEditable(false);
        botaoCalcular = new JButton("Calcular");
        botaoCalcular.addActionListener(this);

        painelPrincipal.add(labelGanhoHora);
        painelPrincipal.add(campoGanhoHora);
        painelPrincipal.add(labelHorasTrabalhadas);
        painelPrincipal.add(campoHorasTrabalhadas);
        painelPrincipal.add(labelSalario);
        painelPrincipal.add(campoSalario);
        painelPrincipal.add(new JLabel());
        painelPrincipal.add(botaoCalcular);

        add(painelPrincipal);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent evento) {
        double ganhoHora = Double.parseDouble(campoGanhoHora.getText());
        double horasTrabalhadas = Double.parseDouble(campoHorasTrabalhadas.getText());
        double salario = ganhoHora * horasTrabalhadas;
        campoSalario.setText(String.format("%.2f", salario));
    }

    public static void main(String[] args) {
        new CalculoSalario();
    }
}
