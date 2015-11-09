package bomber;

import java.awt.Color;

import com.uqbar.vainilla.DeltaState;
import com.uqbar.vainilla.GameComponent;
import com.uqbar.vainilla.appearances.Circle;

public class Fuego extends GameComponent<BombermanGameScene>{
	private double elapsed = 0.0;
	private double countdown = 0.6;
	
	public Fuego(double x, double y){
		this.setX(x);
		this.setY(y);
		this.setAppearance(new Circle(Color.RED, 20));
	}
	
	public void destruirTiles(){
		//TODO
	}
	
	public void update(DeltaState ds){
		this.elapsed += ds.getDelta();
		if (elapsed >= countdown)
			{this.destroy();}
	}
}
