import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by chari on 2/5/2017.
 */
public class GenerateBoard {
    private ArrayList<ArrayList<String>> board;
    public GenerateBoard(int width, int height)
    {
        this.board = buildBoard(width, height);
    }

    private ArrayList<ArrayList<String>> buildBoard(int width, int height){
        ArrayList<ArrayList<String>> board = new ArrayList<ArrayList<String>>();
        for(int i = 0; i < width; i++){
            board.add(new ArrayList<String>());
            for(int j = 0; j < height; j++){
                board.get(i).add("*");
            }
        }
        return board;
    }

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
