
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brewe
 */
public class Inventory {
    private int currentTool = 0;
    private int currentCracker = 0;
    private ArrayList<Achievement> achievements = new ArrayList<>();
    private int currentAchievement = 0;

    public Inventory()
    {
        setAchievements();
    }
    
    private void setAchievements() {
        ArrayList<Achievement> achievements;
        achievements = new ArrayList<>();
        
        Achievement achievementOne = new Achievement("level 1", 10, 1);
        achievements.add(achievementOne);
        
        Achievement achievementTwo = new Achievement("Level 2", 50, 5);
        achievements.add(achievementTwo);
        
        Achievement achievementThree = new Achievement("Level 3", 100, 10);
        achievements.add(achievementThree);
        
        this.achievements = achievements;
    }
    
    public void setAchievements(ArrayList<Achievement> achievements)
    {
        this.achievements = achievements;
    }
    
    public Achievement getAchievement()
    {
        return achievements.get(currentAchievement);
    }
    
    public void setCurrentAchievement(int currentAchievement)
    {
        this.currentAchievement = currentAchievement;
    }
    
    public void nextAchievement()
    {
        currentAchievement++;
    }
    
    public int getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(int currentTool) {
        this.currentTool = currentTool;
    }

    public int getCurrentCracker() {
        return currentCracker;
    }

    public void setCurrentCracker(int currentCracker) {
        this.currentCracker = currentCracker;
    }
    
    public void nextCracker()
    {
        currentCracker++;
    }
    
    public void nextTool()
    {
        currentTool++;
    }
    
}
