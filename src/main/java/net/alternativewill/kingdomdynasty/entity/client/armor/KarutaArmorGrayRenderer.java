package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.item.custom.KarutaArmorGrayItem;
import net.alternativewill.kingdomdynasty.item.custom.KarutaArmorGreenItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class KarutaArmorGrayRenderer extends GeoArmorRenderer<KarutaArmorGrayItem> {
    public KarutaArmorGrayRenderer() {
        super(new KarutaArmorGrayModel());

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
