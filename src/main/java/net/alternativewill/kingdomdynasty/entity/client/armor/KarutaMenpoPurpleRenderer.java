package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.item.custom.KarutaMenpoOrangeItem;
import net.alternativewill.kingdomdynasty.item.custom.KarutaMenpoPurpleItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class KarutaMenpoPurpleRenderer extends GeoArmorRenderer<KarutaMenpoPurpleItem> {
    public KarutaMenpoPurpleRenderer() {
        super(new KarutaMenpoPurpleModel());

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
