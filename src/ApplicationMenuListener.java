import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ApplicationMenuListener implements ActionListener {
    private String actionType;
    private Commander commander;

    public ApplicationMenuListener(String actionType, Commander commander) {
        this.actionType = actionType;
        this.commander = commander;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (actionType.equals("newGame")) {
            commander.newGame();
        } else if (actionType.equals("exit")) {
            commander.exitGame();
        }
    }
}
