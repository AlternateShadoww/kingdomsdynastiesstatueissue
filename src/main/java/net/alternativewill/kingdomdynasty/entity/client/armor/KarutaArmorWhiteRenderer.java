package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.item.custom.KarutaArmorLimeItem;
import net.alternativewill.kingdomdynasty.item.custom.KarutaArmorWhiteItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class KarutaArmorWhiteRenderer extends GeoArmorRenderer<KarutaArmorWhiteItem> {
    public KarutaArmorWhiteRenderer() {
        super(new KarutaArmorWhiteModel());

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
