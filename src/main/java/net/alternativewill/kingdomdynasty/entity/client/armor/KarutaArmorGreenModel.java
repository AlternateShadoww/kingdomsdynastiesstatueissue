package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.KingdomDynasty;
import net.alternativewill.kingdomdynasty.item.custom.KarutaArmorGreenItem;
import net.alternativewill.kingdomdynasty.item.custom.KarutaArmorRedItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class KarutaArmorGreenModel extends AnimatedGeoModel<KarutaArmorGreenItem> {
    @Override
    public ResourceLocation getModelLocation(KarutaArmorGreenItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "geo/karuta_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(KarutaArmorGreenItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "textures/models/armor/karuta/karuta_armor_green.png") {
        };
    }

    @Override
    public ResourceLocation getAnimationFileLocation(KarutaArmorGreenItem animatable) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "animations/karuta_armor_animation.json");
    }
}
