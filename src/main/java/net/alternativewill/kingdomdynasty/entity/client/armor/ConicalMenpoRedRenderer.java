package net.alternativewill.kingdomdynasty.entity.client.armor;

import net.alternativewill.kingdomdynasty.item.custom.ConicalArmorItem;
import net.alternativewill.kingdomdynasty.item.custom.ConicalMenpoRedItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class ConicalMenpoRedRenderer extends GeoArmorRenderer<ConicalMenpoRedItem> {

    public ConicalMenpoRedRenderer() {
        super(new ConicalMenpoRedModel());

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