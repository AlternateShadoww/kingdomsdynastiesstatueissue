package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.KingdomDynasty;
import net.alternativewill.kingdomdynasty.item.custom.KarutaArmorBlackItem;
import net.alternativewill.kingdomdynasty.item.custom.KarutaMenpoBlackItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class KarutaMenpoBlackModel extends AnimatedGeoModel<KarutaMenpoBlackItem> {
    @Override
    public ResourceLocation getModelLocation(KarutaMenpoBlackItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "geo/karuta_menpo.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(KarutaMenpoBlackItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "textures/models/armor/karuta/karuta_armor_black.png") {
        };
    }

    @Override
    public ResourceLocation getAnimationFileLocation(KarutaMenpoBlackItem animatable) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "animations/karuta_armor_animation.json");
    }
}
