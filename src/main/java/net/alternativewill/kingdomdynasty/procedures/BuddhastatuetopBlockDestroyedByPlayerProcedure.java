package net.alternativewill.kingdomdynasty.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerDestroyItemEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BuddhastatuetopBlockDestroyedByPlayerProcedure {
	@SubscribeEvent
	public static void onItemDestroyed(PlayerDestroyItemEvent event) {
		execute(event, event.getPlayer().level, event.getPlayer().getX(), event.getPlayer().getY(), event.getPlayer().getZ());
	}

	public static void execute(LevelAccessor world, double x, double y, double z) {
		execute(null, world, x, y, z);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
		{
			BlockPos _pos = new BlockPos(x, y - 1, z);
			Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
			world.destroyBlock(_pos, false);
		}
	}
}
