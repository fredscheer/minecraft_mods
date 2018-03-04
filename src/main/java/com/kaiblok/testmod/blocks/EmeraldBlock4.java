package com.kaiblok.testmod.blocks;

import net.minecraft.block.material.Material;



public class EmeraldBlock4 extends BlockBase 
{
	public static final String mName = "emerald_block4";
	public static final Material mMaterial = Material.IRON;

	public EmeraldBlock4() 
	{
		super(mName, mMaterial);
		setLightLevel(1.0F);
		setLightOpacity(7);
	}

}