package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.KingdomDynasty;
import net.alternativewill.kingdomdynasty.item.custom.KarutaArmorDiamondItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class KarutaArmorDiamondModel extends AnimatedGeoModel<KarutaArmorDiamondItem> {
    @Override
    public ResourceLocation getModelLocation(KarutaArmorDiamondItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "geo/karuta_armor_diamond_menpo.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(KarutaArmorDiamondItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "textures/models/armor/karuta/karuta_armor_diamond.png") {
        };
    }

    @Override
    public ResourceLocation getAnimationFileLocation(KarutaArmorDiamondItem animatable) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "animations/karuta_armor_animation.json");
    }
}
