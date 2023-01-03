package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.item.custom.KarutaMenpoLightBlueItem;
import net.alternativewill.kingdomdynasty.item.custom.KarutaMenpoLightGrayItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class KarutaMenpoLightGrayRenderer extends GeoArmorRenderer<KarutaMenpoLightGrayItem> {
    public KarutaMenpoLightGrayRenderer() {
        super(new KarutaMenpoLightGrayModel());

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
