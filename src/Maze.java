import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Michael Sloma on 2/9/2017.
 */
class Maze {
    private ArrayList<ArrayList<String>> maze; // playing maze

    Maze() throws IOException{
        String selectedBoard = pickBoard(); // allow user to select board
        generateMaze(selectedBoard);
    }

    private void generateMaze(String selectedBoard)throws IOException{
        //bringing contents of file in
        File fileName = new File("D:\\Michael\\Desktop\\Synced Folder\\Programming\\Java\\BasicGame\\src\\mazeMaps.txt"); //bringing contents of file in
        Scanner inFile = new Scanner(fileName);

        maze = new ArrayList<>();

        boolean foundEntry = false; // flag to bring lines into array or not

        while(inFile.hasNext()){
            String inLine = inFile.nextLine();
            if(inLine.equals(selectedBoard)){
                foundEntry = true;
            }
            else if(inLine.equals("")){
                break;
            }
            else if(foundEntry) {
                //holder variables
                String line = inLine;
                ArrayList<String> temp = new ArrayList<>();

                while (!line.equals("")) {
                    try {
                        temp.add(line.substring(0, 3));
                        line = line.substring(3);
                    } catch (Exception error) {
                        temp.add(line.substring(0, 1));
                        line = "";
                    }
                }
                maze.add(temp);
            }
        }
    }

    private String pickBoard()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Board: ");
        String board = "testmaze1";
        // String board = in.nextLine();
        return board;
    }

    int getBoardHeight(){
        return maze.size();
    }

    int getBoardWidth(){
        return maze.get(1).size();
    }

    ArrayList<ArrayList<String>> getBoard(){
        return this.maze;
    }

    void playerReset(int playery, int playerx){
        this.maze.get(playery).set(playerx, "$  ");
    }

}
