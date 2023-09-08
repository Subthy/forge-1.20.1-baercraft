package net.subthy.baersadditions.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.CollisionContext;
import org.jetbrains.annotations.Nullable;

import java.util.stream.Stream;

public class Plushie extends HorizontalDirectionalBlock {
    public Plushie(Properties pProperties) {
        super(pProperties);
    }

    public static final VoxelShape SHAPE_N = Stream.of(
            Block.box(3, 0, 3, 13, 10, 13)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    public static final VoxelShape SHAPE_W = Stream.of(
            Block.box(3, 0, 3, 13, 10, 13)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    public static final VoxelShape SHAPE_S = Stream.of(
            Block.box(3, 0, 3, 13, 10, 13)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    public static final VoxelShape SHAPE_E = Stream.of(
            Block.box(3, 0, 3, 13, 10, 13)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();




    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return getVoxelShape(pState, FACING, SHAPE_N, SHAPE_S, SHAPE_W, SHAPE_E);
    }

    static VoxelShape getVoxelShape(BlockState pState, DirectionProperty facing, VoxelShape shapeN, VoxelShape shapeS, VoxelShape shapeW, VoxelShape shapeE) {
        return switch (pState.getValue(facing)) {
            case SOUTH -> shapeS;
            case WEST -> shapeW;
            case EAST -> shapeE;
            default -> shapeN;
        };
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        return this.defaultBlockState().setValue(FACING, pContext.getHorizontalDirection().getOpposite());
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(FACING);
    }
}
