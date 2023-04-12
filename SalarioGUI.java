import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SalarioGUI extends JFrame implements ActionListener {
    
    private JLabel lblValorHora, lblHorasTrabalhadas, lblSalarioBruto, lblInss, lblSindicato, lblSalarioLiquido;
    private JTextField txtValorHora, txtHorasTrabalhadas, txtSalarioBruto, txtInss, txtSindicato, txtSalarioLiquido;
    private JButton btnCalcular;
    
    public SalarioGUI() {
        setTitle("Calculo de Salario");
        setLayout(new GridLayout(7, 2, 5, 5));
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lblValorHora = new JLabel("Valor da Hora:");
        add(lblValorHora);
        txtValorHora = new JTextField(10);
        add(txtValorHora);
        
        lblHorasTrabalhadas = new JLabel("Horas Trabalhadas:");
        add(lblHorasTrabalhadas);
        txtHorasTrabalhadas = new JTextField(10);
        add(txtHorasTrabalhadas);
        
        lblSalarioBruto = new JLabel("Salario Bruto:");
        add(lblSalarioBruto);
        txtSalarioBruto = new JTextField(10);
        txtSalarioBruto.setEditable(false);
        add(txtSalarioBruto);
        
        lblInss = new JLabel("INSS:");
        add(lblInss);
        txtInss = new JTextField(10);
        txtInss.setEditable(false);
        add(txtInss);
        
        lblSindicato = new JLabel("Sindicato:");
        add(lblSindicato);
        txtSindicato = new JTextField(10);
        txtSindicato.setEditable(false);
        add(txtSindicato);
        
        lblSalarioLiquido = new JLabel("Salario Liquido:");
        add(lblSalarioLiquido);
        txtSalarioLiquido = new JTextField(10);
        txtSalarioLiquido.setEditable(false);
        add(txtSalarioLiquido);
        
        btnCalcular = new JButton("Calcular");
        btnCalcular.addActionListener(this);
        add(btnCalcular);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCalcular) {
            double valorHora = Double.parseDouble(txtValorHora.getText());
            double horasTrabalhadas = Double.parseDouble(txtHorasTrabalhadas.getText());
            double salarioBruto = valorHora * horasTrabalhadas;
            double inss = salarioBruto * 0.08;
            double sindicato = salarioBruto * 0.05;
            double ir = salarioBruto * 0.11;
            double salarioLiquido = salarioBruto - inss - sindicato - ir;
            
            txtSalarioBruto.setText(String.format("%.2f", salarioBruto));
            txtInss.setText(String.format("%.2f", inss));
            txtSindicato.setText(String.format("%.2f", sindicato));
            txtSalarioLiquido.setText(String.format("%.2f", salarioLiquido));
        }
    }
    
    public static void main(String[] args) {
        new SalarioGUI();
    }
    
}
