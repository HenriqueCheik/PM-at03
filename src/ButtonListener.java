import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {
    private static int playerTurn = 0;
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton)e.getSource();
        if(playerTurn == 0) {
            clickedButton.setText("O");
            playerTurn = 1;
        }
        else {
            clickedButton.setText("X");
            playerTurn = 0;
        }

    }
}
