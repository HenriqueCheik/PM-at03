import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {
    private int playerTurn = 0;
    private ComputerPlayer computer;

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton)e.getSource();
        if(playerTurn == 0) {
            clickedButton.setText("X");
            playerTurn = 1;
            this.computer.removePossibility(clickedButton);
            clickedButton = this.computer.chooseTile();
            clickedButton.setText("O");
            playerTurn = 0;
        }

    }

    public void setComputer(ComputerPlayer computer) {
        this.computer = computer;
    }

    public ComputerPlayer getComputer() {
        return computer;
    }
}
