package com.duongxo.bomberman.level;


import com.duongxo.bomberman.exceptions.LoadLevelException;

public interface ILevel {

	public void loadLevel(String path) throws LoadLevelException;
}
