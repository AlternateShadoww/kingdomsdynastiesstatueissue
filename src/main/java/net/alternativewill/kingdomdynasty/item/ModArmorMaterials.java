package net.alternativewill.kingdomdynasty.item;

import net.alternativewill.kingdomdynasty.KingdomDynasty;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    KARUTA("karuta", 28, new int[]{2, 6, 7, 3}, 19, SoundEvents.ARMOR_EQUIP_IRON, 1F, 0.05F, () -> {
        return Ingredient.of(ModItems.TAMAHAGANE.get());
    }),

    KARUTADIAMOND("karutadiamond", 28, new int[]{3, 7, 8, 4}, 19, SoundEvents.ARMOR_EQUIP_IRON, 2F, 0.1F, () -> {
        return Ingredient.of(ModItems.TAMAHAGANE.get());
    }),


    KARUTAMENPO("karutamenpo", 28, new int[]{3, 6, 7, 3}, 19, SoundEvents.ARMOR_EQUIP_IRON, 2F, 0.2F, () -> {
        return Ingredient.of(ModItems.TAMAHAGANE.get());
    }),
    BAMBOOMENPO("bamboomenpo", 28, new int[]{2, 6, 7, 2}, 19, SoundEvents.ARMOR_EQUIP_IRON, 1F, 0.1F, () -> {
        return Ingredient.of(ModItems.TAMAHAGANE.get());
    }),
        BAMBOO("bamboo", 28, new int[]{1, 2, 3, 1}, 19, SoundEvents.ARMOR_EQUIP_LEATHER, 0F, 0.1F, () -> {
            return Ingredient.of(ModItems.BAMBOO_STICK.get());
        });


        private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
        private final String name;
        private final int durabilityMultiplier;
        private final int[] slotProtections;
        private final int enchantmentValue;
        private final SoundEvent sound;
        private final float toughness;
        private final float knockbackResistance;
        private final LazyLoadedValue<Ingredient> repairIngredient;

        private ModArmorMaterials(String pName, int pDurabilityMultiplier, int[] pSlotProtections, int pEnchantmentValue, SoundEvent pSound, float pToughness, float pKnockbackResistance, Supplier<Ingredient> pRepairIngredient) {
            this.name = pName;
            this.durabilityMultiplier = pDurabilityMultiplier;
            this.slotProtections = pSlotProtections;
            this.enchantmentValue = pEnchantmentValue;
            this.sound = pSound;
            this.toughness = pToughness;
            this.knockbackResistance = pKnockbackResistance;
            this.repairIngredient = new LazyLoadedValue<>(pRepairIngredient);
        }

        public int getDurabilityForSlot(EquipmentSlot pSlot) {
            return HEALTH_PER_SLOT[pSlot.getIndex()] * this.durabilityMultiplier;
        }

        public int getDefenseForSlot(EquipmentSlot pSlot) {
            return this.slotProtections[pSlot.getIndex()];
        }

        public int getEnchantmentValue() {
            return this.enchantmentValue;
        }

        public SoundEvent getEquipSound() {
            return this.sound;
        }

        public Ingredient getRepairIngredient() {
            return this.repairIngredient.get();
        }

        public String getName() {
            return KingdomDynasty.MOD_ID + ":" + this.name;
        }

        public float getToughness() {
            return this.toughness;
        }

        public float getKnockbackResistance() {
            return this.knockbackResistance;
        }
    }

