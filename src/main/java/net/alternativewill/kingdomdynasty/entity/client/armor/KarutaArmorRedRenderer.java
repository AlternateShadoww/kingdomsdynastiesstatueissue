package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.item.custom.KarutaArmorRedItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class KarutaArmorRedRenderer extends GeoArmorRenderer<KarutaArmorRedItem> {
    public KarutaArmorRedRenderer() {
        super(new KarutaArmorRedModel());

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
