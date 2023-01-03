package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.item.custom.KarutaArmorPinkItem;
import net.alternativewill.kingdomdynasty.item.custom.KarutaArmorPurpleItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class KarutaArmorPurpleRenderer extends GeoArmorRenderer<KarutaArmorPurpleItem> {
    public KarutaArmorPurpleRenderer() {
        super(new KarutaArmorPurpleModel());

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
