package com.example.simplemod.init.items;

import com.example.simplemod.Main;
import com.example.simplemod.init.ModItems;
import com.example.simplemod.util.Model;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements Model {

    public ItemBase(String name){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }

}
