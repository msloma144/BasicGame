import java.io.IOException;

/**
 * Created by chari on 2/5/2017.
 */
public class Runner {
    public static void main(String[] args)throws IOException{
        GenerateBoard board1 = new GenerateBoard(10,10); // make new board
        Player player1 = new Player(); // make new player
        boolean quitGame = false; // holder variable

        while(!quitGame){
            System.out.println("Press \"q\" to quit the game!\n");
            RefreshScreen.refreshScreen(player1, board1); //position player

            System.out.print(board1); //display board
            player1.movePlayer(board1); //call for player to move

            System.out.println("X: " + player1.getX() + " Y: " + player1.getY());
        }

    }
}
