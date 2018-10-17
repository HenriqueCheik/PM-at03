import javax.swing.*;
import java.awt.*;

public class TicTacToeGrid extends JPanel {
    private JButton[] buttons;
    private ButtonListener listener;

    public TicTacToeGrid(int rows, int columns, Commander commander) {
        this.setLayout(new GridLayout(rows, columns));
        this.buttons = new JButton[rows*columns];
        listener = new ButtonListener(commander);
        for(int i = 0; i<rows*columns; i++) {
            this.buttons[i] = new JButton();
            this.buttons[i].setText("");
            this.buttons[i].addActionListener(listener);
            this.add(buttons[i]);
        }
    }

    public JButton[] getButtons() {
        return buttons;
    }

    public void reset(){
        for (JButton button : this.buttons) {
            button.setText("");
        }
        listener.newGame();
    }

    public boolean checkWin() {
        // VERTICAIS
        boolean vertOne = buttons[0].getText().equals(buttons[1].getText()) && buttons[0].getText().equals(buttons[2].getText()) && !buttons[0].getText().equals("");
        boolean vertTwo = buttons[3].getText().equals(buttons[4].getText()) && buttons[3].getText().equals(buttons[5].getText()) && !buttons[3].getText().equals("");
        boolean vertThree = buttons[6].getText().equals(buttons[7].getText()) && buttons[6].getText().equals(buttons[8].getText()) && !buttons[6].getText().equals("");

        // HORIZONTAIS
        boolean horiOne = buttons[0].getText().equals(buttons[3].getText()) && buttons[0].getText().equals(buttons[6].getText()) && !buttons[0].getText().equals("");
        boolean horiTwo = buttons[1].getText().equals(buttons[4].getText()) && buttons[1].getText().equals(buttons[7].getText()) && !buttons[1].getText().equals("");
        boolean horiThree = buttons[2].getText().equals(buttons[5].getText()) && buttons[2].getText().equals(buttons[8].getText()) && !buttons[2].getText().equals("");

        // DIAGONAIS
        boolean diagOne = buttons[0].getText().equals(buttons[4].getText()) && buttons[0].getText().equals(buttons[8].getText()) && !buttons[0].getText().equals("");
        boolean diagTwo = buttons[2].getText().equals(buttons[4].getText()) && buttons[2].getText().equals(buttons[6].getText()) && !buttons[2].getText().equals("");


        return vertOne || vertTwo || vertThree || horiOne || horiTwo || horiThree || diagOne || diagTwo;
    }

    public boolean checkTie() {
        boolean isTied = true;
        for(JButton button : buttons) {
            isTied &= !button.getText().equals("");
        }
        return isTied;
    }
}
