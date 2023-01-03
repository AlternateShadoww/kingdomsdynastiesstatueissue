package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.KingdomDynasty;
import net.alternativewill.kingdomdynasty.item.custom.KarutaArmorBlueItem;
import net.alternativewill.kingdomdynasty.item.custom.KarutaArmorBrownItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class KarutaArmorBrownModel extends AnimatedGeoModel<KarutaArmorBrownItem> {
    @Override
    public ResourceLocation getModelLocation(KarutaArmorBrownItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "geo/karuta_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(KarutaArmorBrownItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "textures/models/armor/karuta/karuta_armor_brown.png") {
        };
    }

    @Override
    public ResourceLocation getAnimationFileLocation(KarutaArmorBrownItem animatable) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "animations/karuta_armor_animation.json");
    }
}
