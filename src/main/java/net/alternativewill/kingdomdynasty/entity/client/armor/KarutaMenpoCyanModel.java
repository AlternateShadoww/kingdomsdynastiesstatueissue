package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.KingdomDynasty;
import net.alternativewill.kingdomdynasty.item.custom.KarutaMenpoBlueItem;
import net.alternativewill.kingdomdynasty.item.custom.KarutaMenpoCyanItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class KarutaMenpoCyanModel extends AnimatedGeoModel<KarutaMenpoCyanItem> {
    @Override
    public ResourceLocation getModelLocation(KarutaMenpoCyanItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "geo/karuta_menpo.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(KarutaMenpoCyanItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "textures/models/armor/karuta/karuta_armor_cyan.png") {
        };
    }

    @Override
    public ResourceLocation getAnimationFileLocation(KarutaMenpoCyanItem animatable) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "animations/karuta_armor_animation.json");
    }
}
