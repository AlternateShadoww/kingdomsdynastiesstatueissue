package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.item.custom.KarutaMenpoBlueItem;
import net.alternativewill.kingdomdynasty.item.custom.KarutaMenpoCyanItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class KarutaMenpoBlueRenderer extends GeoArmorRenderer<KarutaMenpoBlueItem> {
    public KarutaMenpoBlueRenderer() {
        super(new KarutaMenpoBlueModel());

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
