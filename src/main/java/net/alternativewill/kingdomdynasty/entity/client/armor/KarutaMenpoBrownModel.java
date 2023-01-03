package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.KingdomDynasty;
import net.alternativewill.kingdomdynasty.item.custom.KarutaMenpoBrownItem;
import net.alternativewill.kingdomdynasty.item.custom.KarutaMenpoPinkItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class KarutaMenpoBrownModel extends AnimatedGeoModel<KarutaMenpoBrownItem> {
    @Override
    public ResourceLocation getModelLocation(KarutaMenpoBrownItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "geo/karuta_menpo.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(KarutaMenpoBrownItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "textures/models/armor/karuta/karuta_armor_brown.png") {
        };
    }

    @Override
    public ResourceLocation getAnimationFileLocation(KarutaMenpoBrownItem animatable) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "animations/karuta_armor_animation.json");
    }
}
