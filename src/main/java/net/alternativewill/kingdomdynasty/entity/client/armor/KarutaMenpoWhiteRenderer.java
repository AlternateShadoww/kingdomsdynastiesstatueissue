package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.item.custom.KarutaMenpoBlackItem;
import net.alternativewill.kingdomdynasty.item.custom.KarutaMenpoWhiteItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class KarutaMenpoWhiteRenderer extends GeoArmorRenderer<KarutaMenpoWhiteItem> {
    public KarutaMenpoWhiteRenderer() {
        super(new KarutaMenpoWhiteModel());

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
