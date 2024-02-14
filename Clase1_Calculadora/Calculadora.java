import javax.swing.*;
import java.awt.*;

public class Calculadora extends JFrame {

    JLabel display;
    JPanel buttons;
    String textButtons[] = 
            {"7", "8", "9", "+",
            "4", "5", "6", "-",
            "3", "2", "1", "*",
            "0", ".", "=", "/"};

    public  Calculadora(){
        this.setLayout(null); // Dispocision absoluta de los componenetes (Ponerlos como queramos)
        this.setTitle("Calculadora"); // Titulo ventana
        this.setSize(400,450); // Tamaño ventana
        this.setLocationRelativeTo(null); // Centrado ventana
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); 
        // this.setResizable(false); // No cambiar su tamaño

        initComponets();

        this.setVisible(true); // Hacer visible la ventana
    }

    private void initComponets(){
        initDisplay();
        initButtons();
    }

    private void initDisplay(){
        display = new JLabel("0"); // Inicio JLabel
        display.setBounds(15,15, this.getWidth() - 50, 60); // Posición y dimensiones
        display.setOpaque(true); // Para poder darle un color de fondo
        display.setBackground(Color.BLACK); // Color de fondo
        display.setForeground(Color.WHITE); // Color de fuente
        display.setHorizontalAlignment(SwingConstants.RIGHT); // Alineamiento horizontal derecha
        this.add(display);
    }

    private void initButtons(){
        buttons = new JPanel();
        buttons.setBounds(15, 80, this.getWidth() - 50, this.getHeight() - 150);
        buttons.setBackground(Color.BLACK);

        buttons.setLayout(new GridLayout(4,4));
        for (int i = 0; i < textButtons.length; i++) {
            buttons.add(new Button(textButtons[i]));
        }

        this.add(buttons);
    }

    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        c.setVisible(true);
    }

}
