package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.KingdomDynasty;
import net.alternativewill.kingdomdynasty.item.custom.KarutaArmorOrangeItem;
import net.alternativewill.kingdomdynasty.item.custom.KarutaArmorRedItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class KarutaArmorOrangeModel extends AnimatedGeoModel<KarutaArmorOrangeItem> {
    @Override
    public ResourceLocation getModelLocation(KarutaArmorOrangeItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "geo/karuta_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(KarutaArmorOrangeItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "textures/models/armor/karuta/karuta_armor_orange.png") {
        };
    }

    @Override
    public ResourceLocation getAnimationFileLocation(KarutaArmorOrangeItem animatable) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "animations/karuta_armor_animation.json");
    }
}
