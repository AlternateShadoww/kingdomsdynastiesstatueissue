package net.alternativewill.kingdomdynasty.entity;

import net.alternativewill.kingdomdynasty.KingdomDynasty;
import net.minecraftforge.registries.RegistryObject;
        import net.minecraftforge.registries.ForgeRegistries;
        import net.minecraftforge.registries.DeferredRegister;
        import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
        import net.minecraftforge.fml.common.Mod;
        import net.minecraftforge.eventbus.api.SubscribeEvent;
        import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

        import net.minecraft.world.entity.MobCategory;
        import net.minecraft.world.entity.EntityType;
        import net.minecraft.world.entity.Entity;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, KingdomDynasty.MOD_ID);
    public static final RegistryObject<EntityType<SamuraiWarriorEntity>> SAMURAIWARRIOR = register("samurai_warrior",
            EntityType.Builder.<SamuraiWarriorEntity>of(SamuraiWarriorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
                    .setUpdateInterval(3).setCustomClientFactory(SamuraiWarriorEntity::new)

                    .sized(0.6f, 1.8f));

    public static final RegistryObject<EntityType<SamuraiEntity>> SAMURAI = register("samurai",
            EntityType.Builder.<SamuraiEntity>of(SamuraiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
                    .setUpdateInterval(3).setCustomClientFactory(SamuraiEntity::new)

                    .sized(0.6f, 1.8f));


    private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
        return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
    }
    @SubscribeEvent
    public static void init(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            SamuraiWarriorEntity.init();
            SamuraiEntity.init();
        });
    }

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(SAMURAIWARRIOR.get(), SamuraiWarriorEntity.createAttributes().build());
        event.put(SAMURAI.get(), SamuraiEntity.createAttributes().build());
    }
}




