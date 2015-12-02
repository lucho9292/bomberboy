package bomber;

import java.awt.Color;

import com.uqbar.vainilla.appearances.Rectangle;

public class SolidBlock extends RichGameComponent{
	
	public SolidBlock(){
		this.setAppearance(new Rectangle(Color.BLACK, w, h));
	}
	
	public void explode(int x, int y){
		
	}

}
