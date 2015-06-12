package ch.ceff.donjon.game.Tools;

import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator.FreeTypeFontParameter;

/**
 * Created by CP-12GSP on 12.06.2015.
 */
public class GeneratorFont extends BitmapFont {

    public static BitmapFont generate(FileHandle fileHandle) {
        FreeTypeFontGenerator fontGenerator = new FreeTypeFontGenerator(fileHandle);
        FreeTypeFontParameter fontParameter = new FreeTypeFontParameter();

        getParameterMoney(fontParameter);

        BitmapFont bitmapFont = fontGenerator.generateFont(fontParameter);
        fontGenerator.dispose();
        return bitmapFont;
    }

    private static void getParameterMoney(FreeTypeFontParameter fontParameter) {
        fontParameter.color = Color.YELLOW;
        fontParameter.size = 35;
        fontParameter.borderColor = new Color(Color.rgb888(255, 255, 200));
        fontParameter.borderWidth = 2;
        fontParameter.borderStraight = false;
    }
}
