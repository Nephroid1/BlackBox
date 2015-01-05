/**
 * @author Nephroid
 *
 * Description:
 *   This class manages all recipes
 */

package blackbox;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import blackbox.block.ModBlocks;

public class Recipes {
  public static void addRecipes() {
    add3x3Compression(block_Enderpearl, enderpearl);
    add3x3Compression(block_CompressedObsidian, obsidian);

    addFilledChestRecipe(block_BlackBox, block_CompressedObsidian, block_Enderpearl);

    GameRegistry.addRecipe(block_BlackBoxAssembler, new Object[]{
        "ABA",
        "ACA",
        "ADA",
        'A', block_BlackBox, 
        'B', Blocks.crafting_table,
        'C', Blocks.chest,
        'D', Blocks.furnace
    });
  }

  /* Instances of ItemStacks for use in recipes */
  private static ItemStack enderpearl = new ItemStack(Items.ender_pearl);
  private static ItemStack obsidian = new ItemStack(Blocks.obsidian);

  private static ItemStack block_Enderpearl = new ItemStack(ModBlocks.block_Enderpearl);
  private static ItemStack block_CompressedObsidian = new ItemStack(ModBlocks.block_CompressedObsidian);

  private static ItemStack block_BlackBox = new ItemStack(ModBlocks.block_BlackBox);
  private static ItemStack block_BlackBoxAssembler = new ItemStack(ModBlocks.block_BlackBoxAssembler);

  /* Methods for creating recipes with common patterns */
  private static void add3x3Compression(ItemStack compressed, ItemStack decompressed) {
    GameRegistry.addRecipe(compressed, new Object[]{
        "AAA",
        "AAA",
        "AAA",
        'A', decompressed
    });

    ItemStack output = new ItemStack(decompressed.getItem(), 9);
    GameRegistry.addShapelessRecipe(output, new Object[]{compressed});
  }

  private static void addFilledChestRecipe(ItemStack result, ItemStack chest, ItemStack fill) {
    GameRegistry.addRecipe(result, new Object[]{
        "AAA",
        "ABA",
        "AAA",
        'A', chest,
        'B', fill
    });
  }
}
