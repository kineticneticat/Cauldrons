package net.cauldrons;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class f_cauldron {
    public static final Block F_CAULDRON = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));
    public class cauldronStates extends Block {
        public static final BooleanProperty FULL = BooleanProperty.of("full");

        @Override
        protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
            stateManager.add(FULL);
        }

        public cauldronStates(Settings settings) {
            super(settings);
            setDefaultState(getStateManager().getDefaultState().with(FULL, false));
        }
        
        @Override
        public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
            player.playSound(SoundEvents.BLOCK_RESPAWN_ANCHOR_CHARGE, 1, 1);
            world.setBlockState(pos, state.with(FULL, true));
            return ActionResult.SUCCESS;
        }
    }
}


