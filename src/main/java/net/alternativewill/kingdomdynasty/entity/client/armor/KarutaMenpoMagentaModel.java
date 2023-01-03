package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.KingdomDynasty;
import net.alternativewill.kingdomdynasty.item.custom.KarutaMenpoBrownItem;
import net.alternativewill.kingdomdynasty.item.custom.KarutaMenpoMagentaItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class KarutaMenpoMagentaModel extends AnimatedGeoModel<KarutaMenpoMagentaItem> {
    @Override
    public ResourceLocation getModelLocation(KarutaMenpoMagentaItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "geo/karuta_menpo.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(KarutaMenpoMagentaItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "textures/models/armor/karuta/karuta_armor_magenta.png") {
        };
    }

    @Override
    public ResourceLocation getAnimationFileLocation(KarutaMenpoMagentaItem animatable) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "animations/karuta_armor_animation.json");
    }
}
