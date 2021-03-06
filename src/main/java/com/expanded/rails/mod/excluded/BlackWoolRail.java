package com.expanded.rails.mod.rails;

import com.expanded.rails.mod.ERMBase;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRail;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraftforge.common.MinecraftForge;

public class BlackWoolRail extends AllRails
{
    public IIcon theIcon;

    public BlackWoolRail(int par1)
    {
    	super(par1);
        setHardness(0.7F);
        setStepSound(Block.soundTypeCloth);
        setBlockTextureName("expandedrails:BlackWoolRail");
        // TODO Auto-generated constructor stub
    }

    public IIcon getIcon(int par1, int par2)
    {
        return par2 >= 6 ? this.theIcon : this.blockIcon;
    }

    public void registerIcons(IIconRegister par1IconRegister)
    {
        super.registerBlockIcons(par1IconRegister);
        this.theIcon = par1IconRegister.registerIcon("expandedrails:BlackWoolRail_Turn");
    }

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
    }
}