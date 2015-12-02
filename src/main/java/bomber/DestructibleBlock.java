package bomber;

import java.awt.Color;

import com.uqbar.vainilla.DeltaState;
import com.uqbar.vainilla.appearances.Rectangle;
//import com.uqbar.vainilla.appearances.Rectangle;

public class DestructibleBlock extends RichGameComponent{
	
	public DestructibleBlock(){
		this.setAppearance(new Rectangle(Color.GRAY, w, h));
//		this.setX(x);
//		this.setY(y);
	}
	
	@Override
	public void update(DeltaState deltaState) {
		super.update(deltaState);
	}
	
	public void explode(int x,int y){
		this.getScene().getTileMap().getTile(x, y).agregarEmptyBlock(new EmptyBlock());
	}
}
