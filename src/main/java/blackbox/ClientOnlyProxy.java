/**
 * @author Nephroid
 *
 * Description:
 *   This class contains the code that runs on the client only.
 *   
 *   The structure of CommonProxy, ClientOnlyProxy, and DedicatedServerProxy are adapted from
 *   TheGreyGhost's MinecraftByExample project
 */
package blackbox;

import blackbox.block.ModBlocks;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ClientOnlyProxy extends CommonProxy {
  @Override
  public void preInit() {
    super.preInit();
  }

  @Override
  public void init() {
    super.init();

    ModBlocks.registerBlockItems();
  }

  @Override
  public void postInit() {
    super.postInit();
  }
}
