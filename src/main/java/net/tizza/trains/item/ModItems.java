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
    public static final RegistryObject<Item> MID_125 = ITEMS.register("mid_125", ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TOP_125 = ITEMS.register("top_125", ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL = ITEMS.register("steel", ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RED_STEEL = ITEMS.register("red_steel", ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLACK_STEEL = ITEMS.register("black_steel", ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WHITE_STEEL = ITEMS.register("white_steel", ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_STEEL = ITEMS.register("yellow_steel", ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLUE_STEEL = ITEMS.register("blue_steel", ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NAVY_STEEL = ITEMS.register("navy_steel", ()-> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
