package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.item.custom.ConicalArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class ConicalArmorRenderer extends GeoArmorRenderer<ConicalArmorItem> {

    public ConicalArmorRenderer() {
        super(new ConicalArmorModel());

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