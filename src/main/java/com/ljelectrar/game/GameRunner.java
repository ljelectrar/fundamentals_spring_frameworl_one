package com.ljelectrar.game;

public class GameRunner {

	GameConsole game;

	public GameRunner(GameConsole game) {
		this.game = game;
	}

	public void run() {
		System.out.println("Gaming is running " + game);
		game.printConsole();
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
