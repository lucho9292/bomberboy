package bomber;

import java.awt.Color;

import com.uqbar.vainilla.DeltaState;
import com.uqbar.vainilla.appearances.Rectangle;
import com.uqbar.vainilla.colissions.CollisionDetector;
//import com.uqbar.vainilla.appearances.Rectangle;

public class DestructibleBlock extends RichGameComponent {

	boolean b = true;
	public int tileX;
	public int tileY;

	public DestructibleBlock() {
		this.setAppearance(new Rectangle(Color.GRAY, w, h));
		// this.setX(x);
		// this.setY(y);
	}
	
	public DestructibleBlock(int x, int y){
		this.setAppearance(new Rectangle(Color.GRAY, w, h));
		this.tileX = x;
		this.tileY = y;
	}

	@Override
	public void update(DeltaState deltaState) {
		super.update(deltaState);
	}

	public void explode(int x, int y) {// FIXME este metodo esta al pedo!!
		this.getScene().getTileMap().getTile(x, y).agregarEmptyBlock(new EmptyBlock());
	}

	@Override
	public boolean hasCollidesTo(RichGameComponent p) {
		return !CollisionDetector.INSTANCE.collidesRectAgainstRect(this.getX(), this.getY(), w, h, p.getX(), p.getY(), w,
				h);
	}

	@Override
	public void destroy() {
		// dropPowerup();
		super.destroy();
	}

	// TODO dropPowerup()
}
