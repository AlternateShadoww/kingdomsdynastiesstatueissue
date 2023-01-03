package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.KingdomDynasty;
import net.alternativewill.kingdomdynasty.item.custom.KarutaMenpoLimeItem;
import net.alternativewill.kingdomdynasty.item.custom.KarutaMenpoPurpleItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class KarutaMenpoLimeModel extends AnimatedGeoModel<KarutaMenpoLimeItem> {
    @Override
    public ResourceLocation getModelLocation(KarutaMenpoLimeItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "geo/karuta_menpo.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(KarutaMenpoLimeItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "textures/models/armor/karuta/karuta_armor_lime.png") {
        };
    }

    @Override
    public ResourceLocation getAnimationFileLocation(KarutaMenpoLimeItem animatable) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "animations/karuta_armor_animation.json");
    }
}
