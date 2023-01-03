package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.KingdomDynasty;
import net.alternativewill.kingdomdynasty.item.custom.ConicalMenpoGoldItem;
import net.alternativewill.kingdomdynasty.item.custom.ConicalMenpoItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ConicalMenpoModel extends AnimatedGeoModel<ConicalMenpoItem> {
    @Override
    public ResourceLocation getModelLocation(ConicalMenpoItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "geo/conical_hat_menpo.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(ConicalMenpoItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "textures/models/armor/conical_hat_tamahagane.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(ConicalMenpoItem animatable) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "animations/conical_hat_animation.json");
    }
}

