package bomber;


import java.awt.Graphics2D;

import com.uqbar.vainilla.GameComponent;

public class Tile extends RichGameComponent {
	
	private GameComponent<BombermanGameScene> contenido = null;
	//Contenido :  Fuego | Bomba | Ladrillo | Null

	
	public Tile(double x, double y){
		//this.setAppearance(new TileAppearrence<Tile>());
		this.setX(x*w);
		this.setY(y*h);
		
	}
	
	public GameComponent<BombermanGameScene> verContenido(){
		return contenido;
	}
	
	public void agregarDestructibleBlock(DestructibleBlock b){
		this.contenido = b;
		this.setAppearance(this.verContenido().getAppearance());
	}
	
	public void agregarSolidBlock(SolidBlock b){
		this.contenido = b;
		this.setAppearance(this.verContenido().getAppearance());
	}
		
}
