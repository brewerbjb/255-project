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
    private ArrayList<Item> tempUpgrade = new ArrayList<>();
    
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
        
    }
    
    public Item getCracker(int cracker)
    {
        return crackers.get(cracker);
    }
    
    public Item getTool(int tool)
    {
        return tools.get(tool);
    }
    
}
