import java.awt.Point;

public class Player extends Grid{
        
        private Point position;
        private boolean canLeft = true;
        private boolean canHoriz = true;
        public Player(Point point){
        	position = point;
        }
        
        public int getX(){
                return position.x;
        }
        public int getY(){
                return position.y;
        }
        public Point getPosition(){
        	return position;
        }
        public boolean moveLeft(){
                if(canLeft && canHoriz){
	                --position.x;
	                canLeft = false;
	                canHoriz = false;
	                return true;
                }
                return false;
        }
        
        public boolean moveRight(){
        	if(canHoriz){
                position.x += 2;
                canHoriz = false;
                return true;
        	}
        	return false;
        }
        
        public boolean moveUp(){
        	if(!canHoriz){
                --position.y;
                canHoriz = true;
                return true;
        	}
        	return false;
        }
        
        public boolean moveDown(){
        		if(!canHoriz){
	                ++position.y;
	                canHoriz = true;
	                return true;
        		}
        		return false;
        }
}