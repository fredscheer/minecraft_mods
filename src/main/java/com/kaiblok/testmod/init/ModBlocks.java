package com.kaiblok.testmod.init;

import java.util.ArrayList;
import java.util.List;

import com.kaiblok.testmod.blocks.DiamondBlock2;
import com.kaiblok.testmod.blocks.DiamondBlock3;
import com.kaiblok.testmod.blocks.EmeraldBlock2;
import com.kaiblok.testmod.blocks.EmeraldBlock3;
import com.kaiblok.testmod.blocks.EmeraldBlock4;
import com.kaiblok.testmod.blocks.RubyBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{ 
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block RUBY_BLOCK = new RubyBlock();
	public static final Block EMERALD_BLOCK = new EmeraldBlock2();
	public static final Block EMERALD_BLOCK3 = new EmeraldBlock3();
	public static final Block DIAMOND_BLOCK2 = new DiamondBlock2();
	public static final Block DIAMOND_BLOCK3 = new DiamondBlock3();
	public static final Block EMERALD_BLOCK4 = new EmeraldBlock4();


}
