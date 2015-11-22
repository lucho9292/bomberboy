package bomber;

import java.awt.Dimension;




import com.uqbar.vainilla.DesktopGameLauncher;
import com.uqbar.vainilla.Game;

public class BombermanJuego extends Game {

	
	//Main method
	public static void main(String[] args) {
		new DesktopGameLauncher(new BombermanJuego()).launch();
	}
	
	@Override
	protected void initializeResources() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void setUpScenes() {
		//Creo una escena nueva
		BombermanGameScene scene = new BombermanGameScene();
		
		this.setCurrentScene(scene);
	}

	@Override
	public Dimension getDisplaySize() {
		// TODO Auto-generated method stub
		return new Dimension(795, 598);
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return "Don Pepe y los globos";
	}

}
