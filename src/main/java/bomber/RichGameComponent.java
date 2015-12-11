package bomber;

import com.uqbar.vainilla.GameComponent;

public abstract class RichGameComponent extends GameComponent<BombermanGameScene> {
	public int w = 53;
	public int h = 46;
	
	public void explode(int x, int y){
		
	}
	
	/**
	 * calcula el centro de los rectangulos
	 * @return int[x del centro, y del centro]
	 */
	protected int[] getCenter(){
		int[] r = new int[2];
		r[0] = (int) getX()+(w/2);
		r[1] = (int) getY()+(h/2);
		return r;
	}
	/**
	 * calcula el tile al que pertenece el rectangulo
	 * @return int[tile x, tile y]
	 */
	private int[] getTileH(){
		int[] r = getCenter();
		r[0] = r[0]/w;
		r[1] = r[1]/h;
		return r;
	}
	
	public int[] calculateTileCenter(){
		int[] t = getTileH();
		t[0] = t[0]*w + (w/2);
		t[1] = t[1]*h + (h/2);
		return t;
		
	}
}
