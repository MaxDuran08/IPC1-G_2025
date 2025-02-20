package proyecto1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Proyecto1 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Eventos en Swing");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JButton button = new JButton("Presionar");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Botón presionado");
            }
        });

        panel.add(button);
        frame.add(panel);
        frame.setVisible(true);
        /*
        ActionListener: Detecta cuando se presiona el botón.
        JOptionPane.showMessageDialog(): Muestra una ventana emergente.
        */
    }
}
