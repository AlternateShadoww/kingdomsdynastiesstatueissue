package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.item.custom.ConicalMenpoBlackItem;
import net.alternativewill.kingdomdynasty.item.custom.ConicalMenpoRedItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class ConicalMenpoBlackRenderer extends GeoArmorRenderer<ConicalMenpoBlackItem> {

    public ConicalMenpoBlackRenderer() {
        super(new ConicalMenpoBlackModel());

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