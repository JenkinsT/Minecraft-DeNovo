package MinecraftDeNovo;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockStoneAnvil extends Block
{
    @SideOnly(Side.CLIENT)
    private Icon workbenchIconTop;
    @SideOnly(Side.CLIENT)
    private Icon workbenchIconFront;

    protected BlockStoneAnvil(int par1)
    {
        super(par1, Material.wood);
        this.setCreativeTab(CreativeTabs.tabDecorations);
    }

  //Make sure you set this as your TileEntity class relevant for the block!
    /*@Override
    public TileEntity createNewTileEntity(World world) {
            return new TileEntityStoneAnvil();
    }
    
    //You don't want the normal render type, or it wont render properly.
    @Override
    public int getRenderType() {
            return -1;
    }
    
    //It's not an opaque cube, so you need this.
    @Override
    public boolean isOpaqueCube() {
            return false;
    }
    
    //It's not a normal block, so you need this too.
    public boolean renderAsNormalBlock() {
            return false;
    }*/

    @SideOnly(Side.CLIENT)

    /**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.
     */
    public void registerIcons(IconRegister par1IconRegister)
    {

    }

    /**
     * Called upon block activation (right click on the block.)
     */
    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
    {
        if (par1World.isRemote)
        {
            return true;
        }
        else
        {
        	par5EntityPlayer.openGui(Main.instance, 0, par1World, par2, par3, par4);
            return true;
        }
    }
}
