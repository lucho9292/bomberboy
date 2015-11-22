package bomber;

import com.uqbar.vainilla.DeltaState;
//import com.uqbar.vainilla.appearances.Sprite;
import com.uqbar.vainilla.appearances.Rectangle;
import com.uqbar.vainilla.colissions.CollisionDetector;
import com.uqbar.vainilla.events.constants.Key;

import java.awt.Color;
import java.util.ArrayList;

public class BombermanPlayer extends RichGameComponent {
	
	public BombermanPlayer(Color c){
		this.setAppearance(new Rectangle(c, w, h));
		//this.setAppearance(Sprite.fromImage("\\png\\ff3warrior.png").scale(0.8));		
	}
	
	public void dropBomb(DeltaState ds){
		//crear una bomba en la posicion actual
		Bomba b = new Bomba(this.getX(),this.getY());
		this.getScene().addComponent(b);
	}
	
	@Override
	public void onSceneActivated(){
		this.setX(w);
		this.setY(h);
	}
	
	@Override
	public void update(DeltaState deltaState) {
		
		if (deltaState.isKeyPressed(Key.A)){
			this.dropBomb(deltaState);
		}
		
		if (!(this.colisionaConParedes(this.getScene().getParedes()))){
			//Keyboard movements
			if (deltaState.isKeyPressed(Key.LEFT)){
				this.setX(this.getX()-w);
			}
			if (deltaState.isKeyPressed(Key.RIGHT)){
				this.setX(this.getX()+w);
			}
			if (deltaState.isKeyPressed(Key.UP)){
				this.setY(this.getY()-h);
			}
			if (deltaState.isKeyPressed(Key.DOWN)){
				this.setY(this.getY()+h);
			}
		}
		else{
			this.setX(this.getX());
			this.setY(this.getY());
		}

			
	}
	
	private boolean colisionaConParedVertical(Pared p){
		return CollisionDetector.INSTANCE.collidesRectAgainstRect(
				this.getX(), this.getY(), w, h,
				p.getX(), p.getY(), w, 600);
				
				
	}
	
	private boolean colisionaConParedHorizontal(Pared p){
		return CollisionDetector.INSTANCE.collidesRectAgainstRect(
				this.getX(), this.getY(), w, h,
				p.getX(), p.getY(), 800, h);
				
				
	}
	
	private boolean colisionaConParedes(ArrayList<Pared> ps){
//		boolean ret = false;
//		ret = ret ||
//				this.colisionaConPared(this.getScene().pared1) ||
//				this.colisionaConPared(this.getScene().pared2) ||
//				this.colisionaConPared(this.getScene().pared3) ||
//				this.colisionaConPared(this.getScene().pared4);
//		return ret;
		return (this.colisionaConParedVertical(this.getScene().pared1) 
		|| this.colisionaConParedHorizontal(this.getScene().pared2)
		|| this.colisionaConParedVertical(this.getScene().pared3)
		|| this.colisionaConParedHorizontal(this.getScene().pared4));
	}

}
