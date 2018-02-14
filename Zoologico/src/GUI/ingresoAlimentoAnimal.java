/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Modelo.Animal;
import Modelo.Carnivoro;
import Modelo.Herbivoro;
import Modelo.Omnivoro;
import Modelo.Zoo;
import java.awt.Component;
import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author DANIEL
 */
public class ingresoAlimentoAnimal extends JFrame implements ActionListener {
    

    JTextField txtCarne;
    JTextField txtVegetal;
    JLabel lblCarne;
    JLabel lblVegetal;
    JLabel lblTitulo;
    JLabel DispoJorge;
    JButton btnAceptar;

    public String tipo;
    public Animal animal;
    public Zoo BolivarCity;

    
   

    public ingresoAlimentoAnimal(Animal abc, String tipo, Zoo xy) {
        this.tipo = tipo;
        this.animal = abc;
        this.BolivarCity = xy;

        btnAceptar = new JButton("Aceptar");
        btnAceptar.setAlignmentX(CENTER_ALIGNMENT);
        btnAceptar.addActionListener((ActionListener) this);
        lblCarne = new JLabel("Carne:");
        txtCarne = new JTextField();
        lblVegetal = new JLabel("Vegetal:");
        txtVegetal = new JTextField();
        lblTitulo = new JLabel("¿Cantidad de alimento?");
        lblTitulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        JLabel vacia=new JLabel();
        DispoJorge=new JLabel(BolivarCity.getAlimentoDisponibleCarne()+" "+BolivarCity.getAlimentoDisponibleVegetal());

        this.setLayout(new GridLayout(4, 2));

        this.add(lblTitulo);
        this.add(vacia);
        this.add(lblCarne);
        this.add(txtCarne);
        this.add(lblVegetal);
        this.add(txtVegetal);
        this.add(btnAceptar);
        this.add(DispoJorge);
       
        if(tipo=="Herbivoro"){
            lblCarne.setVisible(false);
            txtCarne.setVisible(false);
        }else if(tipo=="Carnivoro"){
          lblVegetal.setVisible(false);
            txtVegetal.setVisible(false);  
        }
       
        this.setVisible(true);
        
        this.pack();
        this.setLocationRelativeTo(null);
        this.setTitle("Alimentar");
        this.setResizable(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAceptar) {

            if (tipo == "Carnivoro") {
                animal.setAlimento(0, Integer.parseInt(txtCarne.getText()));
                
            }
            if (tipo == "Herbivoro") {
                animal.setAlimento(Integer.parseInt(txtVegetal.getText()), 0);
            }
            if (tipo == "Omnivoro") {
                animal.setAlimento(Integer.parseInt(txtVegetal.getText()), Integer.parseInt(txtCarne.getText()));
            }
            if (BolivarCity.validar(animal) == true) {
                BolivarCity.agregarAnimal(animal);
                JOptionPane.showMessageDialog(this, "Animal alimentado con Éxito");
            } else {
                JOptionPane.showMessageDialog(this, "No hay alimento suficienre para este animal. Vuelva a ingresar una cantidad");

            }
            DispoJorge.setText(BolivarCity.getAlimentoDisponibleCarne()+" "+BolivarCity.getAlimentoDisponibleVegetal());

//			this.setVisible(false);
        }

    }

}
