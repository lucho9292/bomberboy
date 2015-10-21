package bomber;

import java.awt.Dimension;

import arkanoid.ArkanoidJuego;

import com.uqbar.vainilla.DesktopGameLauncher;
import com.uqbar.vainilla.Game;

public class BombermanJuego extends Game {

	
	//Main method
	public static void main(String[] args) {
		new DesktopGameLauncher(new ArkanoidJuego()).launch();
	}
	
	@Override
	protected void initializeResources() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void setUpScenes() {
		// TODO Auto-generated method stub

	}

	@Override
	public Dimension getDisplaySize() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

}
