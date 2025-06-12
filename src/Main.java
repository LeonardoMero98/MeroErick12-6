import figurasGeometricas.CirculoDibujable;
import figurasGeometricas.CuadradoDibujable;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        // Crear círculo
        CirculoDibujable circulo = new CirculoDibujable(80, 50, 50);

        // Crear cuadrado
        CuadradoDibujable cuadrado = new CuadradoDibujable(100, 200, 100);

        // Mostrar información del círculo
        System.out.println("CÍRCULO:");
        System.out.println("El perímetro del círculo es: " + circulo.getPerimetro());
        System.out.println("El área del círculo es: " + circulo.getArea());

        // Mostrar información del cuadrado
        System.out.println("\nCUADRADO:");
        System.out.println("El perímetro del cuadrado es: " + cuadrado.getPerimetro());
        System.out.println("El área del cuadrado es: " + cuadrado.getArea());

        // Crear ventana
        JFrame frame = new JFrame("Dibujar figuras geométricas");
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                // Dibujar círculo en rojo
                g.setColor(Color.RED);
                circulo.dibujar2D(g);

                // Dibujar cuadrado en azul
                g.setColor(Color.BLUE);
                cuadrado.dibujar2D(g);

                // Agregar etiquetas
                g.setColor(Color.BLACK);
                g.drawString("Círculo", 70, 45);
                g.drawString("Cuadrado", 220, 95);
            }
        };

        panel.setPreferredSize(new Dimension(400, 300));
        frame.add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}