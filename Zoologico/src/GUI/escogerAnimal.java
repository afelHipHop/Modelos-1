package GUI;

import Modelo.Animal;
import Modelo.Carnivoro;
import Modelo.Herbivoro;
import Modelo.Omnivoro;
import Modelo.Zoo;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.control.ScrollBar;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class escogerAnimal extends JFrame implements ActionListener {
    Zoo BolivarCity=new Zoo();
    Animal animal;

    public JButton btnHerbivoro;
    public JButton btnCarnivoro;
    public JButton btnOmnivoro;

    public JLabel lblHerbivoro;
    public JLabel lblCarnivoro;
    public JLabel lblOmnivoro;
    
    public JLabel lblTitulo;

    public int cantidadVegetal;
    public int cantidadCarne;

    public escogerAnimal(Zoo BolivarCity) {
        
        lblTitulo = new JLabel("Zona de alimentacion");
        lblTitulo.setFont(new Font("Monospaced", Font.BOLD, 42));
        this.BolivarCity=BolivarCity;

        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());

        JPanel pnlHerbivoro = new JPanel();
        pnlHerbivoro.setLayout(new BorderLayout());
        lblHerbivoro = new JLabel("Herviboro");
        lblHerbivoro.setFont(new Font("Monospaced", Font.BOLD, 36));
        ImageIcon foto = new ImageIcon("./img/herbivoro.jpg");
        JLabel lblFoto = new JLabel(foto, JLabel.CENTER);
        pnlHerbivoro.add(lblHerbivoro, BorderLayout.NORTH);
        pnlHerbivoro.add(lblFoto, BorderLayout.CENTER);
        pnlHerbivoro.add(btnHerbivoro = new JButton("Añadir"), BorderLayout.SOUTH);
        btnHerbivoro.addActionListener(this);
//			pnlHerbivoro.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        panel1.add(pnlHerbivoro);

        JPanel pnlCarnivoro = new JPanel();
        pnlCarnivoro.setLayout(new BorderLayout());
        lblCarnivoro = new JLabel("Carnivoro");
        lblCarnivoro.setFont(new Font("Monospaced", Font.BOLD, 36));
        ImageIcon fotoC = new ImageIcon("./img/carnivoro.jpg");
        JLabel lblFotoC = new JLabel(fotoC, JLabel.CENTER);
        pnlCarnivoro.add(lblCarnivoro, BorderLayout.NORTH);
        pnlCarnivoro.add(lblFotoC, BorderLayout.CENTER);
        pnlCarnivoro.add(btnCarnivoro = new JButton("Añadir"), BorderLayout.SOUTH);
        btnCarnivoro.addActionListener(this);
        panel1.add(pnlCarnivoro);

        JPanel pnlOmnivoro = new JPanel();
        pnlOmnivoro.setLayout(new BorderLayout());
        lblOmnivoro = new JLabel("Omnivoro");
        lblOmnivoro.setFont(new Font("Monospaced", Font.BOLD, 36));
        ImageIcon fotoO = new ImageIcon("./img/omnivoro.jpg");
        JLabel lblFotoO = new JLabel(fotoO, JLabel.CENTER);
        pnlOmnivoro.add(lblOmnivoro, BorderLayout.NORTH);
        pnlOmnivoro.add(lblFotoO, BorderLayout.CENTER);
        pnlOmnivoro.add(btnOmnivoro = new JButton("Añadir"), BorderLayout.SOUTH);
        btnOmnivoro.addActionListener(this);
        panel1.add(pnlOmnivoro);
        

        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        JLabel cantidad = new JLabel("Cantidad de carne: "+this.BolivarCity.getAlimentoDisponibleCarne()+ " Kgrs y de vegetales: " + this.BolivarCity.getAlimentoDisponibleVegetal() + " Kgrs");
        panel2.add(cantidad);

        JPanel pnltotal = new JPanel();
        pnltotal.setLayout(new FlowLayout());
        pnltotal.add(lblTitulo);
        pnltotal.add(panel1);
        pnltotal.add(panel2);

        this.add(pnltotal);

        this.setVisible(true);
        this.setSize(new Dimension(890, 420));
//		this.pack(); 
        this.setLocationRelativeTo(null);
        this.setTitle("INICIO");
        this.setResizable(false);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String tipo="";
        if (e.getSource() == btnCarnivoro) {
            animal = new Carnivoro();
            tipo="Carnivoro";
            ingresoAlimentoAnimal Ingal=new ingresoAlimentoAnimal(animal,tipo,BolivarCity); // lispkov
            this.dispose();
        }

        if (e.getSource() == btnHerbivoro) {
            animal = new Herbivoro();
            tipo="Herbivoro";
            ingresoAlimentoAnimal Ingal=new ingresoAlimentoAnimal(animal,tipo,BolivarCity);
            this.dispose();

        }

        if (e.getSource() == btnOmnivoro) {
            animal = new Omnivoro();
            tipo="Omnivoro";
            ingresoAlimentoAnimal Ingal=new ingresoAlimentoAnimal(animal,tipo,BolivarCity);
            this.dispose();

        }
        

    }

}
