package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.KingdomDynasty;
import net.alternativewill.kingdomdynasty.item.custom.ConicalArmorItem;
import net.alternativewill.kingdomdynasty.item.custom.KimonoItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class KimonoModel extends AnimatedGeoModel<KimonoItem> {
    @Override
    public ResourceLocation getModelLocation(KimonoItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "geo/kimono.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(KimonoItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "textures/models/armor/kimono_texture.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(KimonoItem animatable) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "animations/kimono_animation.json");
    }
}

