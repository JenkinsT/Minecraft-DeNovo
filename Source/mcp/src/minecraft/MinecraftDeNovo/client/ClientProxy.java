package MinecraftDeNovo.client;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import MinecraftDeNovo.CommonProxy;
import MinecraftDeNovo.GuiStoneAnvil;
import MinecraftDeNovo.TileEntityStoneAnvil;
import MinecraftDeNovo.TileEntityStoneAnvilRenderer;
import cpw.mods.fml.client.registry.ClientRegistry;

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

	public void registerRenderThings() {
		ClientRegistry.bindTileEntitySpecialRenderer(
				TileEntityStoneAnvil.class,
				new TileEntityStoneAnvilRenderer());
	}

}