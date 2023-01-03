package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.KingdomDynasty;
import net.alternativewill.kingdomdynasty.item.custom.MenpoGoldItem;
import net.alternativewill.kingdomdynasty.item.custom.MenpoItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MenpoGoldModel extends AnimatedGeoModel<MenpoGoldItem> {
    @Override
    public ResourceLocation getModelLocation(MenpoGoldItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "geo/menpo.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(MenpoGoldItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "textures/models/armor/menpo/menpo_gold.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(MenpoGoldItem animatable) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "animations/menpo_animation.json");
    }

}


