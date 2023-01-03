package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.item.custom.KarutaArmorBlueItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class KarutaArmorBlueRenderer extends GeoArmorRenderer<KarutaArmorBlueItem> {
    public KarutaArmorBlueRenderer() {
        super(new KarutaArmorBlueModel());

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
