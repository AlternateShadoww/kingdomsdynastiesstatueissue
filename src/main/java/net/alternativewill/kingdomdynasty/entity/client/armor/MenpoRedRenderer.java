package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.item.custom.MenpoItem;
import net.alternativewill.kingdomdynasty.item.custom.MenpoRedItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class MenpoRedRenderer extends GeoArmorRenderer<MenpoRedItem> {

    public MenpoRedRenderer() {
        super(new MenpoRedModel());

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
