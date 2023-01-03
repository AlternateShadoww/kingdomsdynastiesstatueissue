package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.item.custom.KarutaArmorBlueItem;
import net.alternativewill.kingdomdynasty.item.custom.KarutaArmorLightBlueItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class KarutaArmorLightBlueRenderer extends GeoArmorRenderer<KarutaArmorLightBlueItem> {
    public KarutaArmorLightBlueRenderer() {
        super(new KarutaArmorLightBlueModel());

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
