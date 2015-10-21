package bomber;


import com.uqbar.vainilla.GameScene;

public class BombermanGameScene extends GameScene {
	
	private BombermanPlayer pj = new BombermanPlayer();
	//tiles
	//monstruos
	
	public BombermanGameScene(){
		this.addComponent(pj);
	}
	
}
