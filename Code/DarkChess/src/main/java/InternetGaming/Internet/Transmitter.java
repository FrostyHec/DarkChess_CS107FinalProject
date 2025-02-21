package InternetGaming.Internet;


import InternetGaming.GameArea.FinishedController;
import InternetGaming.GameArea.GameArea;
import InternetGaming.Internet.Message.PlayerType;

public class Transmitter {
    public static Client client;
    public static PreparingWindow preparingWindow;
    public static GameArea gameArea;

    public static PlayerType playerType;

    public static FinishedController finishedController;
    public static ServerMain serverMain;

    public static void refreshAll(){
        client=null;
        preparingWindow=null;
        gameArea=null;
        playerType=null;
        finishedController=null;
        serverMain=null;
    }
}
