package net.alternativewill.kingdomdynasty.item;

import net.alternativewill.kingdomdynasty.KingdomDynasty;
import net.alternativewill.kingdomdynasty.block.ModBlocks;
import net.alternativewill.kingdomdynasty.entity.ModEntityTypes;
import net.alternativewill.kingdomdynasty.item.custom.*;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.BlockItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, KingdomDynasty.MOD_ID);

    public static final RegistryObject<Item> BUDDHASTATUE_0 = block(KingdomDynasty.BUDDHASTATUE0, ModCreativeModTab.KINGDOMDYNASTYJAPAN_TAB);
    public static final RegistryObject<Item> BUDDHASTATUETOP = block(KingdomDynasty.BUDDHASTATUETOP, ModCreativeModTab.KINGDOMDYNASTYJAPAN_TAB);


    public static final RegistryObject<Item> TAMAHAGANE = ITEMS.register("tamahagane",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYESSENTIAL_TAB)));

    public static final RegistryObject<Item> BAMBOO_STICK = ITEMS.register("bamboo_stick",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYESSENTIAL_TAB)));


    public static final RegistryObject<Item> KATANA = ITEMS.register("katana",
            () -> new SwordItem(ModTiers.TAMAHAGANE, 4,-1.76f,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYWEAPONS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> TANTO = ITEMS.register("tanto",
            () -> new SwordItem(ModTiers.TAMAHAGANE, 2,-1.3f,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYWEAPONS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KAMA = ITEMS.register("kama",
            () -> new SwordItem(ModTiers.TAMAHAGANE, 3,-1.5f,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYWEAPONS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> MASAKARI = ITEMS.register("masakari",
            () -> new AxeItem(ModTiers.TAMAHAGANE, 7,-3.5f,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYWEAPONS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> NAGINATA = ITEMS.register("naginata",
            () -> new SwordItem(ModTiers.TAMAHAGANE, 6,-3.3f,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYWEAPONS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> SHINAI = ITEMS.register("shinai",
            () -> new SwordItem(ModTiers.BAMBOO, -2,-1.76f,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYWEAPONS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> CONICAL_HAT = ITEMS.register("conical_hat",
            () -> new ConicalArmorItem(ModArmorMaterials.BAMBOO, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> CONICAL_BLACK_HAT = ITEMS.register("conical_black_hat",
            () -> new ConicalArmorBlackItem(ModArmorMaterials.BAMBOO, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> MENPO = ITEMS.register("menpo",
            () -> new MenpoItem(ModArmorMaterials.KARUTA, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> MENPOBLACK = ITEMS.register("menpo_black",
            () -> new MenpoBlackItem(ModArmorMaterials.KARUTA, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> MENPORED = ITEMS.register("menpo_red",
            () -> new MenpoRedItem(ModArmorMaterials.KARUTA, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> MENPOGOLD = ITEMS.register("menpo_gold",
            () -> new MenpoGoldItem(ModArmorMaterials.KARUTA, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_KABUTO = ITEMS.register("karuta_kabuto",
            () -> new KarutaArmorItem(ModArmorMaterials.KARUTA, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_DO = ITEMS.register("karuta_do",
            () -> new KarutaArmorItem(ModArmorMaterials.KARUTA, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_KUSAZURI = ITEMS.register("karuta_kusazuri",
            () -> new KarutaArmorItem(ModArmorMaterials.KARUTA, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_GETA = ITEMS.register("karuta_geta",
            () -> new KarutaArmorItem(ModArmorMaterials.KARUTA, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_KABUTO_RED = ITEMS.register("karuta_kabuto_red",
            () -> new KarutaArmorRedItem(ModArmorMaterials.KARUTA, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_DO_RED = ITEMS.register("karuta_do_red",
            () -> new KarutaArmorRedItem(ModArmorMaterials.KARUTA, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_KUSAZURI_RED = ITEMS.register("karuta_kusazuri_red",
            () -> new KarutaArmorRedItem(ModArmorMaterials.KARUTA, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_GETA_RED = ITEMS.register("karuta_geta_red",
            () -> new KarutaArmorRedItem(ModArmorMaterials.KARUTA, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_KABUTO_BLUE = ITEMS.register("karuta_kabuto_blue",
            () -> new KarutaArmorBlueItem(ModArmorMaterials.KARUTA, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_DO_BLUE = ITEMS.register("karuta_do_blue",
            () -> new KarutaArmorBlueItem(ModArmorMaterials.KARUTA, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_KUSAZURI_BLUE = ITEMS.register("karuta_kusazuri_blue",
            () -> new KarutaArmorBlueItem(ModArmorMaterials.KARUTA, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_GETA_BLUE = ITEMS.register("karuta_geta_blue",
            () -> new KarutaArmorBlueItem(ModArmorMaterials.KARUTA, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_KABUTO_BLACK = ITEMS.register("karuta_kabuto_black",
            () -> new KarutaArmorBlackItem(ModArmorMaterials.KARUTA, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_DO_BLACK = ITEMS.register("karuta_do_black",
            () -> new KarutaArmorBlackItem(ModArmorMaterials.KARUTA, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_KUSAZURI_BLACK = ITEMS.register("karuta_kusazuri_black",
            () -> new KarutaArmorBlackItem(ModArmorMaterials.KARUTA, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_GETA_BLACK = ITEMS.register("karuta_geta_black",
            () -> new KarutaArmorBlackItem(ModArmorMaterials.KARUTA, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_KABUTO_GREEN = ITEMS.register("karuta_kabuto_green",
            () -> new KarutaArmorGreenItem(ModArmorMaterials.KARUTA, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_DO_GREEN = ITEMS.register("karuta_do_green",
            () -> new KarutaArmorGreenItem(ModArmorMaterials.KARUTA, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_KUSAZURI_GREEN = ITEMS.register("karuta_kusazuri_green",
            () -> new KarutaArmorGreenItem(ModArmorMaterials.KARUTA, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_GETA_GREEN = ITEMS.register("karuta_geta_green",
            () -> new KarutaArmorGreenItem(ModArmorMaterials.KARUTA, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_KABUTO_BROWN = ITEMS.register("karuta_kabuto_brown",
            () -> new KarutaArmorBrownItem(ModArmorMaterials.KARUTA, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_DO_BROWN = ITEMS.register("karuta_do_brown",
            () -> new KarutaArmorBrownItem(ModArmorMaterials.KARUTA, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_KUSAZURI_BROWN = ITEMS.register("karuta_kusazuri_brown",
            () -> new KarutaArmorBrownItem(ModArmorMaterials.KARUTA, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_GETA_BROWN = ITEMS.register("karuta_geta_brown",
            () -> new KarutaArmorBrownItem(ModArmorMaterials.KARUTA, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_KABUTO_GRAY = ITEMS.register("karuta_kabuto_gray",
            () -> new KarutaArmorGrayItem(ModArmorMaterials.KARUTA, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_DO_GRAY = ITEMS.register("karuta_do_gray",
            () -> new KarutaArmorGrayItem(ModArmorMaterials.KARUTA, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_KUSAZURI_GRAY = ITEMS.register("karuta_kusazuri_gray",
            () -> new KarutaArmorGrayItem(ModArmorMaterials.KARUTA, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_GETA_GRAY = ITEMS.register("karuta_geta_gray",
            () -> new KarutaArmorGrayItem(ModArmorMaterials.KARUTA, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_KABUTO_GOLD = ITEMS.register("karuta_kabuto_gold",
            () -> new KarutaArmorGoldItem(ModArmorMaterials.KARUTA, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_DO_GOLD = ITEMS.register("karuta_do_gold",
            () -> new KarutaArmorGoldItem(ModArmorMaterials.KARUTA, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_KUSAZURI_GOLD = ITEMS.register("karuta_kusazuri_gold",
            () -> new KarutaArmorGoldItem(ModArmorMaterials.KARUTA, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_GETA_GOLD = ITEMS.register("karuta_geta_gold",
            () -> new KarutaArmorGoldItem(ModArmorMaterials.KARUTA, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_KABUTO_PINK = ITEMS.register("karuta_kabuto_pink",
            () -> new KarutaArmorPinkItem(ModArmorMaterials.KARUTA, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_DO_PINK = ITEMS.register("karuta_do_pink",
            () -> new KarutaArmorPinkItem(ModArmorMaterials.KARUTA, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_KUSAZURI_PINK = ITEMS.register("karuta_kusazuri_pink",
            () -> new KarutaArmorPinkItem(ModArmorMaterials.KARUTA, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_GETA_PINK = ITEMS.register("karuta_geta_pink",
            () -> new KarutaArmorPinkItem(ModArmorMaterials.KARUTA, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_KABUTO_PURPLE = ITEMS.register("karuta_kabuto_purple",
            () -> new KarutaArmorPurpleItem(ModArmorMaterials.KARUTA, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_DO_PURPLE = ITEMS.register("karuta_do_purple",
            () -> new KarutaArmorPurpleItem(ModArmorMaterials.KARUTA, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_KUSAZURI_PURPLE = ITEMS.register("karuta_kusazuri_purple",
            () -> new KarutaArmorPurpleItem(ModArmorMaterials.KARUTA, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_GETA_PURPLE = ITEMS.register("karuta_geta_purple",
            () -> new KarutaArmorPurpleItem(ModArmorMaterials.KARUTA, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_KABUTO_LIME = ITEMS.register("karuta_kabuto_lime",
            () -> new KarutaArmorLimeItem(ModArmorMaterials.KARUTA, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_DO_LIME = ITEMS.register("karuta_do_lime",
            () -> new KarutaArmorLimeItem(ModArmorMaterials.KARUTA, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_KUSAZURI_LIME = ITEMS.register("karuta_kusazuri_lime",
            () -> new KarutaArmorLimeItem(ModArmorMaterials.KARUTA, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_GETA_LIME = ITEMS.register("karuta_geta_lime",
            () -> new KarutaArmorLimeItem(ModArmorMaterials.KARUTA, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_KABUTO_LIGHTBLUE = ITEMS.register("karuta_kabuto_light_blue",
            () -> new KarutaArmorLightBlueItem(ModArmorMaterials.KARUTA, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_DO_LIGHTBLUE = ITEMS.register("karuta_do_light_blue",
            () -> new KarutaArmorLightBlueItem(ModArmorMaterials.KARUTA, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_KUSAZURI_LIGHTBLUE = ITEMS.register("karuta_kusazuri_light_blue",
            () -> new KarutaArmorLightBlueItem(ModArmorMaterials.KARUTA, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_GETA_LIGHTBLUE = ITEMS.register("karuta_geta_light_blue",
            () -> new KarutaArmorLightBlueItem(ModArmorMaterials.KARUTA, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_KABUTO_ORANGE = ITEMS.register("karuta_kabuto_orange",
            () -> new KarutaArmorOrangeItem(ModArmorMaterials.KARUTA, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_DO_ORANGE = ITEMS.register("karuta_do_orange",
            () -> new KarutaArmorOrangeItem(ModArmorMaterials.KARUTA, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_KUSAZURI_ORANGE = ITEMS.register("karuta_kusazuri_orange",
            () -> new KarutaArmorOrangeItem(ModArmorMaterials.KARUTA, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_GETA_ORANGE = ITEMS.register("karuta_geta_orange",
            () -> new KarutaArmorOrangeItem(ModArmorMaterials.KARUTA, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_KABUTO_MAGENTA = ITEMS.register("karuta_kabuto_magenta",
            () -> new KarutaArmorMagentaItem(ModArmorMaterials.KARUTA, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_DO_MAGENTA = ITEMS.register("karuta_do_magenta",
            () -> new KarutaArmorMagentaItem(ModArmorMaterials.KARUTA, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_KUSAZURI_MAGENTA = ITEMS.register("karuta_kusazuri_magenta",
            () -> new KarutaArmorMagentaItem(ModArmorMaterials.KARUTA, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_GETA_MAGENTA = ITEMS.register("karuta_geta_magenta",
            () -> new KarutaArmorMagentaItem(ModArmorMaterials.KARUTA, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_KABUTO_WHITE = ITEMS.register("karuta_kabuto_white",
            () -> new KarutaArmorWhiteItem(ModArmorMaterials.KARUTA, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_DO_WHITE = ITEMS.register("karuta_do_white",
            () -> new KarutaArmorWhiteItem(ModArmorMaterials.KARUTA, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_KUSAZURI_WHITE = ITEMS.register("karuta_kusazuri_white",
            () -> new KarutaArmorWhiteItem(ModArmorMaterials.KARUTA, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_GETA_WHITE = ITEMS.register("karuta_geta_white",
            () -> new KarutaArmorWhiteItem(ModArmorMaterials.KARUTA, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_KABUTO_LIGHTGRAY = ITEMS.register("karuta_kabuto_light_gray",
            () -> new KarutaArmorLightGrayItem(ModArmorMaterials.KARUTA, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_DO_LIGHTGRAY = ITEMS.register("karuta_do_light_gray",
            () -> new KarutaArmorLightGrayItem(ModArmorMaterials.KARUTA, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_KUSAZURI_LIGHTGRAY = ITEMS.register("karuta_kusazuri_light_gray",
            () -> new KarutaArmorLightGrayItem(ModArmorMaterials.KARUTA, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_GETA_LIGHTGRAY = ITEMS.register("karuta_geta_light_gray",
            () -> new KarutaArmorLightGrayItem(ModArmorMaterials.KARUTA, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_KABUTO_CYAN = ITEMS.register("karuta_kabuto_cyan",
            () -> new KarutaArmorCyanItem(ModArmorMaterials.KARUTA, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_DO_CYAN = ITEMS.register("karuta_do_cyan",
            () -> new KarutaArmorCyanItem(ModArmorMaterials.KARUTA, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_KUSAZURI_CYAN = ITEMS.register("karuta_kusazuri_cyan",
            () -> new KarutaArmorCyanItem(ModArmorMaterials.KARUTA, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_GETA_CYAN = ITEMS.register("karuta_geta_cyan",
            () -> new KarutaArmorCyanItem(ModArmorMaterials.KARUTA, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_KABUTO_DIAMOND = ITEMS.register("karuta_kabuto_diamond",
            () -> new KarutaArmorDiamondItem(ModArmorMaterials.KARUTADIAMOND, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_DO_DIAMOND = ITEMS.register("karuta_do_diamond",
            () -> new KarutaArmorDiamondItem(ModArmorMaterials.KARUTADIAMOND, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_KUSAZURI_DIAMOND = ITEMS.register("karuta_kusazuri_diamond",
            () -> new KarutaArmorDiamondItem(ModArmorMaterials.KARUTADIAMOND, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_GETA_DIAMOND = ITEMS.register("karuta_geta_diamond",
            () -> new KarutaArmorDiamondItem(ModArmorMaterials.KARUTADIAMOND, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KIMONO = ITEMS.register("kimono",
            () -> new KimonoItem(ArmorMaterials.LEATHER, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KIMONO_HAKAMA = ITEMS.register("kimono_hakama",
            () -> new KimonoItem(ArmorMaterials.LEATHER, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> CONICALHATRED = ITEMS.register("conical_hat_red",
            () -> new ConicalMenpoRedItem(ModArmorMaterials.BAMBOOMENPO, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> CONICALHATBLACK = ITEMS.register("conical_hat_black",
            () -> new ConicalMenpoBlackItem(ModArmorMaterials.BAMBOOMENPO, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> CONICALHATGOLD = ITEMS.register("conical_hat_gold",
            () -> new ConicalMenpoGoldItem(ModArmorMaterials.BAMBOOMENPO, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> CONICALHATMENPO = ITEMS.register("conical_hat_tamahagane",
            () -> new ConicalMenpoItem(ModArmorMaterials.BAMBOOMENPO, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_KABUTO_BLACK_MENPO = ITEMS.register("karuta_kabuto_black_menpo",
            () -> new KarutaMenpoBlackItem(ModArmorMaterials.KARUTAMENPO, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_KABUTO_RED_MENPO = ITEMS.register("karuta_kabuto_red_menpo",
            () -> new KarutaMenpoRedItem(ModArmorMaterials.KARUTAMENPO, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_KABUTO_GOLD_MENPO = ITEMS.register("karuta_kabuto_gold_menpo",
            () -> new KarutaMenpoGoldItem(ModArmorMaterials.KARUTAMENPO, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_KABUTO_BLUE_MENPO = ITEMS.register("karuta_kabuto_blue_menpo",
            () -> new KarutaMenpoBlueItem(ModArmorMaterials.KARUTAMENPO, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_KABUTO_LIGHT_BLUE_MENPO = ITEMS.register("karuta_kabuto_light_blue_menpo",
            () -> new KarutaMenpoLightBlueItem(ModArmorMaterials.KARUTAMENPO, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_KABUTO_CYAN_MENPO = ITEMS.register("karuta_kabuto_cyan_menpo",
            () -> new KarutaMenpoCyanItem(ModArmorMaterials.KARUTAMENPO, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_KABUTO_WHITE_MENPO = ITEMS.register("karuta_kabuto_white_menpo",
            () -> new KarutaMenpoWhiteItem(ModArmorMaterials.KARUTAMENPO, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_KABUTO_LIGHT_GRAY_MENPO = ITEMS.register("karuta_kabuto_light_gray_menpo",
            () -> new KarutaMenpoLightGrayItem(ModArmorMaterials.KARUTAMENPO, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_KABUTO_GRAY_MENPO = ITEMS.register("karuta_kabuto_gray_menpo",
            () -> new KarutaMenpoGrayItem(ModArmorMaterials.KARUTAMENPO, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_KABUTO_GREEN_MENPO = ITEMS.register("karuta_kabuto_green_menpo",
            () -> new KarutaMenpoGreenItem(ModArmorMaterials.KARUTAMENPO, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_KABUTO_LIME_MENPO = ITEMS.register("karuta_kabuto_lime_menpo",
            () -> new KarutaMenpoLimeItem(ModArmorMaterials.KARUTAMENPO, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_KABUTO_BROWN_MENPO = ITEMS.register("karuta_kabuto_brown_menpo",
            () -> new KarutaMenpoBrownItem(ModArmorMaterials.KARUTAMENPO, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_KABUTO_ORANGE_MENPO = ITEMS.register("karuta_kabuto_orange_menpo",
            () -> new KarutaMenpoOrangeItem(ModArmorMaterials.KARUTAMENPO, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_KABUTO_PINK_MENPO = ITEMS.register("karuta_kabuto_pink_menpo",
            () -> new KarutaMenpoPinkItem(ModArmorMaterials.KARUTAMENPO, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_KABUTO_MAGENTA_MENPO = ITEMS.register("karuta_kabuto_magenta_menpo",
            () -> new KarutaMenpoMagentaItem(ModArmorMaterials.KARUTAMENPO, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_KABUTO_PURPLE_MENPO = ITEMS.register("karuta_kabuto_purple_menpo",
            () -> new KarutaMenpoPurpleItem(ModArmorMaterials.KARUTAMENPO, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> KARUTA_KABUTO_MENPO = ITEMS.register("karuta_kabuto_menpo",
            () -> new KarutaMenpoItem(ModArmorMaterials.KARUTAMENPO, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModTab.KINGDOMDYNASTYARMOR_TAB).stacksTo(1)));

    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, KingdomDynasty.MOD_ID);
    public static final RegistryObject<Item> SAMURAIWARRIOR = ITEMS.register("samurai_warrior_spawn_egg",
        () -> new ForgeSpawnEggItem(ModEntityTypes.SAMURAIWARRIOR, -13434880, -16777216,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));



    public static void register(IEventBus eventBus){
     ITEMS.register(eventBus);
    }
    private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
        return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

}
