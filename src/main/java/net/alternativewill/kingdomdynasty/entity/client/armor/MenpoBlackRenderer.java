package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.item.custom.MenpoBlackItem;
import net.alternativewill.kingdomdynasty.item.custom.MenpoItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class MenpoBlackRenderer extends GeoArmorRenderer<MenpoBlackItem> {

    public MenpoBlackRenderer() {
        super(new MenpoBlackModel());

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
