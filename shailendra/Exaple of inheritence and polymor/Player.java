package com.java.practice.pra;

public class Player extends Cricketer {

	public static void main(String[] args) {
		Athelete athelate = new Athelete();
		athelate.run();

		Cricketer cricketer = new Cricketer();
		cricketer.run();

		Player player = new Player();
		player.run();
		player.cricket();

	}

}
