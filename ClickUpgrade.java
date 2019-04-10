/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brewe
 */
public class ClickUpgrade extends Item {
    private int clickMultiplier;
    
    public void setClickMultiplier(int clickMultiplier)
    {
        this.clickMultiplier = clickMultiplier;
    }
    
    public int getClickMultiplier()
    {
        return clickMultiplier;
    }
}
