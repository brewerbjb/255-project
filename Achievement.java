/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brewe
 */
public class Achievement {
    private String name;
    private int numClicks;
    private int numTokens;

    public Achievement(String name, int numClicks, int numTokens)
    {
        this.name = name;
        this.numClicks = numClicks;
        this.numTokens = numTokens;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumClicks() {
        return numClicks;
    }

    public void setNumClicks(int numClicks) {
        this.numClicks = numClicks;
    }

    public int getNumTokens() {
        return numTokens;
    }

    public void setNumTokens(int numTokens) {
        this.numTokens = numTokens;
    }
    
    
}
