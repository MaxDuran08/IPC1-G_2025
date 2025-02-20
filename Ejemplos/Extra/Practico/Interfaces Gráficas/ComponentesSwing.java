package proyecto1;

import javax.swing.*;

public class Proyecto1 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Componentes en Swing");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("Ingrese su nombre:");
        JTextField textField = new JTextField(10);
        JButton button = new JButton("Enviar");

        panel.add(label);
        panel.add(textField);
        panel.add(button);
        frame.add(panel);

        frame.setVisible(true);
        /*
        JLabel: Etiqueta de texto.
        JTextField: Campo de entrada.
        JButton: Botón interactivo.
        */
    }
}
