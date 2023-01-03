package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.item.custom.ConicalMenpoGoldItem;
import net.alternativewill.kingdomdynasty.item.custom.ConicalMenpoItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class ConicalMenpoRenderer extends GeoArmorRenderer<ConicalMenpoItem> {

    public ConicalMenpoRenderer() {
        super(new ConicalMenpoModel());

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