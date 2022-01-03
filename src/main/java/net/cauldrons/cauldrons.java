package net.cauldrons;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class cauldrons implements ModInitializer {

    // endsteel stuff
    public static final Item ENDSTEEL_INGOT = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
    public static final Block ENDSTEEL_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));
    // bases
    public static final Item GOLD_BASE = new Item(new FabricItemSettings().group(ItemGroup.BREWING));
    public static final Item IRON_BASE = new Item(new FabricItemSettings().group(ItemGroup.BREWING));
    public static final Item DIAMOND_BASE = new Item(new FabricItemSettings().group(ItemGroup.BREWING));
    public static final Item NETHERITE_BASE = new Item(new FabricItemSettings().group(ItemGroup.BREWING));
    // cauldron
    public static final Block F_CAULDRON = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));

    @Override
    public void onInitialize() {
        // bases
        Registry.register(Registry.ITEM, new Identifier("cauldrons", "gold-base"), GOLD_BASE);
        Registry.register(Registry.ITEM, new Identifier("cauldrons", "iron-base"), IRON_BASE);
        Registry.register(Registry.ITEM, new Identifier("cauldrons", "diamond-base"), DIAMOND_BASE);
        Registry.register(Registry.ITEM, new Identifier("cauldrons", "netherite-base"), NETHERITE_BASE);
        // endsteel stuff
        Registry.register(Registry.ITEM, new Identifier("cauldrons", "endsteel-ingot"), ENDSTEEL_INGOT);
        Registry.register(Registry.BLOCK, new Identifier("cauldrons", "endsteel-block"), ENDSTEEL_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("cauldrons", "endsteel-block"), new BlockItem(ENDSTEEL_BLOCK, new FabricItemSettings().group(ItemGroup.MISC)));
        // cauldron
        Registry.register(Registry.BLOCK, new Identifier("cauldrons", "f-cauldron"), F_CAULDRON);
        Registry.register(Registry.ITEM, new Identifier("cauldrons", "f-cauldron"), new BlockItem(F_CAULDRON, new FabricItemSettings().group(ItemGroup.MISC)));
    } 
}

