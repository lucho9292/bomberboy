package bomber;


import java.awt.Color;

import com.uqbar.vainilla.GameScene;

public class BombermanGameScene extends GameScene {
	
	private BombermanPlayer pj = new BombermanPlayer(Color.RED);
	private Pared pared1 = new Pared(true, 0, 0);
	private Pared pared2 = new Pared(false,0,0);
	private Pared pared3 = new Pared(true,780,0);
	private Pared pared4 = new Pared(false,0,580);
	//tiles
	//monstruos
	
	public BombermanGameScene(){
		this.addComponent(pj);
		this.addComponent(pared1);
		this.addComponent(pared2);
		this.addComponent(pared3);
		this.addComponent(pared4);
	}
	
}
