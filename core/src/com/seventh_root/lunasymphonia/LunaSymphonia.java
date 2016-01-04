package com.seventh_root.lunasymphonia;

import com.badlogic.gdx.Game;
import com.seventh_root.lunasymphonia.screen.MenuScreen;

public class LunaSymphonia extends Game {
	
	@Override
	public void create () {
		setScreen(new MenuScreen());
	}

}
