package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.item.custom.KarutaMenpoCyanItem;
import net.alternativewill.kingdomdynasty.item.custom.KarutaMenpoWhiteItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class KarutaMenpoCyanRenderer extends GeoArmorRenderer<KarutaMenpoCyanItem> {
    public KarutaMenpoCyanRenderer() {
        super(new KarutaMenpoCyanModel());

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
