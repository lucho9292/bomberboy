package bomber;


import java.awt.Color;
import com.uqbar.vainilla.GameScene;

public class BombermanGameScene extends GameScene {//TODO ponerle amor para que sea mas elegante
	
	private TileMap map;
	
	public BombermanGameScene() {
		addComponent(new BombermanPlayer(Color.RED));
//		buildFieldLimits();
//		buildFieldObstacle();
//		addComponent(new DestructibleBlock(742, 552));
		map = new TileMap(15,13);
		map.addAllTiles(this, 15, 13);
//		Tile t = new Tile(4,4);
//		t.agregarSolidBlock(new SolidBlock(40,40));
//		map.addTile(this,t, 4, 4);
		//map.getTile(1,1).agregarSolidBlock(new SolidBlock());
		buildWalls();
		intermitentBlocks(2, 2, 12, 10);
		System.out.println("el tile: " + map.getTile(4,4) + "  <---");
		System.out.println("coordenadas del tile: " + map.getTile(4,4).getX() + "," + map.getTile(4,4).getY());
		System.out.println("el bloque: " + map.getTile(4, 4).verContenido()+ "  <---");
		
	}
	
	private void buildHorizontalLine(int y, int startX, int endX){
		for (int i=startX; i < endX; i++){
			map.getTile(i, y).agregarSolidBlock(new SolidBlock());
		}		
	}
	
	private void buildVerticalLine(int x, int startY, int endY){
		for (int i=startY; i < endY; i++){
			map.getTile(x, i).agregarSolidBlock(new SolidBlock());
		}	
	}
	
	private void buildWalls(){
		buildHorizontalLine(0, 0, 15);
		buildHorizontalLine(12, 0, 15);
		buildVerticalLine(0,0,13);
		buildVerticalLine(14,0,13);
	}
	
	private void intermitentBlocks(int startX, int startY, int endX, int endY){
		for (int i=startX; i < (endX+2); i=i+2){
			for (int j = startY; j < (endY+2); j=j+2){
				map.getTile(i, j).agregarSolidBlock(new SolidBlock());
			}
		}
	}

//	private void buildWAll(boolean vertical, int x, int y, int length) {
//		if(vertical){
//			buildObstacleLine(vertical, x, y, (length%2)+(length/2));
//			buildObstacleLine(vertical, x, y+46, (length/2));
//		}else{
//			buildObstacleLine(vertical, x, y, (length%2)+(length/2));
//			buildObstacleLine(vertical, x+53, y, (length/2));
//		}
//	}
//
//	private void buildFieldLimits() {
//		buildWAll(true, 0, 0, 13);
//		buildWAll(true, 742, 0, 13);
//		buildWAll(false, 53, 0, 14);
//		buildWAll(false, 53, 552, 14);
//	}
//
//	private void buildObstacleLine(boolean vertical, int x, int y, int length) {
//		int aux;
//		if (vertical) {
//			aux = y;
//			for (int i = 0; i < length; i++) {
//				addComponent(new SolidBlock(x, aux));
//				//(map[x][aux]).agregarSolidBlock(new SolidBlock(x, aux));
//				aux += 92;
//			}
//		} else {
//			aux = x;
//			for (int i = 0; i < length; i++) {
//				addComponent(new SolidBlock(aux, y));
//				aux += 106;
//			}
//		}
//	}
//	
//	private void buildFieldObstacle(){
//		int y=92;
//		for(int i=0; i<5;i++){
//			buildObstacleLine(false, 106, y, 6);
//			y += 92;
//			
//		}
//	}
	
}
