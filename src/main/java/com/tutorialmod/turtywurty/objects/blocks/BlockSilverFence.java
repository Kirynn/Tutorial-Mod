package com.tutorialmod.turtywurty.objects.blocks;

import com.tutorialmod.turtywurty.TutorialMod;
import com.tutorialmod.turtywurty.init.BlockInit;
import com.tutorialmod.turtywurty.init.ItemInit;

import net.minecraft.block.BlockFence;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class BlockSilverFence extends BlockFence
{
	public BlockSilverFence(String name) 
	{
		super(Material.IRON, MapColor.SNOW);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(TutorialMod.TUTORIALMODTAB);
		setSoundType(SoundType.METAL);
		setHardness(8.0f);
		setResistance(25.0f);
		setHarvestLevel("pickaxe", 1);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
}
