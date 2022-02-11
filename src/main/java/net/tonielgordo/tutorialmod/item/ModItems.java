package net.tonielgordo.tutorialmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.tonielgordo.tutorialmod.TutorialMod;

public class ModItems {
    public static final Item PIZZA_STAGE_01 = registerItem("pizza_stage_01",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item PIZZA_STAGE_02 = registerItem("pizza_stage_02",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item PIZZA_STAGE_03 = registerItem("pizza_stage_03",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item PIZZA_STAGE_04 = registerItem("pizza_stage_04",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item PIZZA_STAGE_FINAL = registerItem("pizza_stage_final",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }


    public static void registerModItems(){
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);
    }
}
