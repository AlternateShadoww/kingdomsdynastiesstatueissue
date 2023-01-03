package net.alternativewill.kingdomdynasty;

import com.mojang.logging.LogUtils;
import net.alternativewill.kingdomdynasty.block.ModBlocks;
import net.alternativewill.kingdomdynasty.block.custom.Buddhastatuetop;
import net.alternativewill.kingdomdynasty.entity.ModEntityTypes;
import net.alternativewill.kingdomdynasty.item.ModItems;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;
import software.bernie.geckolib3.GeckoLib;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(KingdomDynasty.MOD_ID)
public class KingdomDynasty {
    public static final String MOD_ID = "kingdomdynasty";
    private static RegistryObject<Block> Buddhastatue0;
    public static final RegistryObject<Block> BUDDHASTATUE0 = Buddhastatue0;
    private static RegistryObject<Block> Buddhastatuetop;
    public static final RegistryObject<Block> BUDDHASTATUETOP = Buddhastatuetop;

    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();


    public KingdomDynasty() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        eventBus.addListener(this::setup);

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);

        ModEntityTypes.REGISTRY.register(eventBus);


        GeckoLib.initialize();

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BUDDHA_STATUE_1.get(), RenderType.translucentNoCrumbling());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BUDDHASTATUETOP.get(), renderType -> renderType == RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BUDDHASTATUE0.get(), renderType -> renderType == RenderType.translucent());



    }

}