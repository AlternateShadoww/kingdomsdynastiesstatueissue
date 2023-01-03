package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.KingdomDynasty;
import net.alternativewill.kingdomdynasty.item.custom.KarutaArmorMagentaItem;
import net.alternativewill.kingdomdynasty.item.custom.KarutaArmorWhiteItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class KarutaArmorWhiteModel extends AnimatedGeoModel<KarutaArmorWhiteItem> {
    @Override
    public ResourceLocation getModelLocation(KarutaArmorWhiteItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "geo/karuta_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(KarutaArmorWhiteItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "textures/models/armor/karuta/karuta_armor_white.png") {
        };
    }

    @Override
    public ResourceLocation getAnimationFileLocation(KarutaArmorWhiteItem animatable) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "animations/karuta_armor_animation.json");
    }
}
