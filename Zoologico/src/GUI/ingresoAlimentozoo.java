package GUI;

import Modelo.Zoo;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ingresoAlimentozoo extends JFrame implements ActionListener {

    JButton btnAceptar;
    JLabel lblTexto, lblVegetal, lblCarne, lblTitulo;
    JTextField txtCarne, txtVegetal;

    public ingresoAlimentozoo() {

        btnAceptar = new JButton("Aceptar");
        btnAceptar.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnAceptar.addActionListener(this);

        lblTexto = new JLabel("Escribe el total del alimento en kilos, por favor");
        lblTexto.setFont(new Font("Monospaced", Font.ITALIC, 15));
        lblTexto.setAlignmentX(Component.CENTER_ALIGNMENT);

        lblTitulo = new JLabel("Alimento del Zoologico");
        lblTitulo.setFont(new Font("Monospaced", Font.BOLD, 25));
        lblTitulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        lblCarne = new JLabel("Carne:");
        lblCarne.setFont(new Font("Monospaced", Font.BOLD, 18));
        lblVegetal = new JLabel("Vegetales:");
        lblVegetal.setFont(new Font("Monospaced", Font.BOLD, 18));

        txtCarne = new JTextField();
        txtVegetal = new JTextField();

        JPanel comida = new JPanel(new GridLayout(2, 2));
        comida.add(lblCarne);
        comida.add(txtCarne);
        comida.add(lblVegetal);
        comida.add(txtVegetal);

        JPanel total = new JPanel();
        total.setLayout(new BoxLayout(total, BoxLayout.Y_AXIS));
//		total.setLayout(new FlowLayout());
        total.add(lblTitulo);
        total.add(lblTexto);
        total.add(comida);

        total.add(btnAceptar);

        this.add(total);
        this.setVisible(true);
//			this.setSize(new Dimension(300, 283));
        this.pack();
        this.setLocationRelativeTo(null);
        this.setTitle("ALIMENTO");
        this.setResizable(false);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAceptar) {

            Zoo BolivarCity = new Zoo();
            BolivarCity.setAlimentoDisponibleCarne(Integer.parseInt(txtCarne.getText()));
            BolivarCity.setAlimentoDisponibleVegetal(Integer.parseInt(txtVegetal.getText()));
            escogerAnimal cambioVentana = new escogerAnimal(BolivarCity);

            this.dispose();
        }

    }

}
