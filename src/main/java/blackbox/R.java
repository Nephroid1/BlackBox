/**
 * @author Nephroid
 * 
 * Description:
 *   This class contains all static global resources that the mod uses.
 */

package blackbox;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class R {
  public static final String MODID = "nephroid_blackbox";
  public static final String VERSION = "1.0";

  public static final CreativeTabs BLACKBOX_TAB = new CreativeTabs("blackbox_tab") {
    @Override
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem() {
      return Items.ender_pearl;
    }
  };
}
