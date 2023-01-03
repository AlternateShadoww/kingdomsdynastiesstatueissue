package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.KingdomDynasty;
import net.alternativewill.kingdomdynasty.item.custom.ConicalArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ConicalArmorModel extends AnimatedGeoModel<ConicalArmorItem> {
    @Override
    public ResourceLocation getModelLocation(ConicalArmorItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "geo/conical_hat.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(ConicalArmorItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "textures/models/armor/conical_hat.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(ConicalArmorItem animatable) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "animations/conical_hat_animation.json");
    }
}

