package bomber;


import com.uqbar.vainilla.GameComponent;

public class Tile extends RichGameComponent {
	
	public RichGameComponent contenido = null;
	//Contenido :  Fuego | Bomba | Ladrillo | Null

	
	public Tile(double x, double y){
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
	
	public void agregarEmptyBlock(EmptyBlock b){
		this.contenido = b;
		this.setAppearance(this.verContenido().getAppearance());
	}
	
	public void agregarBomba(Bomba b){
		//La bomba solo se puede agregar en el Tile en el que se encuentra
		//el personaje, por lo tanto es imposible que se agregue sobre un Bloque
		this.contenido = b;
		this.setAppearance(this.verContenido().getAppearance());
	}
	
	public void agregarFuego(Fuego f){
		this.contenido = f;
		this.setAppearance(this.verContenido().getAppearance());
	}
	
	public void explode(int x, int y){
		this.contenido.explode(x,y);
	}
		
}
