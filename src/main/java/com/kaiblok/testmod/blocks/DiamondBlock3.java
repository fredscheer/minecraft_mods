package com.kaiblok.testmod.blocks;

import net.minecraft.block.material.Material;



public class DiamondBlock3 extends BlockBase 
{
	public static final String mName = "diamond_block3";
	public static final Material mMaterial = Material.IRON;

	public DiamondBlock3() 
	{
		super(mName, mMaterial);
		setLightLevel(1.0F);
		setLightOpacity(7);
	}

}
