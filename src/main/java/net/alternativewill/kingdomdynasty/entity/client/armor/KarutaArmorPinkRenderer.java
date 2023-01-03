package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.item.custom.KarutaArmorPinkItem;
import net.alternativewill.kingdomdynasty.item.custom.KarutaArmorRedItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class KarutaArmorPinkRenderer extends GeoArmorRenderer<KarutaArmorPinkItem> {
    public KarutaArmorPinkRenderer() {
        super(new KarutaArmorPinkModel());

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
