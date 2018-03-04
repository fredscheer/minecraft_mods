package com.kaiblok.testmod.init;

import java.util.ArrayList;
import java.util.List;

import com.kaiblok.testmod.items.ItemBase;
import com.kaiblok.testmod.items.tools.ToolSword;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	// Materials
	public static final ToolMaterial TOOL_RUBY = EnumHelper.addToolMaterial("tool_ruby", 3, 1561, 8.0F, 3.0F, 10);
	public static final ToolMaterial TOOL_EMERALD = EnumHelper.addToolMaterial("tool_emerald", 3, 1561, 8.0F, 3.0F, 10);
	
	// Items
	public static final Item RUBY = new ItemBase("ruby");
	
	// Tools
	public static final Item SWORD_RUBY = new ToolSword("sword_ruby", TOOL_RUBY);
	public static final Item SWORD_EMERALD = new ToolSword("sword_emerald", TOOL_EMERALD);

}