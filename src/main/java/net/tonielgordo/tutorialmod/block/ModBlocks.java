package net.tonielgordo.tutorialmod.block;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.tonielgordo.tutorialmod.TutorialMod;

public class ModBlocks {
    public static final Block CHUNKPIZZA = registerBlock("chunkpizza",
            new Block(AbstractBlock.Settings.of(Material.CAKE).requiresTool().strength(1.5f,6.0f)));


    public static Block registerBlock(String name,Block block){
        return Registry.register(Registry.BLOCK, new Identifier(TutorialMod.MOD_ID, name), block);
    }

    public static void registerModBlocks(){
        TutorialMod.LOGGER.info("Registering Mod Blocks for "+ TutorialMod.MOD_ID);
    }
}
