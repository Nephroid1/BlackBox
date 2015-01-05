/**
 * @author Nephroid
 *
 * Description:
 *   This class contains the code that should run on servers only.
 *   
 *   The structure of CommonProxy, ClientOnlyProxy, and DedicatedServerProxy are adapted from
 *   TheGreyGhost's MinecraftByExample project
 */
package blackbox;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class DedicatedServerProxy extends CommonProxy {

  @Override
  public void preInit() {
    super.preInit();
  }

  @Override
  public void init() {
    super.init();
  }

  @Override
  public void postInit() {
    super.postInit();
  }
}
