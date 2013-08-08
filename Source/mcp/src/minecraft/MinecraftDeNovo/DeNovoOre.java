package MinecraftDeNovo;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class DeNovoOre extends Block
{
    public DeNovoOre(int par1, String string)
    {
        super(par1, Material.rock);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return this.blockID == Main.copperore.blockID ? Main.RawCopper.itemID : (this.blockID == Main.tinore.blockID ? Main.RawTin.itemID : (this.blockID == Main.leadore.blockID ? Main.RawLead.itemID : (this.blockID == Main.mithrilore.blockID ? Main.RawMithril.itemID : (this.blockID == Main.silverore.blockID ? Main.RawSilver.itemID : (this.blockID == Main.orichalcumore.blockID ? Main.RawOrichalcum.itemID : (this.blockID == Main.onyxore.blockID ? Main.UncutOnyx.itemID : (this.blockID == Main.rubyore.blockID ? Main.UncutRuby.itemID : (this.blockID == Main.sapphireore.blockID ? Main.UncutSapphire.itemID : this.blockID))))))));
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random random)
    {
        return random.nextInt(3) + 2;
    }
    
}
