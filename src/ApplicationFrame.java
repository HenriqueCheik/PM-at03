import javax.swing.*;
import java.awt.*;

public class ApplicationFrame extends JFrame {
    private JMenuBar menuBar;
    public ApplicationFrame(InformationPanel infPanel, TicTacToeGrid grid, Commander commander) {
        super("Cheik's TicTacToe Game");

        this.menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);
        JMenu fileMenu = new JMenu("Opções");
        JMenuItem newGame1 = new JMenuItem("Novo Jogo - Jogador humano começa");
        newGame1.addActionListener(new ApplicationMenuListener("newGame1", commander));
        JMenuItem newGame2 = new JMenuItem("Novo Jogo - Computador começa");
        newGame2.addActionListener(new ApplicationMenuListener("newGame2", commander));
        JMenuItem exit = new JMenuItem("Sair");
        exit.addActionListener(new ApplicationMenuListener("exit", commander));

        this.menuBar.add(fileMenu);
        fileMenu.add(newGame1);
        fileMenu.add(newGame2);
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
