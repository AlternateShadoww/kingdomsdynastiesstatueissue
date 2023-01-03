package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.KingdomDynasty;
import net.alternativewill.kingdomdynasty.item.custom.KarutaArmorGrayItem;
import net.alternativewill.kingdomdynasty.item.custom.KarutaArmorGreenItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class KarutaArmorGrayModel extends AnimatedGeoModel<KarutaArmorGrayItem> {
    @Override
    public ResourceLocation getModelLocation(KarutaArmorGrayItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "geo/karuta_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(KarutaArmorGrayItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "textures/models/armor/karuta/karuta_armor_gray.png") {
        };
    }

    @Override
    public ResourceLocation getAnimationFileLocation(KarutaArmorGrayItem animatable) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "animations/karuta_armor_animation.json");
    }
}
