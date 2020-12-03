package com.duongxo.bomberman.entities.tile;


import com.duongxo.bomberman.entities.Entity;
import com.duongxo.bomberman.graphics.Sprite;

public class GrassTile extends Tile {

	public GrassTile(int x, int y, Sprite sprite) {
		super(x, y, sprite);
	}
	
	@Override
	public boolean collide(Entity e) {
		return true;
	}
}
