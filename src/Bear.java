
import java.awt.Point;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nick
 */
public class Bear extends Grid{
    private boolean horizontal;
    private boolean vertical;
    private boolean random;
    private boolean box;
    private boolean crazy;
    private Point position;
    /**
     *
     * @param hori
     * @param vert
     * @param ran
     * @param boxy
     * @param craycray
     */
    public Bear(boolean hori, boolean vert, boolean ran, boolean boxy, boolean craycray, Point position){
        horizontal = hori;
        vertical = vert;
        random = ran;
        box = boxy;
        crazy = craycray;        
    }
    public void move(){
        if(horizontal){
            if(position.x+1<=size()){
                ++position.x;
            }else
                --position.x;
        }
        
    }
    
}
