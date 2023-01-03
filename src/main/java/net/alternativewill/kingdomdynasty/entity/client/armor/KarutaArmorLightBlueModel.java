package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.KingdomDynasty;
import net.alternativewill.kingdomdynasty.item.custom.KarutaArmorBlueItem;
import net.alternativewill.kingdomdynasty.item.custom.KarutaArmorLightBlueItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class KarutaArmorLightBlueModel extends AnimatedGeoModel<KarutaArmorLightBlueItem> {
    @Override
    public ResourceLocation getModelLocation(KarutaArmorLightBlueItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "geo/karuta_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(KarutaArmorLightBlueItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "textures/models/armor/karuta/karuta_armor_light_blue.png") {
        };
    }

    @Override
    public ResourceLocation getAnimationFileLocation(KarutaArmorLightBlueItem animatable) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "animations/karuta_armor_animation.json");
    }
}
