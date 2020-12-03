package com.duongxo.bomberman.entities.tile;

import com.duongxo.bomberman.entities.Entity;
import com.duongxo.bomberman.graphics.Screen;
import com.duongxo.bomberman.graphics.Sprite;
import com.duongxo.bomberman.level.Coordinates;

public abstract class Tile extends Entity {
	
	
	public Tile(int x, int y, Sprite sprite) {
		_x = x;
		_y = y;
		_sprite = sprite;
	}
	
	@Override
	public boolean collide(Entity e) {
		return false;
	}
	
	@Override
	public void render(Screen screen) {
		screen.renderEntity( Coordinates.tileToPixel(_x), Coordinates.tileToPixel(_y), this);
	}
	
	@Override
	public void update() {}
}
