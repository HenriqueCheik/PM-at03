import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ComputerPlayer {
    private List<JButton> possibilities;
    private TicTacToeGrid grid;

    public ComputerPlayer(TicTacToeGrid grid) {
        this.possibilities = new ArrayList<JButton>();
        this.grid = grid;
        addPossibilities();
    }

    private void addPossibilities() {
        this.possibilities.addAll(Arrays.asList(grid.getButtons()));
    }

    public void resetPossibilities() {
        this.possibilities.clear();
        addPossibilities();
    }

    public void removePossibility(JButton possibility) {
        this.possibilities.remove(possibility);
    }

    public JButton chooseTile() {
        int maxRange = this.possibilities.size();
        if(maxRange == 0){
            return null;
        }
        Random rn = new Random();
        return this.possibilities.remove(rn.nextInt(maxRange));
    }
}
