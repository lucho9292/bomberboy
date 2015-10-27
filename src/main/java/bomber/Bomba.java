package bomber;

import java.awt.Color;

import com.uqbar.vainilla.GameComponent;
import com.uqbar.vainilla.appearances.Circle;

public class Bomba extends GameComponent<BombermanGameScene> {
	
	private double elapsed = 0.0;
	private double countdown = 5.0;
	
	public Bomba(double x, double y){
		this.setX(x);
		this.setY(y);
		this.setAppearance(new Circle(Color.BLACK, 28));
	}
	
	public void explotar(){
		while (elapsed < countdown){
			elapsed = elapsed + 0.1;
		}
		this.destroy();
	}
	
	
}
	