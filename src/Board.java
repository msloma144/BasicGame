import java.util.ArrayList;

/**
 * Created by chari on 2/5/2017.
 */
class Board {
    private ArrayList<ArrayList<String>> board; //playing board

    Board(int width, int height)
    {
        generateBoard(width, height);
    }

    private void generateBoard(int width, int height){
        //builds board of *'s for playing area
        this.board = new ArrayList<>();
        for(int i = 0; i < height; i++){ //make the height of the board
            board.add(new ArrayList<>());
            for(int j = 0; j < width; j++){ //fill the board
                this.board.get(i).add("*  ");
            }
        }
    }

    int getBoardWidth(){
        return board.size();
    }

    int getBoardHeight(){
        return board.get(1).size();
    }

    ArrayList<ArrayList<String>> getBoard(){
        return this.board;
    }

}
