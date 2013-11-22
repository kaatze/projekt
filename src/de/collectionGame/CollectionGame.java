package de.collectionGame;

public interface CollectionGame {
	public void runGame(GlobalSettings globalSettings,
			MainMenuInterface mainMenuRef);

	public Score[] getHighscore();

	public Object getGamePics();
}
