import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by chari on 2/5/2017.
 */
public class GenerateBoard {
    private ArrayList<ArrayList<String>> board; //playing board

    public GenerateBoard(int width, int height)
    {
        //builds board of *'s for playing area
        this.board = new ArrayList<>();
        for(int i = 0; i < width; i++){ //make the height of the board
            board.add(new ArrayList<>());
            for(int j = 0; j < height; j++){ //fill the board
                this.board.get(i).add("*  ");
            }
        }
    }

    protected int getBoardWidth(){
        return board.size();
    }

    protected int getBoardHeight(){
        return board.get(1).size();
    }

    protected ArrayList<ArrayList<String>> getBoard(){
        return this.board;
    }

    //displays the board
    public String toString(){
        for(int i = 0; i < board.size(); i++){
            for(int j = 0; j < board.get(i).size(); j++){
                System.out.print(board.get(i).get(j));
            }
            System.out.print("\n");
        }
        return "";
    }
}
