package bomber;


import java.awt.Color;
import com.uqbar.vainilla.GameScene;

public class BombermanGameScene extends GameScene {//TODO ponerle amor para que sea mas elegante
	
	public BombermanGameScene() {
		addComponent(new BombermanPlayer(Color.RED));
		buildFieldLimits();
		buildFieldObstacle();
		addComponent(new DestructibleBlock(300, 300));
		
	}

	private void buildWAll(boolean vertical, int x, int y, int length) {
		if(vertical){
			buildObstacleLine(vertical, x, y, (length%2)+(length/2));
			buildObstacleLine(vertical, x, y+46, (length/2));
		}else{
			buildObstacleLine(vertical, x, y, (length%2)+(length/2));
			buildObstacleLine(vertical, x+53, y, (length/2));
		}
	}

	private void buildFieldLimits() {
		buildWAll(true, 0, 0, 13);
		buildWAll(true, 742, 0, 13);
		buildWAll(false, 53, 0, 14);
		buildWAll(false, 53, 552, 14);
	}

	private void buildObstacleLine(boolean vertical, int x, int y, int length) {
		int aux;
		if (vertical) {
			aux = y;
			for (int i = 0; i < length; i++) {
				addComponent(new SolidBlock(x, aux));
				aux += 92;
			}
		} else {
			aux = x;
			for (int i = 0; i < length; i++) {
				addComponent(new SolidBlock(aux, y));
				aux += 106;
			}
		}
	}
	
	private void buildFieldObstacle(){
		int y=92;
		for(int i=0; i<5;i++){
			buildObstacleLine(false, 106, y, 6);
			y += 92;
			
		}
	}
	
}
