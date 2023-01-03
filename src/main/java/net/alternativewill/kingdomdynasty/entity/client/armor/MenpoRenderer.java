package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.item.custom.MenpoItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class MenpoRenderer extends GeoArmorRenderer<MenpoItem> {

    public MenpoRenderer() {
        super(new MenpoModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorRightLeg";
        this.leftLegBone = "armorLeftLeg";
        this.rightBootBone = "armorRightBoot";
        this.leftBootBone = "armorLeftBoot";
    }
}
