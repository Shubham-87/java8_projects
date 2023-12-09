package com.example.lambda;

import java.util.Random;

public class ThreadsUsingLambda {

	static String[] games = { "COD", "Prince Of Persia", "GTA-V5", "Valorant", "FIFA 22", "Fortnite" };
	static String[] tracks = { "Believer", "Cradles", "Taki Taki", "Sorry", "Let Me Love You" };

	
	public void playGame(String gamename) throws InterruptedException {

		System.out.printf("Game %s is running\n", gamename);

		Thread.sleep(500);

		System.out.printf("Game %s is ended\n", gamename);

	}

	public void playMusic(String musicname) throws InterruptedException {

		System.out.printf("Music %s is running\n", musicname);

		Thread.sleep(500);

		System.out.printf("Music %s is ended\n", musicname);

	}

	public static void main(String[] args) {
		ThreadsUsingLambda player=new ThreadsUsingLambda();
		
		Random random=new Random();
		
		Runnable gameRunner=()->{
			try {
				player.playGame(games[random.nextInt(games.length-1)]);
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		};
		
		Runnable musicRunner=()->{
			try {
				player.playMusic(tracks[random.nextInt(tracks.length-1)]);
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		};
		
		Thread runGame=new Thread(gameRunner);
		Thread runMusic=new Thread(musicRunner);
		
		runGame.start();
		runMusic.start();
	}

}
