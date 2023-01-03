package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.KingdomDynasty;
import net.alternativewill.kingdomdynasty.item.custom.KarutaMenpoGrayItem;
import net.alternativewill.kingdomdynasty.item.custom.KarutaMenpoLightGrayItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class KarutaMenpoLightGrayModel extends AnimatedGeoModel<KarutaMenpoLightGrayItem> {
    @Override
    public ResourceLocation getModelLocation(KarutaMenpoLightGrayItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "geo/karuta_menpo.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(KarutaMenpoLightGrayItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "textures/models/armor/karuta/karuta_armor_light_gray.png") {
        };
    }

    @Override
    public ResourceLocation getAnimationFileLocation(KarutaMenpoLightGrayItem animatable) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "animations/karuta_armor_animation.json");
    }
}
