package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.item.custom.KarutaMenpoLimeItem;
import net.alternativewill.kingdomdynasty.item.custom.KarutaMenpoOrangeItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class KarutaMenpoOrangeRenderer extends GeoArmorRenderer<KarutaMenpoOrangeItem> {
    public KarutaMenpoOrangeRenderer() {
        super(new KarutaMenpoOrangeModel());

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
