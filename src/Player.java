import java.util.Scanner;

/**
 * Created by chari on 2/5/2017.
 */
public class Player {
    private int posX;
    private int posY;

    public Player(int posX, int posY){
        this.posX = posX; // position on x axis
        this.posY = posY; // position on y axis
    }

    public Player(){
        //put player in default position
        this.posX = 0;
        this.posY = 0;
    }

    public int getX()
    {
        return this.posX;
    }

    public int getY()
    {
        return this.posY;
    }


    public void movePlayer(GenerateBoard board){
        //On key press, update player position
        Scanner in = new Scanner(System.in);
        String input = in.next();

        if(input.equals("w")){//when w is pressed
            if(this.posY > 0){
                this.posY --; //Move Player UP 1 in Y
            }
        }
        else if(input.equals("s")){ // when s is pressed
            if(this.posY < board.getBoardHeight()-1){
                this.posY ++; //Move Player DOWN 1 in Y
            }
        }
        else if(input.equals("a")){ //when a is pressed
            if(this.posX > 0){
                this.posX --; //Move Player LEFT 1 in X
            }
        }
        else if(input.equals("d")){ //when d is pressed
            if(this.posX < board.getBoardWidth()-1){
                this.posX ++; //Move Player RIGHT 1 in X
            }
        }
        else if(input.equals("q")){
            System.exit(0); //quit the program
        }
    }
}
