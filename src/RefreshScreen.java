/**
 * Created by chari on 2/6/2017.
 */
public class RefreshScreen {
    public static void refreshScreen(Player player, GenerateBoard board){
        for(int i = 0; i < board.getBoardHeight(); i++){ //going through the array that contains the arrays
            for(int j = 0; j < board.getBoardWidth(); j++){ //going through the array in the array

                //if the player is not in the correct position then delete them from that position,
                //if the loop reaches the position the player should be at, then place the player there

                if(board.getBoard().get(i).get(j).equals("$")){ //if player is displayed at location
                    if(player.getX() != j || player.getY() != i) { //check if the player should be there
                        board.getBoard().get(i).set(j, "*"); //if the player should not be there, set place to *
                    }
                }
                else{
                    if(player.getX() == j && player.getY() == i) { //check if the player should be there
                        board.getBoard().get(i).set(j, "$"); //if the player should not be there, set place to *
                    }
                }
            }
        }
    }
}
