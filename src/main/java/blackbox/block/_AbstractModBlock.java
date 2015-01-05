/**
 * @author Nephroid
 *
 * Description:
 *   This class handles basic block initialization common to all mod blocks
 */
package blackbox.block;

import blackbox.R;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public abstract class _AbstractModBlock extends Block {
  protected _AbstractModBlock() {
    super(Material.sponge);
    setUnlocalizedName(this.getClass().getSimpleName().toLowerCase());

    setStepSound(soundTypeWood);setHardness(0.5F);
    setResistance(5.0F);

    setCreativeTab(R.BLACKBOX_TAB);
  }
}
