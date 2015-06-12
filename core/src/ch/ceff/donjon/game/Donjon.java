package ch.ceff.donjon.game;

import ch.ceff.donjon.game.Screen.LoadingScreen;
import ch.ceff.donjon.game.Tools.GeneratorFont;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.BitmapFont;

public class Donjon extends Game {

	public static AssetManager am;
	public static int GAME_WIDTH = 640, GAME_HEIGHT = 480, SALLE_COL = 20, SALLE_ROW = 15;
	public static int MAX_LIFE = 50;
	public static int MAX_LIFE_MONSTER = 35;
	public static int MAX_MONSTERS = 70, MONSTERS_COOLDOWN_MIN = 300, MONSTERS_COOLDOWN_MAX = 420;
	public static BitmapFont defaultFont;

	@Override
	public void create() {
		defaultFont = GeneratorFont.generate(Gdx.files.internal("data/Font/Centaur.ttf"));
		setScreen(new LoadingScreen(this));
	}

	@Override
	public void dispose() {
		am.dispose();
		defaultFont.dispose();
	}

	@Override
	public void render() {		
		super.render();
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}
}
