package bomber;

import com.uqbar.vainilla.GameComponent;
import com.uqbar.vainilla.appearances.Appearance;
import com.uqbar.vainilla.appearances.SimpleAppearance;
import java.awt.Graphics2D;
import java.awt.Color;


public class TileAppearrence<Tile> implements Appearance {
	
	private int tileSize = 30;

	@Override
	public double getWidth() {
		return tileSize;
	}

	@Override
	public double getHeight() {
		return tileSize;
	}

	@Override
	//WARNING!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	//***************************************
	public <T extends Appearance> T copy() {
		return (T) (new TileAppearrence());
	}
	//***************************************

	@Override
	public void update(double delta) {
		// TODO Auto-generated method stub

	}

	@Override
	public void render(GameComponent<?> component, Graphics2D graphics) {
		int x = (int)component.getX();
		int y = (int)component.getY();
		graphics.setColor(Color.BLACK);
		graphics.drawRect(x, y, tileSize, tileSize);
		//graphics.setColor(getDrawColor());
		
	}

}
