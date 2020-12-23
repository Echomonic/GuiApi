package dev.echo.gui;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

public class Gui implements Listener {

    private Inventory apiInv;


    public Inventory createGui(InventoryHolder owner, int slots, String title, boolean isPaginated){

       apiInv = Bukkit.createInventory(owner,slots, ChatColor.translateAlternateColorCodes('&',title));

       return apiInv;
    }

    public void addItem(ItemStack stack, int i){
        apiInv.setItem(i, stack);
    }

    public void setEntireInventory(ItemStack stack){

        for(int i = 0; i < apiInv.getSize(); i++){
            if(apiInv.getItem(i) == null){
                apiInv.setItem(i, stack);
            }
        }

    }
    public void removeItem(ItemStack stack){

        apiInv.remove(stack);

    }

    public void getSlot(int i){

        apiInv.getItem(i);
    }


}
