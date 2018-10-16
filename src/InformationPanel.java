import javax.swing.*;
import java.awt.*;

public class InformationPanel extends JPanel {
    private static JLabel informationLabel;
    public InformationPanel() {
        informationLabel = new JLabel("Bem vindo ao Jogo da Velha! Clique em qualquer botão para iniciar o jogo");
        add(informationLabel, BorderLayout.CENTER);
    }

    public static void setText(String text) {
        informationLabel.setText(text);
    }

}
