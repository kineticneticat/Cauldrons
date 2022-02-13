package net.cauldrons.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class endsteel_block extends Block{
    public endsteel_block(Settings settings) {
        super(settings);
    }

    public static final Block ENDSTEEL_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));

}