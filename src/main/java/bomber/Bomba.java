package bomber;

import java.awt.Color;

import com.uqbar.vainilla.DeltaState;
import com.uqbar.vainilla.appearances.Circle;

public class Bomba extends RichGameComponent {
	
	private Player player;
	
	private double elapsed = 0.0;
	private double countdown = 1.5;
	
	public Bomba(Player pj, double x, double y){
		this.setX(x-14);
		this.setY(y-14);//TODO arreglar este hardcodeo
		this.player = pj;
		this.setAppearance(new Circle(Color.BLACK, 28));
	}
	
	public void explotar(){
		
		this.spawnFire(player.getPower());
		this.destroy();
		player.bombs++;
	}
	
	public void spawnFire(int power){
		int x = (int) this.getX();
		int y = (int) this.getY();
		
		Fuego f1 = new Fuego(this.getX(),this.getY());
		this.getScene().addComponent(f1);
		
//		for (int i=1; i<=power; i++){
//			Fuego f2 = new Fuego(x,y+(i*h));
//			this.getScene().addComponent(f2);
//			Fuego f3 = new Fuego(x,y-(i*h));
//			this.getScene().addComponent(f3);
//			Fuego f4 = new Fuego(x+(i*w),y);
//			this.getScene().addComponent(f4);
//			Fuego f5 = new Fuego(x-(i*w),y);
//			this.getScene().addComponent(f5);
		int xtile = calculatePositionXInTilemap(x);
		int ytile = calculatePositionYInTilemap(y);
		System.out.println("Se esta tratando de spawnear fuego en base al tile: " + xtile + "@" + ytile);
		
		for (int i=1; i<=power; i++){
			
			
			if (calculatePositionYInTilemap(y+(i*h)) < 12){
				if ( ! (this.player.map.getTile(xtile,calculatePositionYInTilemap(y+(i*h))).contenido instanceof SolidBlock))
					{System.out.println("El primer fuego en: "  + xtile + "@" + calculatePositionYInTilemap(y+(i*h)) );
					Fuego f2 = new Fuego(x,y+(i*h));
					this.getScene().addComponent(f2);}
			}
			
			
			if (calculatePositionYInTilemap(y-(i*h)) > 0){
				if ( ! (this.player.map.getTile(xtile,calculatePositionYInTilemap(y-(i*h))).contenido instanceof SolidBlock))
					{System.out.println("El segundo fuego en: "  + xtile + "@" + calculatePositionYInTilemap(y-(i*h)) );
					Fuego f3 = new Fuego(x,y-(i*h));
					this.getScene().addComponent(f3);}
			}
			
			
			if (calculatePositionXInTilemap(x+(i*h)) < 14 ){
				if ( ! (this.player.map.getTile(calculatePositionXInTilemap(x+(i*h)),ytile).contenido instanceof SolidBlock))	
					{System.out.println("El tercer fuego en: "  + calculatePositionXInTilemap(x+(i*h)) + "@"  + ytile);
					Fuego f4 = new Fuego(x+(i*h),y);
					this.getScene().addComponent(f4);}
			}
			
			
			if (calculatePositionXInTilemap(x-(i*h)) > 0){
				if ( ! (this.player.map.getTile(calculatePositionXInTilemap(x-(i*h)),ytile).contenido instanceof SolidBlock))
				{System.out.println("El primer fuego en: "  + calculatePositionXInTilemap(x-(i*h)) + "@" + ytile );
				Fuego f5 = new Fuego(x-(i*h),y);
				this.getScene().addComponent(f5);}
			}
		}
}
	
	
	
	public void update(DeltaState ds){
		this.elapsed += ds.getDelta();
		if (elapsed >= countdown)
			{this.explotar();}
	}
	
	
}
	