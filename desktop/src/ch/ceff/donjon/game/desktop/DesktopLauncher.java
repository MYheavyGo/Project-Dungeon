package ch.ceff.donjon.game.desktop;

import com.badlogic.gdx.Files;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import ch.ceff.donjon.game.Donjon;

public class DesktopLauncher {
    public static void main(String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

        config.title = "Donjon";
        config.resizable = false;
        config.useGL30 = true;
        config.vSyncEnabled = true;
        config.addIcon("data/icon.png", Files.FileType.Absolute);

        new LwjglApplication(new Donjon(), config);
    }
}
