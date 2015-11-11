package bomber;


import java.awt.Color;

import com.uqbar.vainilla.GameScene;

public class BombermanGameScene extends GameScene {
	
	private BombermanPlayer pj = new BombermanPlayer(Color.RED);
	private Pared pared1 = new Pared(true, 0, 0);
	private Pared pared2 = new Pared(false,0,0);
	private Pared pared3 = new Pared(true,770,0);
	private Pared pared4 = new Pared(false,0,550);
	//monstruos
	
	public BombermanGameScene(){
		this.addComponent(pj);
		this.addComponent(pared1);
		this.addComponent(pared2);
		this.addComponent(pared3);
		this.addComponent(pared4);
		this.createVerticalWall(4, 4, 10);
		this.createHorizontalWall(6,6,2);
	}
	
	public void createVerticalWall(double x, double y,int cant){
		Tile firstTile = new Tile(false,x,y);
		this.addComponent(firstTile);
		for(int i=1; i<=cant; i++){
			Tile newTile = new Tile(false,x,y+i);
			this.addComponent(newTile);
		}
	}
	
	public void createHorizontalWall(double x, double y,int cant){
		Tile firstTile = new Tile(false,x,y);
		this.addComponent(firstTile);
		for(int i=1; i<=cant; i++){
			Tile newTile = new Tile(false,x+i,y);
			this.addComponent(newTile);
		}
	}
	
}
