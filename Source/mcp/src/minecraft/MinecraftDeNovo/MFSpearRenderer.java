package MinecraftDeNovo;

/**
 *
 * @author Anonymous Productions
 * 
 * Sources are provided for educational reasons.
 * though small bits of code, or methods can be used in your own creations.
 * 
 * Code based off Battlegear Spears by Nerd Boy.
 */
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import cpw.mods.fml.client.FMLClientHandler;

public class MFSpearRenderer implements IItemRenderer {

    RenderItem renderItem = new RenderItem();

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        return type.equals(ItemRenderType.EQUIPPED) || type.equals(ItemRenderType.INVENTORY);
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,
            ItemRendererHelper helper) {
        return false;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
    	Minecraft mc = FMLClientHandler.instance().getClient();
        if (type.equals(ItemRenderType.EQUIPPED)) {
        	EntityLivingBase player = null;
        	for(int a = 0; a < data.length; a ++)
        	{
        		if(data[a] instanceof EntityLivingBase)
        		{
        			player = (EntityLivingBase)data[a];
        		}
        	}
        	
        	if(isFirstPerson(player))
        	{
        		renderFirstPerson(item, player);
        	}
        	else
        	{
             renderWeapon(item, player);
        	}
        } else {
            GL11.glTranslatef(0, 16, 0);
            renderItem.renderItemIntoGUI(mc.fontRenderer, mc.renderEngine, new ItemStack(item.itemID, 1, item.getItemDamage()), 0, -16);
        }

    }

    private void renderFirstPerson(ItemStack item, EntityLivingBase player) {
    	GL11.glPushMatrix();
    	GL11.glTranslatef(-1.0F, 1F, 0.0F);
    	boolean using = false;
    	if(player instanceof EntityPlayer)
    	{
    		if(((EntityPlayer)player).isUsingItem())
    		{
    			using = true;
    			GL11.glTranslatef(-0.5F, -0.25F, 0);
    		}
    	}
    	float r = -40F;
        if(player.getSwingProgress(1) > 0 || using)
        	r -= 45;
        
        renderWeaponAsItem(item, player, r);

        GL11.glPopMatrix();
    }

    private void renderWeapon(ItemStack item, EntityLivingBase player) {


        GL11.glTranslatef(-0.87F, -0.2F, 0.0F);
        
        GL11.glRotatef(45, 0, 0, 1);
        	
        boolean using = false;
    	if(player instanceof EntityPlayer)
    	{
    		if(((EntityPlayer)player).isUsingItem())using = true;
    	}
        float r = -40F;
        if(player.getSwingProgress(1) > 0 || using)
        	r -= 90;
        renderWeaponAsItem(item, player, r);


    }
    
    private boolean isFirstPerson(EntityLivingBase player) {
    	Minecraft mc = FMLClientHandler.instance().getClient();
		return mc.gameSettings.thirdPersonView == 0 && player == mc.thePlayer && !(mc.currentScreen instanceof GuiInventory);
	}
    
    private void renderWeaponAsItem(ItemStack item, EntityLivingBase player, float r) {
    	GL11.glTranslatef(1.5F, -0.8F, 0);
        GL11.glPushMatrix();
        
    	GL11.glRotatef(r, 0, 0, 1);
    	
        Icon icon = item.getIconIndex();
        Minecraft mc = FMLClientHandler.instance().getClient();
        ResourceLocation items = new ResourceLocation("/gui/items.png");
        mc.renderEngine.func_110577_a(items);
        Tessellator tessellator = Tessellator.instance;
        float x1 = icon.getMinU();
        float x2 = icon.getMaxU();
        float y1 = icon.getMinV();
        float y2 = icon.getMaxV();
        float xPos = 1.9F;
        float yPos = 1.15F;
        GL11.glEnable(GL12.GL_RESCALE_NORMAL);
        GL11.glTranslatef(-xPos, -yPos, 0.0F);
        GL11.glScaled(3, 3, 1);
        ItemRenderer.renderItemIn2D(tessellator, x2, y1, x1, y2, icon.getSheetWidth(), icon.getSheetHeight(), 0.0625F);

        if (item != null && item.hasEffect()) {
            GL11.glDepthFunc(GL11.GL_EQUAL);
            GL11.glDisable(GL11.GL_LIGHTING);
            ResourceLocation glint = new ResourceLocation("%blur%/misc/glint.png");
            mc.renderEngine.func_110577_a(glint);
            GL11.glEnable(GL11.GL_BLEND);
            GL11.glBlendFunc(GL11.GL_SRC_COLOR, GL11.GL_ONE);
            float var13 = 0.76F;
            GL11.glColor4f(0.5F * var13, 0.25F * var13, 0.8F * var13, 1.0F);
            GL11.glMatrixMode(GL11.GL_TEXTURE);
            GL11.glPushMatrix();
            float var14 = 0.125F;
            GL11.glScalef(var14, var14, var14);
            float var15 = (float) (System.currentTimeMillis() % 3000L) / 3000.0F * 8.0F;
            GL11.glTranslatef(var15, 0.0F, 0.0F);
            GL11.glRotatef(-50.0F, 0.0F, 0.0F, 1.0F);
            ItemRenderer.renderItemIn2D(tessellator, x2, y1, x1, y2, icon.getSheetWidth(), icon.getSheetHeight(), 0.0625F);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef(var14, var14, var14);
            var15 = (float) (System.currentTimeMillis() % 4873L) / 4873.0F * 8.0F;
            GL11.glTranslatef(-var15, 0.0F, 0.0F);
            GL11.glRotatef(10.0F, 0.0F, 0.0F, 1.0F);
            ItemRenderer.renderItemIn2D(tessellator, x2, y1, x1, y2, icon.getSheetWidth(), icon.getSheetHeight(), 0.0625F);
            GL11.glPopMatrix();
            GL11.glMatrixMode(GL11.GL_MODELVIEW);
            GL11.glDisable(GL11.GL_BLEND);
            GL11.glEnable(GL11.GL_LIGHTING);
            GL11.glDepthFunc(GL11.GL_LEQUAL);
        }

        GL11.glDisable(GL12.GL_RESCALE_NORMAL);

        GL11.glPopMatrix();

    }
}