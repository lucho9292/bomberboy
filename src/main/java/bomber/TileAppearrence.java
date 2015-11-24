package bomber;

import com.uqbar.vainilla.GameComponent;
import com.uqbar.vainilla.appearances.Appearance;
import com.uqbar.vainilla.appearances.SimpleAppearance;
import java.awt.Graphics2D;
import java.awt.Color;


public class TileAppearrence<Tile> implements Appearance {
	
	private int xSize = 53;
	private int ySize = 46;

	@Override
	public double getWidth() {
		return xSize;
	}

	@Override
	public double getHeight() {
		return ySize;
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
	}

	@Override
	public void render(GameComponent<?> component, Graphics2D graphics) {
		int x = (int)component.getX();
		int y = (int)component.getY();
		graphics.setColor(Color.BLACK);
		graphics.drawRect(x, y, xSize, ySize);
		//graphics.setColor(getDrawColor());
		graphics.fillRect(x, y, xSize - 1, ySize - 1);

	}

}
