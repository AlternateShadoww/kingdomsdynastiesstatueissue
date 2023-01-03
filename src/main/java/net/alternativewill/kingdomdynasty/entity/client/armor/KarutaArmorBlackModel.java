package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.KingdomDynasty;
import net.alternativewill.kingdomdynasty.item.custom.KarutaArmorBlackItem;
import net.alternativewill.kingdomdynasty.item.custom.KarutaArmorBlueItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class KarutaArmorBlackModel extends AnimatedGeoModel<KarutaArmorBlackItem> {
    @Override
    public ResourceLocation getModelLocation(KarutaArmorBlackItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "geo/karuta_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(KarutaArmorBlackItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "textures/models/armor/karuta/karuta_armor_black.png") {
        };
    }

    @Override
    public ResourceLocation getAnimationFileLocation(KarutaArmorBlackItem animatable) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "animations/karuta_armor_animation.json");
    }
}
