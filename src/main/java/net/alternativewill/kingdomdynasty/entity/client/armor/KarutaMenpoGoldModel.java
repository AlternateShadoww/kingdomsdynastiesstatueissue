package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.KingdomDynasty;
import net.alternativewill.kingdomdynasty.item.custom.KarutaMenpoGoldItem;
import net.alternativewill.kingdomdynasty.item.custom.KarutaMenpoRedItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class KarutaMenpoGoldModel extends AnimatedGeoModel<KarutaMenpoGoldItem> {
    @Override
    public ResourceLocation getModelLocation(KarutaMenpoGoldItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "geo/karuta_menpo.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(KarutaMenpoGoldItem object) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "textures/models/armor/karuta/karuta_armor_gold.png") {
        };
    }

    @Override
    public ResourceLocation getAnimationFileLocation(KarutaMenpoGoldItem animatable) {
        return new ResourceLocation(KingdomDynasty.MOD_ID, "animations/karuta_armor_animation.json");
    }
}
