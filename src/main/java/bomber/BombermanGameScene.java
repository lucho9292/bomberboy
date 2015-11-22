package bomber;


import java.awt.Color;
import java.util.ArrayList;

import com.uqbar.vainilla.GameScene;

public class BombermanGameScene extends GameScene {
	
	private BombermanPlayer pj = new BombermanPlayer(Color.RED);
	public Pared pared1 = new Pared(true, 0, 0);
	public Pared pared2 = new Pared(false, 0, 0);
	public Pared pared3 = new Pared(true,795-53,0);
	public Pared pared4 = new Pared(false,0,598-46);
	//Array de dos dimensiones
	//private Tile[][] grid = new Tile[5][10];
	
	
	
	public BombermanGameScene(){
		this.addComponent(pj);
		this.createVerticalWall(4, 4, 10);
		this.createHorizontalWall(6,6,2);
		this.addComponent(pared1);
		this.addComponent(pared2);
		this.addComponent(pared3);
		this.addComponent(pared4);
	}
	
//	public void paredes(){
//		Pared pared1 = new Pared(true, 0, 0);
//		Pared pared2 = new Pared(false,0,0);
//		Pared pared3 = new Pared(true,770,0);
//		Pared pared4 = new Pared(false,0,550);
//
//	}
	
	public ArrayList<Pared> getParedes(){
		ArrayList<Pared> ret = new ArrayList<>();
		ret.add(pared1);
		ret.add(pared2);
		ret.add(pared3);
		ret.add(pared4);
		return ret;
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
