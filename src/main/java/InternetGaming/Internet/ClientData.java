package InternetGaming.Internet;

import InternetGaming.Internet.Message.MessageHandler;
import InternetGaming.Internet.Message.PlayerType;

public class ClientData {
    protected MessageHandler m;
    protected String name;
    protected PlayerType playerType;

    public ClientData(MessageHandler m) {
        this.m = m;
    }

    public ClientData(String name, MessageHandler m, PlayerType playerTurns) {
        this.name = name;
        this.m = m;
        this.playerType = playerTurns;
    }


    public String getName() {
        return name;
    }

    public MessageHandler getM() {
        return m;
    }

    public PlayerType getPlayerTurns() {
        return playerType;
    }

    public void setPlayerType(PlayerType p) {
        this.playerType = p;
    }

    public void setName(String name) {
        this.name = name;
    }
}
