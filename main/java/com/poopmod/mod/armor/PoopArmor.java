package com.poopmod.mod.armor;

import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import com.poopmod.mod.items.MainItems;

		public class PoopArmor extends ItemArmor {
			public PoopArmor(int par1, ArmorMaterial par2EnumArmorMaterial,int par3, int par4) {
				super(par2EnumArmorMaterial, par3, par4);
			}

			
	        public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	        {
	        	
	        		//poop
	                if(stack.getItem() == MainItems.helmetPoop || stack.getItem() == MainItems.platePoop || stack.getItem() == MainItems.bootsPoop)
	                {
	                        return "poopmod:textures/armor/POOP_layer_1.png";//1
	                }
	                
	                if(stack.getItem() == MainItems.legsPoop)
	                {
	                        return "poopmod:textures/armor/POOP_layer_2.png";//2
	                }
	               
	                //bird
	                if(stack.getItem() == MainItems.helmetBirdPoop || stack.getItem() == MainItems.plateBirdPoop || stack.getItem() == MainItems.bootsBirdPoop)
	                {
	                        return "poopmod:textures/armor/BIRDPOOP_layer_1.png";//1
	                }
	                
	                if(stack.getItem() == MainItems.legsBirdPoop)
	                {
	                        return "poopmod:textures/armor/BIRDPOOP_layer_2.png";//2
	                }
	                
	                //cow
	                if(stack.getItem() == MainItems.helmetManure || stack.getItem() == MainItems.plateManure || stack.getItem() == MainItems.bootsManure)
	                {
	                        return "poopmod:textures/armor/COWPOOP_layer_1.png";//1
	                }
	                
	                if(stack.getItem() == MainItems.legsManure)
	                {
	                        return "poopmod:textures/armor/COWPOOP_layer_2.png";//2
	                }
	                

	                //ultimate
	                
	                if(stack.getItem() == MainItems.helmetUltimate || stack.getItem() == MainItems.plateUltimate || stack.getItem() == MainItems.bootsUltimate)
	                {
	                        return "poopmod:textures/armor/ULTIMATEPOOP_layer_1.png";//1
	                }
	                
	                if(stack.getItem() == MainItems.legsUltimate)
	                {
	                        return "poopmod:textures/armor/ULTIMATEPOOP_layer_2.png";//2
	                }
	                
	                
	                //elseifnull
	                return "poopmod:textures/armor/POOP_layer_1.png";//1
	        }
	        
	        @SuppressWarnings({ "rawtypes", "unchecked" })
			@Override      
	        public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	        {
	            par3List.add("Not the best decision...");
	        }
}