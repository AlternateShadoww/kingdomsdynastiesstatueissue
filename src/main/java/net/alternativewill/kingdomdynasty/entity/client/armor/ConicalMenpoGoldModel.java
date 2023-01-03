package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.KingdomDynasty;
import net.alternativewill.kingdomdynasty.item.custom.ConicalMenpoBlackItem;
import net.alternativewill.kingdomdynasty.item.custom.ConicalMenpoGoldItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ConicalMenpoGoldModel extends AnimatedGeoModel<ConicalMenpoGoldItem> {
    @Override
    public ResourceLocation getModelLocation(ConicalMenpoGoldItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "geo/conical_hat_menpo.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(ConicalMenpoGoldItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "textures/models/armor/conical_hat_gold.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(ConicalMenpoGoldItem animatable) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "animations/conical_hat_animation.json");
    }
}

