package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.KingdomDynasty;
import net.alternativewill.kingdomdynasty.item.custom.KarutaArmorLimeItem;
import net.alternativewill.kingdomdynasty.item.custom.KarutaArmorPinkItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class KarutaArmorLimeModel extends AnimatedGeoModel<KarutaArmorLimeItem> {
    @Override
    public ResourceLocation getModelLocation(KarutaArmorLimeItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "geo/karuta_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(KarutaArmorLimeItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "textures/models/armor/karuta/karuta_armor_lime.png") {
        };
    }

    @Override
    public ResourceLocation getAnimationFileLocation(KarutaArmorLimeItem animatable) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "animations/karuta_armor_animation.json");
    }
}
