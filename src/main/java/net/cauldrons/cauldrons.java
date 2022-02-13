package net.cauldrons;
import net.cauldrons.items.*;
import net.cauldrons.blocks.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;

import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class cauldrons implements ModInitializer {
    @Override
    public void onInitialize() {
        // bases
        Registry.register(Registry.ITEM, new Identifier("cauldrons", "gold_base"), gold_base.GOLD_BASE);
        Registry.register(Registry.ITEM, new Identifier("cauldrons", "iron_base"), iron_base.IRON_BASE);
        Registry.register(Registry.ITEM, new Identifier("cauldrons", "diamond_base"), diamond_base.DIAMOND_BASE);
        Registry.register(Registry.ITEM, new Identifier("cauldrons", "netherite_base"), netherite_base.NETHERITE_BASE);
        // endsteel stuff
        Registry.register(Registry.ITEM, new Identifier("cauldrons", "endsteel_ingot"), endsteel_ingot.ENDSTEEL_INGOT);
        Registry.register(Registry.BLOCK, new Identifier("cauldrons", "endsteel_block"), endsteel_block.ENDSTEEL_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("cauldrons", "endsteel_block"), new BlockItem(endsteel_block.ENDSTEEL_BLOCK, new FabricItemSettings().group(ItemGroup.MISC)));
        // cauldron
        Registry.register(Registry.BLOCK, new Identifier("cauldrons", "fancy_cauldron"), fancy_cauldron.F_CAULDRON);
        Registry.register(Registry.ITEM, new Identifier("cauldrons", "fancy_cauldron"), new BlockItem(fancy_cauldron.F_CAULDRON, new FabricItemSettings().group(ItemGroup.MISC)));
    } 
}

