package bomber;

import java.awt.Color;

import com.uqbar.vainilla.DeltaState;
import com.uqbar.vainilla.appearances.Circle;

public class Bomba extends RichGameComponent {
	
	private BombermanPlayer player;
	
	private double elapsed = 0.0;
	private double countdown = 1.5;
	
	public Bomba(BombermanPlayer pj, double x, double y){
		this.setX(x);
		this.setY(y);
		this.player = pj;
		this.setAppearance(new Circle(Color.BLACK, 28));
		this.player.bombaCreada();
		//la bomba conoce al jugador
	}
	
	public void explotar(){
		
		this.spawnFire(player.getPower());
		this.destroy();
		this.player.bombaDestruida();
		//avisar al jugador que exploto
		//this.spawnFire(this.x,this.y)
	}
	
	public void spawnFire(int power){
//		Fuego f1 = new Fuego(this.getX(),this.getY());
//		Fuego f2 = new Fuego(this.getX()+w,this.getY());
//		Fuego f3 = new Fuego(this.getX()-w,this.getY());
//		Fuego f4 = new Fuego(this.getX(),this.getY()+h);
//		Fuego f5 = new Fuego(this.getX(),this.getY()-h);
//		this.getScene().addComponent(f1);
//		this.getScene().addComponent(f2);
//		this.getScene().addComponent(f3);
//		this.getScene().addComponent(f4);
//		this.getScene().addComponent(f5);
		
		int x = (int) this.getX();
		int y = (int) this.getY();
		
		Fuego f1 = new Fuego(this.getX(),this.getY());
		this.getScene().addComponent(f1);
		
		for (int i=0; i<=power; i++){
			Fuego f2 = new Fuego(x,y+(i*h));
			this.getScene().addComponent(f2);
			Fuego f3 = new Fuego(x,y-(i*h));
			this.getScene().addComponent(f3);
			Fuego f4 = new Fuego(x+(i*h),y);
			this.getScene().addComponent(f4);
			Fuego f5 = new Fuego(x-(i*h),y);
			this.getScene().addComponent(f5);
		}
	}
	
	
	
	public void update(DeltaState ds){
		this.elapsed += ds.getDelta();
		if (elapsed >= countdown)
			{this.explotar();}
	}
	
	
}
	