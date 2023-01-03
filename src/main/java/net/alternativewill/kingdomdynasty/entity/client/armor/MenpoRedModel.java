package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.KingdomDynasty;
import net.alternativewill.kingdomdynasty.item.custom.MenpoItem;
import net.alternativewill.kingdomdynasty.item.custom.MenpoRedItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MenpoRedModel extends AnimatedGeoModel<MenpoRedItem> {
    @Override
    public ResourceLocation getModelLocation(MenpoRedItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "geo/menpo.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(MenpoRedItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "textures/models/armor/menpo/menpo_red.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(MenpoRedItem animatable) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "animations/menpo_animation.json");
    }

}


