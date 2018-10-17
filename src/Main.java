public class Main {

    public static void main(String[] args) {
        Commander commander = new Commander();
        InformationPanel infPanel = new InformationPanel();
        TicTacToeGrid grid = new TicTacToeGrid(3,3, commander);
        ComputerPlayer computer = new ComputerPlayer(grid);
        ApplicationFrame app = new ApplicationFrame(infPanel, grid, commander);
        commander.setSubordinates(grid, computer, infPanel);
    }
}
