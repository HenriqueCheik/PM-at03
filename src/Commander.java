import javax.swing.*;

public class Commander {
    private TicTacToeGrid grid;
    private ComputerPlayer computer;
    private InformationPanel infPanel;

    public void setSubordinates(TicTacToeGrid grid, ComputerPlayer computer, InformationPanel infPanel) {
        this.grid = grid;
        this.computer = computer;
        this.infPanel = infPanel;
    }

    public void exitGame() {
        System.exit(0);
    }

    public void newGame(int firstPlayer) {
        infPanel.setText("Bem vindo ao Jogo da Velha! Clique em qualquer botão para iniciar o jogo");
        grid.reset();
        computer.resetPossibilities();
        if(firstPlayer == 2) {
            computerPlay(null);
        }
    }

    public void computerPlay(JButton clickedButton) {
        infPanel.setText("Turno do computador");
        if(clickedButton != null) {
            computer.removePossibility(clickedButton);
        }
        clickedButton = computer.chooseTile();
        if(clickedButton != null){
            clickedButton.setText("O");
        }
        infPanel.setText("Seu turno!");
    }

    public void invalidPlay(Boolean gameEnd) {
        if(gameEnd) {
            infPanel.setText("O jogo terminou! Por favor inicie um novo jogo!");
        }
        else {
            infPanel.setText("Jogada Inválida! Tente outra casa");
        }
    }

    public boolean checkWin() {
        return grid.checkWin();
    }

    public boolean checkTie() {
        return grid.checkTie();
    }

    public void displayMessage(String message) {
        infPanel.setText(message);
    }
}
