package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.KingdomDynasty;
import net.alternativewill.kingdomdynasty.item.custom.KarutaArmorRedItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class KarutaArmorRedModel extends AnimatedGeoModel<KarutaArmorRedItem> {
    @Override
    public ResourceLocation getModelLocation(KarutaArmorRedItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "geo/karuta_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(KarutaArmorRedItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "textures/models/armor/karuta/karuta_armor_red.png") {
        };
    }

    @Override
    public ResourceLocation getAnimationFileLocation(KarutaArmorRedItem animatable) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "animations/karuta_armor_animation.json");
    }
}
