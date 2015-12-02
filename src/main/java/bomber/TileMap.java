package bomber;

public class TileMap {
	
	private Tile[][] map;
	
	public TileMap(int xSize, int ySize){
		map = new Tile[xSize][ySize];
		for(int i=0; i<xSize; i++){
			for (int j=0; j<ySize; j++){
				map[i][j] = new Tile(i,j);
			}
		}
	}
	
	public void addAllTiles(BombermanGameScene scene, int xSize, int ySize) {
		for (int i = 0; i < xSize; i++){
			for (int j = 0; j < ySize; j++){
				scene.addComponent(map[i][j]);
			}
		}
	}
	
	public void addTile(BombermanGameScene scene, int x, int y){
		scene.addComponent(map[x][y]);
	}
	
	public Tile getTile(int i, int j){
		return map[i][j];
	}
}
