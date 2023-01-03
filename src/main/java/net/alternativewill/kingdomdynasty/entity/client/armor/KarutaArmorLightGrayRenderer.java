package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.item.custom.KarutaArmorLightGrayItem;
import net.alternativewill.kingdomdynasty.item.custom.KarutaArmorWhiteItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class KarutaArmorLightGrayRenderer extends GeoArmorRenderer<KarutaArmorLightGrayItem> {
    public KarutaArmorLightGrayRenderer() {
        super(new KarutaArmorLightGrayModel());

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
