package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.KingdomDynasty;
import net.alternativewill.kingdomdynasty.item.custom.KarutaArmorCyanItem;
import net.alternativewill.kingdomdynasty.item.custom.KarutaArmorLimeItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class KarutaArmorCyanModel extends AnimatedGeoModel<KarutaArmorCyanItem> {
    @Override
    public ResourceLocation getModelLocation(KarutaArmorCyanItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "geo/karuta_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(KarutaArmorCyanItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "textures/models/armor/karuta/karuta_armor_cyan.png") {
        };
    }

    @Override
    public ResourceLocation getAnimationFileLocation(KarutaArmorCyanItem animatable) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "animations/karuta_armor_animation.json");
    }
}
