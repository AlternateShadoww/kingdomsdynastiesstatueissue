package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.KingdomDynasty;
import net.alternativewill.kingdomdynasty.item.custom.MenpoBlackItem;
import net.alternativewill.kingdomdynasty.item.custom.MenpoGoldItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MenpoBlackModel extends AnimatedGeoModel<MenpoBlackItem> {
    @Override
    public ResourceLocation getModelLocation(MenpoBlackItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "geo/menpo.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(MenpoBlackItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "textures/models/armor/menpo/menpo_black.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(MenpoBlackItem animatable) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "animations/menpo_animation.json");
    }

}


