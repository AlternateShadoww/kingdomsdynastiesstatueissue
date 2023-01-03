package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.item.custom.ConicalArmorItem;
import net.alternativewill.kingdomdynasty.item.custom.KimonoItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class KimonoRenderer extends GeoArmorRenderer<KimonoItem> {

    public KimonoRenderer() {
        super(new KimonoModel());

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