package Windows;


import GameLogic.Game;
import Windows.GameArea.GameArea;
import units.Deserialize;

import java.io.File;

public class Transmitter {
    private static GameArea gameArea;

    public static void loadGame(Game game) {
        gameArea.loadGame(game);
    }

    public static void setGameArea(GameArea g) {
        gameArea = g;
    }
}
