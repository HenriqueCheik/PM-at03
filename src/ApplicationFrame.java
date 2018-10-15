import javax.swing.*;
import java.awt.*;

public class ApplicationFrame extends JFrame {
    public ApplicationFrame(JPanel informationPanel, JPanel TicTacToeGrid) {
        super("Cheik's TicTacToe Game");
        Container content = this.getContentPane();
        content.add(informationPanel, BorderLayout.NORTH);
        content.add(TicTacToeGrid, BorderLayout.CENTER);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(800,640);
        this.setVisible(true);
//        this.pack();
    }
}
