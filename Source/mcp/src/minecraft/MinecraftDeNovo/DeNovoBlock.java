package MinecraftDeNovo;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class DeNovoBlock extends Block
{
    public DeNovoBlock(int par1, String string)
    {
        super(par1, Material.rock);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return this.blockID == Main.limestoneore.blockID ? Main.limestoneore.blockID : (this.blockID == Main.limestonebrick.blockID ? Main.limestonebrick.blockID : (this.blockID == Main.granite.blockID ? Main.granite.blockID : (this.blockID == Main.marble.blockID ? Main.marble.blockID : (this.blockID == Main.granitebrick.blockID ? Main.granitebrick.blockID : (this.blockID == Main.marblebrick.blockID ? Main.marblebrick.blockID : this.blockID)))));
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random random)
    {
        return 1;
    }
}
