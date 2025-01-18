
import java.awt.Color;

/*
    Alexandra Elyze Villar
    FOPI01 - FA2.1: LE#3
*/


/**
 *
 * @author Antonette
 */
public class RedColor implements IColoring{

    @Override
    public Color getColor() {
        return Color.RED;
    }

    @Override
    public String colorName() {
        return "RED";
    }
    
}
