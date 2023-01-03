package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.item.custom.KarutaMenpoBlackItem;
import net.alternativewill.kingdomdynasty.item.custom.KarutaMenpoRedItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class KarutaMenpoRedRenderer extends GeoArmorRenderer<KarutaMenpoRedItem> {
    public KarutaMenpoRedRenderer() {
        super(new KarutaMenpoRedModel());

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
