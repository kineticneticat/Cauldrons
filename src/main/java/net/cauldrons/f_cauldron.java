package net.cauldrons;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;

public class f_cauldron extends Block{
    public static final Block F_CAULDRON = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));
    public static final BooleanProperty CLICKED = BooleanProperty.of("clicked");
    
    public f_cauldron(Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(CLICKED, false));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(CLICKED);
    }
}


