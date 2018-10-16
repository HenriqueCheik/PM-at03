import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ApplicationMenuListener implements ActionListener {
    private String actionType;
    private TicTacToeGrid grid;

    public ApplicationMenuListener(String actionType, TicTacToeGrid grid) {
        this.actionType = actionType;
        this.grid = grid;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (actionType.equals("newGame")) {
            grid.reset();
        } else if (actionType.equals("exit")) {
            System.exit(0);
        }
    }
}
