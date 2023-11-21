package CS116Lab7;

public class GameTestClass {

    public static void main(String[] args) {

        PCBasedGame pcGame = new PCBasedGame("Game A", 2022, 8, 20000, 2.5);
        System.out.println(pcGame);

        // Test BoardGame
        BoardGame boardGame = new BoardGame("Game B", 2023, 4, true);
        System.out.println(boardGame);

        // Test SportsGame
        SportsGame sportsGame = new SportsGame("Game C", 2024, true, false);
        System.out.println(sportsGame);

    }
}
