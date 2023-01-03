package net.alternativewill.kingdomdynasty.event;

import net.alternativewill.kingdomdynasty.KingdomDynasty;
import net.alternativewill.kingdomdynasty.entity.ModEntityTypes;
import net.alternativewill.kingdomdynasty.entity.SamuraiRenderer;
import net.alternativewill.kingdomdynasty.entity.SamuraiWarriorRenderer;
import net.alternativewill.kingdomdynasty.entity.client.armor.*;
import net.alternativewill.kingdomdynasty.item.custom.*;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

@Mod.EventBusSubscriber(modid = KingdomDynasty.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventClientBusEvents {

    @SubscribeEvent
    public static void registerArmorRenderers(final EntityRenderersEvent.AddLayers event) {
        GeoArmorRenderer.registerArmorRenderer(KarutaArmorItem.class, new KarutaArmorRenderer());
        GeoArmorRenderer.registerArmorRenderer(KarutaArmorRedItem.class, new KarutaArmorRedRenderer());
        GeoArmorRenderer.registerArmorRenderer(KarutaArmorBlueItem.class, new KarutaArmorBlueRenderer());
        GeoArmorRenderer.registerArmorRenderer(KarutaArmorBlackItem.class, new KarutaArmorBlackRenderer());
        GeoArmorRenderer.registerArmorRenderer(KarutaArmorGreenItem.class, new KarutaArmorGreenRenderer());
        GeoArmorRenderer.registerArmorRenderer(KarutaArmorBrownItem.class, new KarutaArmorBrownRenderer());
        GeoArmorRenderer.registerArmorRenderer(KarutaArmorGrayItem.class, new KarutaArmorGrayRenderer());
        GeoArmorRenderer.registerArmorRenderer(KarutaArmorGoldItem.class, new KarutaArmorGoldRenderer());
        GeoArmorRenderer.registerArmorRenderer(KarutaArmorPinkItem.class, new KarutaArmorPinkRenderer());
        GeoArmorRenderer.registerArmorRenderer(KarutaArmorPurpleItem.class, new KarutaArmorPurpleRenderer());
        GeoArmorRenderer.registerArmorRenderer(KarutaArmorLimeItem.class, new KarutaArmorLimeRenderer());
        GeoArmorRenderer.registerArmorRenderer(KarutaArmorLightBlueItem.class, new KarutaArmorLightBlueRenderer());
        GeoArmorRenderer.registerArmorRenderer(KarutaArmorOrangeItem.class, new KarutaArmorOrangeRenderer());
        GeoArmorRenderer.registerArmorRenderer(KarutaArmorMagentaItem.class, new KarutaArmorMagentaRenderer());
        GeoArmorRenderer.registerArmorRenderer(KarutaArmorWhiteItem.class, new KarutaArmorWhiteRenderer());
        GeoArmorRenderer.registerArmorRenderer(KarutaArmorLightGrayItem.class, new KarutaArmorLightGrayRenderer());
        GeoArmorRenderer.registerArmorRenderer(KarutaArmorCyanItem.class, new KarutaArmorCyanRenderer());
        GeoArmorRenderer.registerArmorRenderer(KarutaArmorDiamondItem.class, new KarutaArmorDiamondRenderer());
        GeoArmorRenderer.registerArmorRenderer(ConicalArmorItem.class, new ConicalArmorRenderer());
        GeoArmorRenderer.registerArmorRenderer(ConicalArmorBlackItem.class, new ConicalArmorBlackRenderer());
        GeoArmorRenderer.registerArmorRenderer(MenpoItem.class, new MenpoRenderer());
        GeoArmorRenderer.registerArmorRenderer(MenpoBlackItem.class, new MenpoBlackRenderer());
        GeoArmorRenderer.registerArmorRenderer(MenpoRedItem.class, new MenpoRedRenderer());
        GeoArmorRenderer.registerArmorRenderer(MenpoGoldItem.class, new MenpoGoldRenderer());
        GeoArmorRenderer.registerArmorRenderer(KimonoItem.class, new KimonoRenderer());
        GeoArmorRenderer.registerArmorRenderer(ConicalMenpoRedItem.class, new ConicalMenpoRedRenderer());
        GeoArmorRenderer.registerArmorRenderer(ConicalMenpoGoldItem.class, new ConicalMenpoGoldRenderer());
        GeoArmorRenderer.registerArmorRenderer(ConicalMenpoBlackItem.class, new ConicalMenpoBlackRenderer());
        GeoArmorRenderer.registerArmorRenderer(ConicalMenpoItem.class, new ConicalMenpoRenderer());
        GeoArmorRenderer.registerArmorRenderer(KarutaMenpoBlackItem.class, new KarutaMenpoBlackRenderer());
        GeoArmorRenderer.registerArmorRenderer(KarutaMenpoRedItem.class, new KarutaMenpoRedRenderer());
        GeoArmorRenderer.registerArmorRenderer(KarutaMenpoGoldItem.class, new KarutaMenpoGoldRenderer());
        GeoArmorRenderer.registerArmorRenderer(KarutaMenpoBlueItem.class, new KarutaMenpoBlueRenderer());
        GeoArmorRenderer.registerArmorRenderer(KarutaMenpoLightBlueItem.class, new KarutaMenpoLightBlueRenderer());
        GeoArmorRenderer.registerArmorRenderer(KarutaMenpoCyanItem.class, new KarutaMenpoCyanRenderer());
        GeoArmorRenderer.registerArmorRenderer(KarutaMenpoGrayItem.class, new KarutaMenpoGrayRenderer());
        GeoArmorRenderer.registerArmorRenderer(KarutaMenpoLightGrayItem.class, new KarutaMenpoLightGrayRenderer());
        GeoArmorRenderer.registerArmorRenderer(KarutaMenpoWhiteItem.class, new KarutaMenpoWhiteRenderer());
        GeoArmorRenderer.registerArmorRenderer(KarutaMenpoLimeItem.class, new KarutaMenpoLimeRenderer());
        GeoArmorRenderer.registerArmorRenderer(KarutaMenpoGreenItem.class, new KarutaMenpoGreenRenderer());
        GeoArmorRenderer.registerArmorRenderer(KarutaMenpoBrownItem.class, new KarutaMenpoBrownRenderer());
        GeoArmorRenderer.registerArmorRenderer(KarutaMenpoOrangeItem.class, new KarutaMenpoOrangeRenderer());
        GeoArmorRenderer.registerArmorRenderer(KarutaMenpoPinkItem.class, new KarutaMenpoPinkRenderer());
        GeoArmorRenderer.registerArmorRenderer(KarutaMenpoMagentaItem.class, new KarutaMenpoMagentaRenderer());
        GeoArmorRenderer.registerArmorRenderer(KarutaMenpoPurpleItem.class, new KarutaMenpoPurpleRenderer());
        GeoArmorRenderer.registerArmorRenderer(KarutaMenpoItem.class, new KarutaMenpoRenderer());



            }

    public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntityTypes.SAMURAIWARRIOR.get(), SamuraiWarriorRenderer::new);
        event.registerEntityRenderer(ModEntityTypes.SAMURAI.get(), SamuraiRenderer::new);
    }
}
