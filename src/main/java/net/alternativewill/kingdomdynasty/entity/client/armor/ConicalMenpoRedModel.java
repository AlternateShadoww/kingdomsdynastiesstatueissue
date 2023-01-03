package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.KingdomDynasty;
import net.alternativewill.kingdomdynasty.item.custom.ConicalArmorItem;
import net.alternativewill.kingdomdynasty.item.custom.ConicalMenpoRedItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ConicalMenpoRedModel extends AnimatedGeoModel<ConicalMenpoRedItem> {
    @Override
    public ResourceLocation getModelLocation(ConicalMenpoRedItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "geo/conical_hat_menpo.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(ConicalMenpoRedItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "textures/models/armor/conical_hat_red.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(ConicalMenpoRedItem animatable) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "animations/conical_hat_animation.json");
    }
}

