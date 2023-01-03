package net.alternativewill.kingdomdynasty.entity;

import net.alternativewill.kingdomdynasty.KingdomDynasty;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.resources.ResourceLocation;

public class SamuraiWarriorRenderer extends HumanoidMobRenderer<SamuraiWarriorEntity, HumanoidModel<SamuraiWarriorEntity>> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(KingdomDynasty.MOD_ID, "textures/entity/samurai/samurai_blue.png");

    public SamuraiWarriorRenderer(EntityRendererProvider.Context context) {
        super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

        this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)),
                new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));


    }

    @Override
    public ResourceLocation getTextureLocation(SamuraiWarriorEntity entity) {
        return new ResourceLocation("kingdomdynasty:textures/entity/samurai/samurai_blue.png");

    }
}
