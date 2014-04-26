package com.poopmod.mod.blocks;

import com.poopmod.mod.PoopMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

public class BlockDiarrhea extends BlockFluidClassic {

        @SideOnly(Side.CLIENT)
        protected IIcon stillIcon;
        @SideOnly(Side.CLIENT)
        protected IIcon flowingIcon;
        
        public BlockDiarrhea(Fluid fluid, Material material) {
                super(fluid, material);
                setCreativeTab(PoopMod.poopytab);
        }
        
        @Override
        public IIcon getIcon(int side, int meta) {
                return (side == 0 || side == 1)? stillIcon : flowingIcon;
        }
        
        @SideOnly(Side.CLIENT)
        public void registerBlockIcons(IIconRegister p_149651_1_)
        {
                stillIcon = p_149651_1_.registerIcon("poopmod:diarrhea_still");
                flowingIcon = p_149651_1_.registerIcon("poopmod:diarrhea_flowing");
        }
        
        
}