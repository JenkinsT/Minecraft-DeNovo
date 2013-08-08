package MinecraftDeNovo;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class DeNovoBasicItems extends Item
{
    public DeNovoBasicItems(int par1)
    {
        super(par1);
        this.setCreativeTab(CreativeTabs.tabMaterials);
    }
}
