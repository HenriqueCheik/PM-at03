import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {
    private int playerTurn;
    private Commander commander;
    private boolean gameEnd;

    public ButtonListener(Commander commander) {
        this.commander = commander;
        newGame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton)e.getSource();
        if(playerTurn == 1 && clickedButton.getText().equals("") && !gameEnd) {
            clickedButton.setText("X");
            if(commander.checkWin()) {
                gameEnd = true;
                commander.displayMessage("Você venceu!");
                return;
            }
            playerTurn = 2;
            commander.computerPlay(clickedButton);
            playerTurn = 1;
            if(commander.checkWin()) {
                gameEnd = true;
                commander.displayMessage("O computador venceu!");
                return;
            }
            if(commander.checkTie()) {
                gameEnd = true;
                commander.displayMessage("O jogo empatou!");
            }

        }
        else {
            commander.invalidPlay(gameEnd);
        }
    }

    public void newGame() {
        playerTurn = 1;
        gameEnd = false;
    }
}
