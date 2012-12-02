import java.awt.Point;

import junit.framework.TestCase;


public class TestPlayer extends TestCase{
	
	public void testMovement() {
		
		Player player = new Player(new Point(2,2));
		
		assertTrue(player.moveRight());
		assertFalse(player.moveRight());
		
		assertTrue(player.moveDown());
		assertFalse(player.moveDown());
		
		assertTrue(player.moveLeft());
		assertFalse(player.moveLeft());
		
		assertTrue(player.moveUp());
		assertFalse(player.moveUp());
		
		assertFalse(player.moveLeft());
		assertTrue(player.moveRight());
		
	}
	
}
