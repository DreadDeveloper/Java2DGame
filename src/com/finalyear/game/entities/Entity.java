package com.finalyear.game.entities;

import com.finalyear.game.gfx.Screen;
import com.finalyear.game.level.Level;

public abstract class Entity {
	public int x, y;
	protected Level level;

	public Entity(Level level) {
		init(level);
	}

	public final void init(Level level) {
		this.level = level;
	}

	public abstract void tick();

	public abstract void render(Screen screen);

}
