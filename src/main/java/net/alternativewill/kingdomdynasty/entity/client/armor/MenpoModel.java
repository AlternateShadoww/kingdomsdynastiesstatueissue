package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.KingdomDynasty;
import net.alternativewill.kingdomdynasty.item.custom.MenpoItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MenpoModel extends AnimatedGeoModel<MenpoItem> {
    @Override
    public ResourceLocation getModelLocation(MenpoItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "geo/menpo.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(MenpoItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "textures/models/armor/menpo/menpo_texture.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(MenpoItem animatable) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "animations/menpo_animation.json");
    }

}


