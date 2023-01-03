package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.item.custom.MenpoGoldItem;
import net.alternativewill.kingdomdynasty.item.custom.MenpoItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class MenpoGoldRenderer extends GeoArmorRenderer<MenpoGoldItem> {

    public MenpoGoldRenderer() {
        super(new MenpoGoldModel());

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
