import javax.swing.*;
import java.awt.*;

public class ApplicationFrame extends JFrame {
    private JMenuBar menuBar;
    public ApplicationFrame(InformationPanel infPanel, TicTacToeGrid grid, Commander commander) {
        super("Cheik's TicTacToe Game");

        this.menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);
        JMenu fileMenu = new JMenu("Arquivo");
        JMenuItem newGame = new JMenuItem("Novo Jogo");
        newGame.addActionListener(new ApplicationMenuListener("newGame", commander));
        JMenuItem exit = new JMenuItem("Sair");
        exit.addActionListener(new ApplicationMenuListener("exit", commander));

        this.menuBar.add(fileMenu);
        fileMenu.add(newGame);
        fileMenu.add(exit);

        Container content = this.getContentPane();
        content.add(infPanel, BorderLayout.NORTH);
        content.add(grid, BorderLayout.CENTER);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(560,360);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }
}
