import java.applet.Applet;
import java.awt.Point;

public class Driver {
	
	public static void main (String[]args){
		
		Player player = new Player(new Point(2,2));
		Grid grid = new Grid();
		grid.fillSpace(new Point(4,4));
		grid.display(player);
		player.moveLeft();
		player.moveDown();
		player.moveLeft();
		player.moveRight();
		player.moveDown();
		player.moveRight();
		System.out.println("here");
		grid.display(player);
		
		if(!grid.checkPlayerPosition(player)){
			System.out.println("Failed");
		}
	
	}
	
}
