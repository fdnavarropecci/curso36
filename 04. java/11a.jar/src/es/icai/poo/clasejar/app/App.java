package es.icai.poo.clasejar.app;

import es.icai.poo.clasejar.ui.ImagePanel;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class App
{
    //COMO GENERAR JAR
    //cd dist
    //jar cfe ventana.jar es.icai.poo.clasejar.app.App .

    public static void main(String... argv) throws IOException {
        File f = new File(".");
        System.out.println(f.getAbsolutePath());

        JFrame frame = new JFrame("EJEMPLO PANEL CON FONDO");
        Image img = ImageIO.read(new File("resources/trump.png"));
        JPanel panel = new ImagePanel(img);

        frame.add(panel);
        panel.add(new JButton("boton"));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
