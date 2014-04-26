package com.poopmod.mod.handler;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityMooshroom;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

import com.poopmod.mod.items.MainItems;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class PoopDropingHandler {
   public static double rand;
   
   @SubscribeEvent
   public void onEntityDrop(LivingDropsEvent event) {
	   EntityLivingBase entity = event.entityLiving;
	   //cow/sheep/pig
         if ((entity instanceof EntityCow) || (entity instanceof EntitySheep) || (entity instanceof EntityPig) || (entity instanceof EntityMooshroom) || (entity instanceof EntityPigZombie)){
                            rand = Math.random();
                    //1D = 100%, .5D = 50%        
            if (rand < 0.2D) {
            	entity.entityDropItem(new ItemStack(MainItems.ItemManure, 1), 2);
            }
         }
         
         //chicken
         if (event.entityLiving instanceof EntityChicken){
             rand = Math.random();
     //1D = 100%, .5D = 50%        
             if (rand < 0.35D) {
            	 entity.entityDropItem(new ItemStack(MainItems.ItemBirdPoop, 1), 2);
             }
         }
         
         //zombie/witch/villiger
         if ((event.entityLiving instanceof EntityZombie) || (event.entityLiving instanceof EntityWitch) || (event.entityLiving instanceof EntityVillager)){
             rand = Math.random();
     //1D = 100%, .5D = 50%        
             if (rand < 0.2D) {
            	 entity.entityDropItem(new ItemStack(MainItems.PoopItem, 1), 2);
             }
         }
         
         
      }
}