package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.KingdomDynasty;
import net.alternativewill.kingdomdynasty.item.custom.KarutaMenpoLightGrayItem;
import net.alternativewill.kingdomdynasty.item.custom.KarutaMenpoOrangeItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class KarutaMenpoOrangeModel extends AnimatedGeoModel<KarutaMenpoOrangeItem> {
    @Override
    public ResourceLocation getModelLocation(KarutaMenpoOrangeItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "geo/karuta_menpo.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(KarutaMenpoOrangeItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "textures/models/armor/karuta/karuta_armor_orange.png") {
        };
    }

    @Override
    public ResourceLocation getAnimationFileLocation(KarutaMenpoOrangeItem animatable) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "animations/karuta_armor_animation.json");
    }
}
