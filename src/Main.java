public class Main {

    public static void main(String[] args) {
        InformationPanel infPanel = new InformationPanel();
        TicTacToeGrid grid = new TicTacToeGrid(3,3);
        ApplicationFrame app = new ApplicationFrame(infPanel, grid);
    }
}
