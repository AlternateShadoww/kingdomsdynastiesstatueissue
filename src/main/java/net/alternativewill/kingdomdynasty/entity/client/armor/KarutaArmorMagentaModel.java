package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.KingdomDynasty;
import net.alternativewill.kingdomdynasty.item.custom.KarutaArmorMagentaItem;
import net.alternativewill.kingdomdynasty.item.custom.KarutaArmorPinkItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class KarutaArmorMagentaModel extends AnimatedGeoModel<KarutaArmorMagentaItem> {
    @Override
    public ResourceLocation getModelLocation(KarutaArmorMagentaItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "geo/karuta_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(KarutaArmorMagentaItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "textures/models/armor/karuta/karuta_armor_magenta.png") {
        };
    }

    @Override
    public ResourceLocation getAnimationFileLocation(KarutaArmorMagentaItem animatable) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "animations/karuta_armor_animation.json");
    }
}
