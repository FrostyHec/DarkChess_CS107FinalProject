package units;

import GameLogic.Game;

public class unitTest {
    public static void main(String[] args) {
        Game game = new Game();
        game.init();
        SaveGame.save(game);
    }
}
