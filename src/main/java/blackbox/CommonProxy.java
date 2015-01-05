/**
 * @author Nephroid
 * 
 * Description:
 *   This class contains code that runs on both the client and server.
 *   
 *   The structure of CommonProxy, ClientOnlyProxy, and DedicatedServerProxy are adapted from
 *   TheGreyGhost's MinecraftByExample project
 */
package blackbox;

import blackbox.block.ModBlocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

  public void preInit() {
    ModBlocks.addBlocks();
  }

  public void init() {
    Recipes.addRecipes();
  }

  public void postInit() {

  }

}
