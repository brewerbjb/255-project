/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brewe
 */
import java.util.ArrayList;



public class Shop {
    private ArrayList<Item> crackers = new ArrayList<>();
    private ArrayList<Item> tools = new ArrayList<>();
    private ArrayList<Item> clickUpgrades = new ArrayList<>();
    private ArrayList<Item> tempUpgrades = new ArrayList<>();
    
    public void addCracker(String name, int price, int revenue)
    {
        Cracker item = new Cracker();
        item.setName(name);
        item.setPrice(price);
        item.setCrackerRevenue(revenue);
        crackers.add(item);
    }
    
    public void addTool(String name, int price, int multiplier)
    {
        Tool item = new Tool();
        item.setName(name);
        item.setPrice(price);
        item.setToolEfficiency(multiplier);
        tools.add(item);
    }
    
    public void addClickUpgrade(String name, int price, int multiplier)
    {
        ClickUpgrade item = new ClickUpgrade();
        item.setName(name);
        item.setPrice(price);
        item.setClickMultiplier(multiplier);
        clickUpgrades.add(item);
    }
    
    public void addAutoClickerUpgrade(String name, int price, int multiplier)
    {
        AutoClickerUpgrade item = new AutoClickerUpgrade();
        item.setName(name);
        item.setPrice (price);
        item.setMultiplier(multiplier);
        tempUpgrades.add(item);
    }

    public ClickUpgrade getClickUpgrade(int clickUpgrade) {
        return (ClickUpgrade)clickUpgrades.get(clickUpgrade);
    }

    public AutoClickerUpgrade getAutoClickerUpgrade(int tempUpgrade) {
        return (AutoClickerUpgrade)tempUpgrades.get(tempUpgrade);
    }
    
    public Cracker getCracker(int cracker)
    {
        return (Cracker)crackers.get(cracker);
    }
    
    public Tool getTool(int tool)
    {
        return (Tool)tools.get(tool);
    }
    
}
