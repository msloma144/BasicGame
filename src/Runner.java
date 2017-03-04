import java.io.IOException;

/**
 * Created by chari on 2/5/2017.
 */
public class Runner {
    public static void main(String[] args)throws IOException{
        //GenerateBoard board1 = new GenerateBoard(10,10); // make new board

        GenerateMaze maze1 = new GenerateMaze();

        Player player1 = new Player(); // make new player
        boolean quitGame = false; // holder variable

        while(!quitGame){
            System.out.println("Press \"q\" to quit the game!\n");
            RefreshScreen.refreshScreen(player1, maze1); //position player and display board

            player1.movePlayer(maze1); //call for player to move

            System.out.println("X: " + player1.getX() + " Y: " + player1.getY());
        }

    }
}
