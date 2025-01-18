/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexa
 */
import java.awt.Color;
public class YellowColor implements IColoring {

    @Override
    public Color getColor() {
        return Color.YELLOW;
    }

    @Override
    public String colorName() {
        return "YELLOW";
    }
}
