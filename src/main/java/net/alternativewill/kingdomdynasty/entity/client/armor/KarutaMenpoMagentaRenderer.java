package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.item.custom.KarutaMenpoMagentaItem;
import net.alternativewill.kingdomdynasty.item.custom.KarutaMenpoPinkItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class KarutaMenpoMagentaRenderer extends GeoArmorRenderer<KarutaMenpoMagentaItem> {
    public KarutaMenpoMagentaRenderer() {
        super(new KarutaMenpoMagentaModel());

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
