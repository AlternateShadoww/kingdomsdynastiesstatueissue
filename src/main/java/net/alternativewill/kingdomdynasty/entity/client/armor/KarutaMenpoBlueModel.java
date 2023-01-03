package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.KingdomDynasty;
import net.alternativewill.kingdomdynasty.item.custom.KarutaMenpoBlueItem;
import net.alternativewill.kingdomdynasty.item.custom.KarutaMenpoGreenItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class KarutaMenpoBlueModel extends AnimatedGeoModel<KarutaMenpoBlueItem> {
    @Override
    public ResourceLocation getModelLocation(KarutaMenpoBlueItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "geo/karuta_menpo.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(KarutaMenpoBlueItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "textures/models/armor/karuta/karuta_armor_blue.png") {
        };
    }

    @Override
    public ResourceLocation getAnimationFileLocation(KarutaMenpoBlueItem animatable) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "animations/karuta_armor_animation.json");
    }
}
