package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.item.custom.KarutaArmorLimeItem;
import net.alternativewill.kingdomdynasty.item.custom.KarutaArmorMagentaItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class KarutaArmorMagentaRenderer extends GeoArmorRenderer<KarutaArmorMagentaItem> {
    public KarutaArmorMagentaRenderer() {
        super(new KarutaArmorMagentaModel());

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
