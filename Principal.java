package Iu;

import Iu.eventos.EventosRaton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Principal extends Frame{
    private Label lblNombre;
    private TextField txtNombre;
    private Button btnBoton;

    public Principal(String title) throws HeadlessException {
        super(title);
        this.setSize(800, 600);
        this.setLayout(new FlowLayout());
        lblNombre = new Label("Nombre");
        this.add(lblNombre);
        txtNombre = new TextField(30);
        btnBoton = new Button("saludar");
        //btnBoton.addMouseListener(new EventosRaton());
        btnBoton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println( txtNombre.getText() );
                JOptionPane.showMessageDialog(null, "hola " + txtNombre.getText());

            }
        });
        this.add(btnBoton);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
        this.add(txtNombre);
        this.setVisible(true);
    }


}
