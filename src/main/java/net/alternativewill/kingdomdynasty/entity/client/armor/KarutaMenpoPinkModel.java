package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.KingdomDynasty;
import net.alternativewill.kingdomdynasty.item.custom.KarutaMenpoOrangeItem;
import net.alternativewill.kingdomdynasty.item.custom.KarutaMenpoPinkItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class KarutaMenpoPinkModel extends AnimatedGeoModel<KarutaMenpoPinkItem> {
    @Override
    public ResourceLocation getModelLocation(KarutaMenpoPinkItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "geo/karuta_menpo.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(KarutaMenpoPinkItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "textures/models/armor/karuta/karuta_armor_pink.png") {
        };
    }

    @Override
    public ResourceLocation getAnimationFileLocation(KarutaMenpoPinkItem animatable) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "animations/karuta_armor_animation.json");
    }
}
