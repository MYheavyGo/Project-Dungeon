package ch.ceff.donjon.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import ch.ceff.donjon.game.Donjon;

public class DesktopLauncher {
    public static void main(String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

        config.title = "Donjon";
        config.resizable = false;

        new LwjglApplication(new Donjon(), config);
    }
}
