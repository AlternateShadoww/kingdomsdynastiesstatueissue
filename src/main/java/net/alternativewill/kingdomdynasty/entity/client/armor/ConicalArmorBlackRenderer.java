package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.item.custom.ConicalArmorBlackItem;
import net.alternativewill.kingdomdynasty.item.custom.ConicalArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class ConicalArmorBlackRenderer extends GeoArmorRenderer<ConicalArmorBlackItem> {

    public ConicalArmorBlackRenderer() {
        super(new ConicalArmorBlackModel());

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