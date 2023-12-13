package com.finalyear.game.entities;

import java.net.InetAddress;

import com.finalyear.game.InputHandler;
import com.finalyear.game.level.Level;

public class PlayerMp extends Player {
	public InetAddress ipAddress;
	public int port;

	public PlayerMp(Level level, int x, int y, InputHandler input, String username, InetAddress ipAddress, int port) {
		super(level, x, y, input, username);
		this.ipAddress = ipAddress;
		this.port = port;
	}

	public PlayerMp(Level level, int x, int y, String username, InetAddress ipAddress, int port) {
		super(level, x, y, null, username);
		this.ipAddress = ipAddress;
		this.port = port;
	}

	public void tick() {
		super.tick();
	}
}
