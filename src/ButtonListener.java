import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {
    private int playerTurn = 1;
    private ComputerPlayer computer;

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton)e.getSource();
        if(playerTurn == 1) {
            clickedButton.setText("X");
            playerTurn = 2;
            InformationPanel.setText("Turno do jogador " + playerTurn);
            this.computer.removePossibility(clickedButton);
            clickedButton = this.computer.chooseTile();
            if(clickedButton != null){
                clickedButton.setText("O");
            }
            playerTurn = 1;
            InformationPanel.setText("Turno do jogador " + playerTurn);
        }

    }

    public void setComputer(ComputerPlayer computer) {
        this.computer = computer;
    }

    public ComputerPlayer getComputer() {
        return computer;
    }
}
