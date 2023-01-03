package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.KingdomDynasty;
import net.alternativewill.kingdomdynasty.item.custom.KarutaMenpoMagentaItem;
import net.alternativewill.kingdomdynasty.item.custom.KarutaMenpoPurpleItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class KarutaMenpoPurpleModel extends AnimatedGeoModel<KarutaMenpoPurpleItem> {
    @Override
    public ResourceLocation getModelLocation(KarutaMenpoPurpleItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "geo/karuta_menpo.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(KarutaMenpoPurpleItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "textures/models/armor/karuta/karuta_armor_purple.png") {
        };
    }

    @Override
    public ResourceLocation getAnimationFileLocation(KarutaMenpoPurpleItem animatable) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "animations/karuta_armor_animation.json");
    }
}
