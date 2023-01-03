package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.KingdomDynasty;
import net.alternativewill.kingdomdynasty.item.custom.ConicalMenpoBlackItem;
import net.alternativewill.kingdomdynasty.item.custom.ConicalMenpoRedItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ConicalMenpoBlackModel extends AnimatedGeoModel<ConicalMenpoBlackItem> {
    @Override
    public ResourceLocation getModelLocation(ConicalMenpoBlackItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "geo/conical_hat_menpo.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(ConicalMenpoBlackItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "textures/models/armor/conical_hat_black.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(ConicalMenpoBlackItem animatable) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "animations/conical_hat_animation.json");
    }
}

