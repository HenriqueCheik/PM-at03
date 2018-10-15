import javax.swing.*;
import java.awt.*;

public class AplicationFrame extends JFrame {
    public AplicationFrame(JPanel informationPanel, JPanel TicTacToeGrid) {
        super("Cheik's TicTacToe Game");
        Container content = this.getContentPane();
        content.add(informationPanel, BorderLayout.NORTH);
        content.add(TicTacToeGrid, BorderLayout.SOUTH);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.pack();
    }
}
