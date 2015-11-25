package bomber;

import com.uqbar.vainilla.GameComponent;
//import com.uqbar.vainilla.appearances.Rectangle;

public class DestructibleBlock extends GameComponent<BombermanGameScene>{
	
	public DestructibleBlock(int x, int y){
		this.setAppearance(new TileAppearrence<Tile>());
		this.setX(x);
		this.setY(y);
	}
	
	public void explode(){
		this.destroy();
	}
}
