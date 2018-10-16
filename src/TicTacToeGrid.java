import javax.swing.*;
import java.awt.*;

public class TicTacToeGrid extends JPanel {
    private JButton[] buttons;
    private ButtonListener listener;

    public TicTacToeGrid(int rows, int columns) {
        this.setLayout(new GridLayout(rows, columns));
        this.buttons = new JButton[rows*columns];
        listener = new ButtonListener();
        for(int i = 0; i<rows*columns; i++) {
            this.buttons[i] = new JButton();
            this.buttons[i].setText("");
            this.buttons[i].addActionListener(listener);
            this.add(buttons[i]);
        }
        listener.setComputer(new ComputerPlayer(this));
    }

    public JButton[] getButtons() {
        return buttons;
    }

    public void reset(){
        for (JButton button : this.buttons) {
            button.setText("");
        }
        listener.getComputer().resetPossibilities();
        InformationPanel.setText("Bem vindo ao Jogo da Velha! Clique em qualquer botão para iniciar o jogo");
    }
}
