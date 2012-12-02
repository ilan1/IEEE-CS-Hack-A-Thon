import java.awt.Point;

 
public class Grid {

	private int size = MIN_SIZE;
	private Object[][] spaces;
	private final static int MIN_SIZE=5;
	
	public Grid(){
		spaces = new Object[5][5];
	}
	
	public Grid(Integer size){
		if(size < MIN_SIZE) spaces = new Object[5][5];
		if(size % 2 > 0) spaces = new Object[size-1][size-1];
		else spaces = new Object[size][size];
	}
	public int size(){
            return size;
        }
	public boolean checkPlayerPosition(Player player){
	
		if ((player.getX()<size && player.getX()>=0)
		&& (player.getY()<size && player.getY()>=0)) {
			return true;
		}
		return false;
	}
	
	private boolean isInGrid(Point point){
		if ((point.x<size && point.x>=0)
			&& (point.y<size && point.y>=0)) 
		return true;
		return false;
	}
	
	public boolean fillSpace(Point point){
		if (isInGrid(point)){
			spaces[point.x][point.y] = new Object();
			return true;
		}
		return false;
	}
	
	public void display(Player player){
		for(int j = 0 ;j<size;++j){
			for(int i = 0 ;i<size;++i){
				if(player.getX()==i&&player.getY()==j) System.out.print("{*}");
				else if(spaces[i][j] != null && !(spaces[i][j] instanceof Player)) System.out.print("{1}");
				else System.out.print("{ }");
			}
			System.out.println();
		}
	}
        public String display(){
            String ret="";
            for(int i = 0; i <size;++i){
                for(int j = 0; j<size;++j){
                    if(spaces[i][j] != null && !(spaces[i][j] instanceof Player)) ret+="{1}";
				else ret+="{ }";
                }
                ret+="\n";
            }
            return ret;
        }
	
	
	
}
