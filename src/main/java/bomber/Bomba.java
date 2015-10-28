package bomber;

import java.awt.Color;

import com.uqbar.vainilla.DeltaState;
import com.uqbar.vainilla.GameComponent;
import com.uqbar.vainilla.appearances.Circle;

public class Bomba extends GameComponent<BombermanGameScene> {
	
	private double elapsed = 0.0;
	private double countdown = 1.5;
	
	public Bomba(double x, double y){
		this.setX(x);
		this.setY(y);
		this.setAppearance(new Circle(Color.BLACK, 28));
		//this.explotar();
	}
	
	public void explotar(){
		this.destroy();
		destruirTiles();
	}
	
	public void destruirTiles(){
		//TODO
	}
	
	public void update(DeltaState ds){
		this.elapsed += ds.getDelta();
		if (elapsed >= countdown)
			{this.explotar();}
	}
	
	
}
	