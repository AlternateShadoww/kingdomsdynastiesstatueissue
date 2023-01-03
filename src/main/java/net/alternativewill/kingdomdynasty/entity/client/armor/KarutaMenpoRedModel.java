package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.KingdomDynasty;
import net.alternativewill.kingdomdynasty.item.custom.KarutaMenpoBlackItem;
import net.alternativewill.kingdomdynasty.item.custom.KarutaMenpoRedItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class KarutaMenpoRedModel extends AnimatedGeoModel<KarutaMenpoRedItem> {
    @Override
    public ResourceLocation getModelLocation(KarutaMenpoRedItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "geo/karuta_menpo.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(KarutaMenpoRedItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "textures/models/armor/karuta/karuta_armor_red.png") {
        };
    }

    @Override
    public ResourceLocation getAnimationFileLocation(KarutaMenpoRedItem animatable) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "animations/karuta_armor_animation.json");
    }
}
