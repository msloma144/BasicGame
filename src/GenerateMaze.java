import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Michael Sloma on 2/9/2017.
 */
class GenerateMaze {
    private ArrayList<ArrayList<String>> maze; // playing maze

    GenerateMaze(String mapName) throws IOException{
        Scanner in = new Scanner(System.in);
        PrintWriter inFile = new PrintWriter(new File("mazeMaps.txt"));

    }

    int getBoardWidth(){
        return maze.size();
    }

    int getBoardHeight(){
        return maze.get(1).size();
    }

    ArrayList<ArrayList<String>> getBoard(){
        return this.maze;
    }

}
