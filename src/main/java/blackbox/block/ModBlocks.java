package blackbox.block;

import java.util.LinkedList;

import blackbox.R;
import blackbox.block.compressed.*;
/**
 * @author Nephroid
 *
 * Description:
 *   This class handles registering and contains static references to
 *   all of the blocks in this mod.
 */
import blackbox.block.machine.*;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
  public static void addBlocks() {
    initBlocks();
    registerBlocks();
    registerTileEntities();
  }

  /* This list is used solely for registering the blocks in a for-each loop.
   * To access the elements inside, use the static references below this list.
   */
  public static LinkedList<Block> blocks = new LinkedList<Block>();

  public static Block block_Enderpearl;
  public static Block block_CompressedObsidian;

  public static Block block_BlackBox;
  public static Block block_BlackBoxAssembler;

  private static void initBlocks() {
    blocks.add(block_Enderpearl = new Block_Enderpearl());
    blocks.add(block_CompressedObsidian = new Block_CompressedObsidian());
    blocks.add(block_BlackBox = new Block_BlackBox());
    blocks.add(block_BlackBoxAssembler = new Block_BlackBoxAssembler());
  }

  private static void registerBlocks() {
    for(Block b : blocks) {
      String registeredName = b.getUnlocalizedName().substring(5);
      GameRegistry.registerBlock(b, registeredName);
      System.out.printf("[DEBUG] Registered block with name %s\n", registeredName);
    }
  }

  private static void registerTileEntities() {
    
  }

  // Set correct rendering for blocks in the inventory (should eventually be unnecessary)
  public static void registerBlockItems() {
    for(Block b : blocks) {
      Item blockItem = GameRegistry.findItem(R.MODID, b.getUnlocalizedName().substring(5));
      ModelResourceLocation mrl = new ModelResourceLocation(R.MODID + ":" + b.getUnlocalizedName().substring(5), "inventory");
      Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(blockItem, 0, mrl);
    }
  }
}
