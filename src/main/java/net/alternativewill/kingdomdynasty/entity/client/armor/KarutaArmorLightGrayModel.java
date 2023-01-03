package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.KingdomDynasty;
import net.alternativewill.kingdomdynasty.item.custom.KarutaArmorLightGrayItem;
import net.alternativewill.kingdomdynasty.item.custom.KarutaArmorWhiteItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class KarutaArmorLightGrayModel extends AnimatedGeoModel<KarutaArmorLightGrayItem> {
    @Override
    public ResourceLocation getModelLocation(KarutaArmorLightGrayItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "geo/karuta_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(KarutaArmorLightGrayItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "textures/models/armor/karuta/karuta_armor_light_gray.png") {
        };
    }

    @Override
    public ResourceLocation getAnimationFileLocation(KarutaArmorLightGrayItem animatable) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "animations/karuta_armor_animation.json");
    }
}
