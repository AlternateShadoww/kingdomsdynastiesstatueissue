package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.KingdomDynasty;
import net.alternativewill.kingdomdynasty.item.custom.KarutaArmorGoldItem;
import net.alternativewill.kingdomdynasty.item.custom.KarutaArmorGrayItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class KarutaArmorGoldModel extends AnimatedGeoModel<KarutaArmorGoldItem> {
    @Override
    public ResourceLocation getModelLocation(KarutaArmorGoldItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "geo/karuta_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(KarutaArmorGoldItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "textures/models/armor/karuta/karuta_armor_gold.png") {
        };
    }

    @Override
    public ResourceLocation getAnimationFileLocation(KarutaArmorGoldItem animatable) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "animations/karuta_armor_animation.json");
    }
}
