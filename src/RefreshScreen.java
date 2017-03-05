/**
 * Created by chari on 2/6/2017.
 */
class RefreshScreen {
    static void refreshScreen(Player player, Board board){
        for(int i = 0; i < board.getBoardHeight(); i++){ //going through the array that contains the arrays
            for(int j = 0; j < board.getBoardWidth(); j++){ //going through the array in the array

                //if the player is not in the correct position then delete them from that position,
                //if the loop reaches the position the player should be at, then place the player there

                if(board.getBoard().get(i).get(j).equals("$  ")){ //if player is displayed at location
                    if(player.getX() != j || player.getY() != i) { //check if the player should be there
                        board.getBoard().get(i).set(j, "*  "); //if the player should not be there, set place to *
                    }
                }
                else{
                    if(player.getX() == j && player.getY() == i) { //check if the player should be there
                        board.getBoard().get(i).set(j, "$  "); //if the player should not be there, set place to *
                    }
                }

                //Display the Board
                System.out.print(board.getBoard().get(i).get(j));
            }
            System.out.print("\n");
        }
    }

    static void refreshScreen(Player player, Maze board){
        for(int i = 0; i < board.getBoardHeight(); i++){ //going through the array that contains the arrays
            for(int j = 0; j < board.getBoardWidth(); j++){ //going through the array in the array

                //if the player is not in the correct position then delete them from that position,
                //if the loop reaches the position the player should be at, then place the player there

                //Check if there is a boarder at the location
                //
                if((player.getX() == j && player.getY() == i) && (board.getBoard().get(i).get(j).equals("---") || board.getBoard().get(i).get(j).equals("--") ||
                        board.getBoard().get(i).get(j).equals("|  ") || board.getBoard().get(i).get(j).equals("|"))){
                        //set player back to original location
                        player.setX(player.getLastPosX());
                        player.setY(player.getLastPosY());
                        System.out.println("posx: " +player.getX() + " posy: " +player.getY());
                        board.getBoard().get(player.getY()).set(player.getX(), "$  "); //reset player location on board
                }
                else{
                    if(player.getX() == j && player.getY() == i) { //check if the player should be there
                        board.getBoard().get(i).set(j, "$  "); //set player to correct location
                    }

                    else if(board.getBoard().get(i).get(j).equals("$  ")){ //if player is displayed at location
                        if(player.getX() != j || player.getY() != i) { //check if the player should be there
                            board.getBoard().get(i).set(j, "*  "); //if the player should not be there, set place to *
                        }
                    }
                }

                //Display the Board
                System.out.print(board.getBoard().get(i).get(j));
            }
            System.out.print("\n");
        }
    }
}
