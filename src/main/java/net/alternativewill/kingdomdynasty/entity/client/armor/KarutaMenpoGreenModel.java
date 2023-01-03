package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.KingdomDynasty;
import net.alternativewill.kingdomdynasty.item.custom.KarutaMenpoGreenItem;
import net.alternativewill.kingdomdynasty.item.custom.KarutaMenpoWhiteItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class KarutaMenpoGreenModel extends AnimatedGeoModel<KarutaMenpoGreenItem> {
    @Override
    public ResourceLocation getModelLocation(KarutaMenpoGreenItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "geo/karuta_menpo.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(KarutaMenpoGreenItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "textures/models/armor/karuta/karuta_armor_green.png") {
        };
    }

    @Override
    public ResourceLocation getAnimationFileLocation(KarutaMenpoGreenItem animatable) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "animations/karuta_armor_animation.json");
    }
}
