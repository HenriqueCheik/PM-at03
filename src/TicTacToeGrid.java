import javax.swing.*;
import java.awt.*;

public class TicTacToeGrid extends JPanel {
    private JButton[] buttons;
    public TicTacToeGrid(int rows, int columns) {
        this.setLayout(new GridLayout(rows, columns));
        this.buttons = new JButton[rows*columns];
        for(int i = 0; i<rows*columns; i++) {
            this.buttons[i] = new JButton();
            this.buttons[i].setText("");
            this.buttons[i].addActionListener(new ButtonListener());
            this.add(buttons[i]);
        }
    }
}
