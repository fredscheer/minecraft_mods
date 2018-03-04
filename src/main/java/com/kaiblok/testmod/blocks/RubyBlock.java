package com.kaiblok.testmod.blocks;

import net.minecraft.block.material.Material;



public class RubyBlock extends BlockBase 
{
	public static final String mName = "ruby_block";
	public static final Material mMaterial = Material.IRON;

	public RubyBlock() 
	{
		super(mName, mMaterial);
		setLightLevel(1.0F);
		setLightOpacity(7);
	}

}
