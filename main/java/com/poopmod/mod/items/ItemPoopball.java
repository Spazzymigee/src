package com.poopmod.mod.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import com.poopmod.mod.PoopMod;
import com.poopmod.mod.entity.EntityPoopball;

public class ItemPoopball extends Item
{
    public ItemPoopball(int par1, int i, float f, boolean b)
    {
        super();
        this.maxStackSize = 16;
        this.setCreativeTab(PoopMod.poopytab);
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        if (!par3EntityPlayer.capabilities.isCreativeMode)
        {
            --par1ItemStack.stackSize;
        }

        par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

        if (!par2World.isRemote)
        {
            par2World.spawnEntityInWorld(new EntityPoopball(par2World, par3EntityPlayer));
        }

        return par1ItemStack;
    }
}
