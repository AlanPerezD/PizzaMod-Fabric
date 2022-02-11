package net.tonielgordo.tutorialmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.tonielgordo.tutorialmod.TutorialMod;

public class ModItems {
    public static final Item EKN_INGOT = registerItem("ekn_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item EKN_SWORD = registerItem("ekn_sword",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);
    }
}
