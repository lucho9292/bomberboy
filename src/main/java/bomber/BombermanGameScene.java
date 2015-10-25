package bomber;


import java.awt.Color;

import com.uqbar.vainilla.GameScene;

public class BombermanGameScene extends GameScene {
	
	private BombermanPlayer pj = new BombermanPlayer(Color.RED);
	//tiles
	//monstruos
	
	public BombermanGameScene(){
		this.addComponent(pj);
	}
	
}
