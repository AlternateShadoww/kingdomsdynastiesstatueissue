package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.item.custom.KarutaArmorCyanItem;
import net.alternativewill.kingdomdynasty.item.custom.KarutaArmorDiamondItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class KarutaArmorDiamondRenderer extends GeoArmorRenderer<KarutaArmorDiamondItem> {
    public KarutaArmorDiamondRenderer() {
        super(new KarutaArmorDiamondModel());

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
