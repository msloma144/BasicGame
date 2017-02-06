/**
 * Created by chari on 2/5/2017.
 */
public class Player {
    private int posX;
    private int posY;

    public Player(int posX, int posY){
        this.posX = posX;
        this.posY = posY;
    }

    public Player(){
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

    public void setPosX(int posX){
        this.posX = posX;
    }

    public void setPosY(int posY){
        this.posY =posY;
    }

    public void movePlayer(int newPosX, int newPosY){
        //On keypress, update player positon
        this.posX = newPosX;
        this.posY = newPosY;
    }
}
