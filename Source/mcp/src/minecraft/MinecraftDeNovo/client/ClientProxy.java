package MinecraftDeNovo.client;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import MinecraftDeNovo.CommonProxy;
import MinecraftDeNovo.ContainerStoneAnvil;
import MinecraftDeNovo.GuiStoneAnvil;
import cpw.mods.fml.common.network.IGuiHandler;

public class ClientProxy extends CommonProxy {
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		switch (ID) {
		case 0:
			return new GuiStoneAnvil(player.inventory, world, x, y, z);
		}
		return null;

	}
}