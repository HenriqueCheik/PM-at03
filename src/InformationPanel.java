import javax.swing.*;
import java.awt.*;

public class InformationPanel extends JPanel {
    private JLabel informationLabel;
    public InformationPanel() {
        this.informationLabel = new JLabel("Bem vindo ao Jogo da Velha! Clique em qualquer botão para iniciar o jogo");
        this.add(informationLabel, BorderLayout.CENTER);
    }
}
