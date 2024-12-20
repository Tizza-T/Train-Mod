package net.tizza.trains.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tizza.trains.Trains;

public class ModItems {
    public static final DeferredRegister<Item>  ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,Trains.MOD_ID);
    public static final RegistryObject<Item> TICKET = ITEMS.register("ticket", ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> UNDERBELLY_125 = ITEMS.register("underbelly_125", ()-> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
