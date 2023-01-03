package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.KingdomDynasty;
import net.alternativewill.kingdomdynasty.item.custom.KarutaMenpoGreenItem;
import net.alternativewill.kingdomdynasty.item.custom.KarutaMenpoLightBlueItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class KarutaMenpoLightBlueModel extends AnimatedGeoModel<KarutaMenpoLightBlueItem> {
    @Override
    public ResourceLocation getModelLocation(KarutaMenpoLightBlueItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "geo/karuta_menpo.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(KarutaMenpoLightBlueItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "textures/models/armor/karuta/karuta_armor_light_blue.png") {
        };
    }

    @Override
    public ResourceLocation getAnimationFileLocation(KarutaMenpoLightBlueItem animatable) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "animations/karuta_armor_animation.json");
    }
}
