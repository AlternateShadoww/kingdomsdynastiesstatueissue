package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.KingdomDynasty;
import net.alternativewill.kingdomdynasty.item.custom.KarutaMenpoGrayItem;
import net.alternativewill.kingdomdynasty.item.custom.KarutaMenpoGreenItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class KarutaMenpoGrayModel extends AnimatedGeoModel<KarutaMenpoGrayItem> {
    @Override
    public ResourceLocation getModelLocation(KarutaMenpoGrayItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "geo/karuta_menpo.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(KarutaMenpoGrayItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "textures/models/armor/karuta/karuta_armor_gray.png") {
        };
    }

    @Override
    public ResourceLocation getAnimationFileLocation(KarutaMenpoGrayItem animatable) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "animations/karuta_armor_animation.json");
    }
}
