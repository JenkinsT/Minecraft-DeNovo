package MinecraftDeNovo;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(
    modid = "minecraftdenovo",
    name = "De Novo",
    version = "v0.0"
)
@NetworkMod(
    clientSideRequired = true,
    serverSideRequired = false
)

public class Main
{
	//The instance of your mod that Forge uses.
	@Instance("minecraftdenovo")
	public static Main instance;
	
	@SidedProxy(clientSide = "MinecraftDeNovo.client.ClientProxy", serverSide = "MinecraftDeNovo.CommonProxy")
	public static CommonProxy proxy = new CommonProxy();
	
	public static Block StoneAnvil;
	
	//needed in Bronze - Iron - Diamond - Orichalcum
	public static Item BastardSwordBladeDiamond;
	public static Item BattleAxeHeadDiamond;
	public static Item DaggerBladeDiamond;
	public static Item HachetHeadDiamond;
	public static Item HoeHeadDiamond;
	public static Item KukriBladeDiamond;
	public static Item LongSwordBladeDiamond;
	public static Item LumberAxeHeadDiamond;
	public static Item MaceHeadDiamond;
	public static Item MinersMattockHeadDiamond;
	public static Item PickAxeHeadDiamond;
	public static Item PikeNSpearHeadDiamond;
	public static Item PlowBladeDiamond;
	public static Item ScimitarBladeDiamond;
	public static Item ScytheBladeDiamond;
	public static Item ShortSwordBladeDiamond;
	public static Item ShovelHeadDiamond;
	public static Item SwordBladeDiamond;
	public static Item TomahawkHeadDiamond;
	public static Item WoodCuttersAxeDiamond;
	public static Item WoodCuttersMatttockDiamond;
	
    public static Item CopperIngot;
    public static Item TinIngot;
    public static Item LeadIngot;
    public static Item BronzeIngot;
    public static Item MithrilIngot;
    public static Item OrichalcumIngot;
    public static Item SilverIngot;
    public static Item SteelIngot;
    public static Item RubyGem;
    public static Item OnyxGem;
    public static Item SapphireGem;
    public static Item RawCopper;
    public static Item RawLead;
    public static Item RawMithril;
    public static Item RawOrichalcum;
    public static Item RawSilver;
    public static Item RawTin;
    public static Item UncutRuby;
    public static Item UncutSapphire;
    public static Item UncutOnyx;
    public static Block copperore;
    public static Block tinore;
    public static Block leadore;
    public static Block onyxore;
    public static Block rubyore;
    public static Block sapphireore;
    public static Block silverore;
    public static Block orichalcumore;
    public static Block mithrilore;
    public static Block limestoneore;
    public static Block limestonebrick;
    public static Block marble;
    public static Block granite;
    public static Block marblebrick;
    public static Block granitebrick;
    public static final Block barleycrop = new BarleyCrop(2016);
    public static final ItemSeeds barleyseeds = (ItemSeeds)(new ItemSeeds(3021, barleycrop.blockID, Block.tilledField.blockID)).setUnlocalizedName("barleyseeds").func_111206_d("minecraftdenovo:barleyseeds");
    public static Item Barley;
    public static final Block cottoncrop = new CottonCrop(2017);
    public static final ItemSeeds cottonseeds = (ItemSeeds)(new ItemSeeds(3023, cottoncrop.blockID, Block.tilledField.blockID)).setUnlocalizedName("cottonseeds").func_111206_d("minecraftdenovo:cottonseeds");
    public static Item Cotton;
    public static final Block tomatocrop = new TomatoCrop(2018);
    public static final ItemSeeds tomatoseeds = (ItemSeeds)(new ItemSeeds(3024, tomatocrop.blockID, Block.tilledField.blockID)).setUnlocalizedName("tomatoseeds").func_111206_d("minecraftdenovo:tomatoseeds");
    public static Item Tomato;
    public static final Block turnipcrop = new TurnipCrop(2019);
    public static final ItemSeeds turnipseeds = (ItemSeeds)(new ItemSeeds(3025, turnipcrop.blockID, Block.tilledField.blockID)).setUnlocalizedName("turnipseeds").func_111206_d("minecraftdenovo:turnipseeds");
    public static Item Turnip;
    public static final Block cucumbercrop = new CucumberCrop(2020);
    public static final ItemSeeds cucumberSeeds = (ItemSeeds)(new ItemSeeds(3031, cucumbercrop.blockID, Block.tilledField.blockID)).setUnlocalizedName("cucumberseeds").func_111206_d("minecraftdenovo:cucumberseeds");
    public static Item Cucumber;
    public static final Block beetcrop = new beetCrop(2021);
    public static final ItemSeeds beetseeds = (ItemSeeds)(new ItemSeeds(3032, beetcrop.blockID, Block.tilledField.blockID)).setUnlocalizedName("beetseeds").func_111206_d("minecraftdenovo:beetseeds");
    public static Item Beet;

    @Init
    public void load(FMLInitializationEvent event)
    {
    	NetworkRegistry.instance().registerGuiHandler(this, this.proxy);
		instance = this;
		
		proxy.registerRenderThings();
        GameRegistry.registerTileEntity(TileEntityStoneAnvil.class, "TileEntityStoneAnvil");
		
		BastardSwordBladeDiamond = (new DenovoToolHead(4001)).setUnlocalizedName("bastardswordblade").func_111206_d("minecraftdenovo:bastardswordblade");
        LanguageRegistry.addName(BastardSwordBladeDiamond, "Diamond Bastard Sword Blade");
        BattleAxeHeadDiamond = (new DenovoToolHead(4002)).setUnlocalizedName("battleaxeheaddiamond").func_111206_d("minecraftdenovo:battleaxeheaddiamond");
        LanguageRegistry.addName(BattleAxeHeadDiamond, "Diamond Battleaxe Head");
        DaggerBladeDiamond = (new DenovoToolHead(4003)).setUnlocalizedName("daggerbladediamond").func_111206_d("minecraftdenovo:daggerbladediamond");
        LanguageRegistry.addName(DaggerBladeDiamond, "Diamond Dagger Blade");
		   	
        GameRegistry.registerWorldGenerator(new WorldGeneratorDeNovo());
        CopperIngot = (new DeNovoBasicItems(3001)).setUnlocalizedName("copperingot").func_111206_d("minecraftdenovo:copperingot");
        LanguageRegistry.addName(CopperIngot, "Copper Ingot");
        TinIngot = (new DeNovoBasicItems(3002)).setUnlocalizedName("tiningot").func_111206_d("minecraftdenovo:tiningot");
        LanguageRegistry.addName(TinIngot, "Tin Ingot");
        LeadIngot = (new DeNovoBasicItems(3003)).setUnlocalizedName("LeadIngot").func_111206_d("minecraftdenovo:leadingot");
        LanguageRegistry.addName(LeadIngot, "Lead Ingot");
        SilverIngot = (new DeNovoBasicItems(3004)).setUnlocalizedName("SilverIngot").func_111206_d("minecraftdenovo:silveringot");
        LanguageRegistry.addName(SilverIngot, "Silver Ingot");
        MithrilIngot = (new DeNovoBasicItems(3005)).setUnlocalizedName("MithrilIngot").func_111206_d("minecraftdenovo:mithrilingot");
        LanguageRegistry.addName(MithrilIngot, "Mithril Ingot");
        SteelIngot = (new DeNovoBasicItems(3006)).setUnlocalizedName("SteelIngot").func_111206_d("minecraftdenovo:steelingot");
        LanguageRegistry.addName(SteelIngot, "Steel Ingot");
        OrichalcumIngot = (new DeNovoBasicItems(3007)).setUnlocalizedName("OrichalcumIngot").func_111206_d("minecraftdenovo:orichalcumingot");
        LanguageRegistry.addName(OrichalcumIngot, "Orichalcum Ingot");
        BronzeIngot = (new DeNovoBasicItems(3008)).setUnlocalizedName("BronzeIngot").func_111206_d("minecraftdenovo:bronzeingot");
        LanguageRegistry.addName(BronzeIngot, "Bronze Ingot");
        OnyxGem = (new DeNovoBasicItems(3009)).setUnlocalizedName("OnyxGem").func_111206_d("minecraftdenovo:onyxgem");
        LanguageRegistry.addName(OnyxGem, "Onyx Gem");
        RubyGem = (new DeNovoBasicItems(3010)).setUnlocalizedName("RubyGem").func_111206_d("minecraftdenovo:rubygem");
        LanguageRegistry.addName(RubyGem, "Ruby Gem");
        SapphireGem = (new DeNovoBasicItems(3011)).setUnlocalizedName("SapphireGem").func_111206_d("minecraftdenovo:sapphiregem");
        LanguageRegistry.addName(SapphireGem, "Sapphire Gem");
        RawCopper = (new DeNovoBasicItems(3012)).setUnlocalizedName("RawCopper").func_111206_d("minecraftdenovo:rawcopper");
        LanguageRegistry.addName(RawCopper, "Raw Copper");
        RawLead = (new DeNovoBasicItems(3013)).setUnlocalizedName("RawLead").func_111206_d("minecraftdenovo:rawlead");
        LanguageRegistry.addName(RawLead, "Raw Lead");
        RawMithril = (new DeNovoBasicItems(3014)).setUnlocalizedName("RawMithril").func_111206_d("minecraftdenovo:rawmithril");
        LanguageRegistry.addName(RawMithril, "Raw Mithril");
        RawOrichalcum = (new DeNovoBasicItems(3015)).setUnlocalizedName("RawOrichalcum").func_111206_d("minecraftdenovo:raworichalcum");
        LanguageRegistry.addName(RawOrichalcum, "Raw Orichalcum");
        RawSilver = (new DeNovoBasicItems(3016)).setUnlocalizedName("RawSilver").func_111206_d("minecraftdenovo:rawsilver");
        LanguageRegistry.addName(RawSilver, "Raw Silver");
        RawTin = (new DeNovoBasicItems(3017)).setUnlocalizedName("RawTin").func_111206_d("minecraftdenovo:rawtin");
        LanguageRegistry.addName(RawTin, "Raw Tin");
        UncutRuby = (new DeNovoBasicItems(3018)).setUnlocalizedName("UncutRuby").func_111206_d("minecraftdenovo:uncutruby");
        LanguageRegistry.addName(UncutRuby, "Uncut Ruby");
        UncutSapphire = (new DeNovoBasicItems(3019)).setUnlocalizedName("UncutSapphire").func_111206_d("minecraftdenovo:uncutsapphire");
        LanguageRegistry.addName(UncutSapphire, "Uncut Sapphire");
        UncutOnyx = (new DeNovoBasicItems(3020)).setUnlocalizedName("UncutOnyx").func_111206_d("minecraftdenovo:uncutonyx");
        LanguageRegistry.addName(UncutOnyx, "Uncut Onyx");
        Barley = (new DeNovoBasicItems(3022)).setUnlocalizedName("barley").func_111206_d("minecraftdenovo:barley");
        LanguageRegistry.addName(Barley, "Barley");
        Cotton = (new DeNovoBasicItems(3026)).setUnlocalizedName("Cotton").func_111206_d("minecraftdenovo:cotton");
        LanguageRegistry.addName(Cotton, "Cotton");
        Tomato = (new ItemFood(3027, 2, false)).setUnlocalizedName("tomato").func_111206_d("minecraftdenovo:tomato");
        LanguageRegistry.addName(Tomato, "Tomato");
        Turnip = (new ItemFood(3028, 1, false)).setUnlocalizedName("turnip").func_111206_d("minecraftdenovo:turnip");
        LanguageRegistry.addName(Turnip, "Turnip");
        Beet = (new ItemFood(3029, 1, false)).setUnlocalizedName("Beet").func_111206_d("minecraftdenovo:beet");
        LanguageRegistry.addName(Beet, "Beet");
        Cucumber = (new ItemFood(3030, 1, false)).setUnlocalizedName("Cucumber").func_111206_d("minecraftdenovo:cucumber");
        LanguageRegistry.addName(Cucumber, "Cucumber");
        copperore = (new DeNovoOre(2001, "copperore")).setUnlocalizedName("copperore").setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setResistance(10.0F).func_111022_d("minecraftdenovo:copperore");
        GameRegistry.registerBlock(copperore, "copperore");
        LanguageRegistry.addName(copperore, "Copper Ore");
        tinore = (new DeNovoOre(2002, "tinrore")).setUnlocalizedName("tinore").setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setResistance(10.0F).func_111022_d("minecraftdenovo:tinore");
        GameRegistry.registerBlock(tinore, "tinore");
        LanguageRegistry.addName(tinore, "Tin Ore");
        leadore = (new DeNovoOre(2003, "leadore")).setUnlocalizedName("leadore").setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setResistance(10.0F).func_111022_d("minecraftdenovo:leadore");
        GameRegistry.registerBlock(leadore, "leadore");
        LanguageRegistry.addName(leadore, "Lead Ore");
        onyxore = (new DeNovoOre(2004, "onyxore")).setUnlocalizedName("onyxore").setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setResistance(10.0F).func_111022_d("minecraftdenovo:onyxore");
        GameRegistry.registerBlock(onyxore, "onyxore");
        LanguageRegistry.addName(onyxore, "Onyx Ore");
        silverore = (new DeNovoOre(2005, "silverore")).setUnlocalizedName("silverore").setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setResistance(10.0F).func_111022_d("minecraftdenovo:silverore");
        GameRegistry.registerBlock(silverore, "silverore");
        LanguageRegistry.addName(silverore, "Silver Ore");
        mithrilore = (new DeNovoOre(2006, "mithrilore")).setUnlocalizedName("mithrilore").setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setResistance(10.0F).func_111022_d("minecraftdenovo:mithrilore");
        GameRegistry.registerBlock(mithrilore, "mithrilore");
        LanguageRegistry.addName(mithrilore, "Mithril Ore");
        sapphireore = (new DeNovoOre(2007, "sapphireore")).setUnlocalizedName("sapphireore").setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setResistance(10.0F).func_111022_d("minecraftdenovo:sapphireore");
        GameRegistry.registerBlock(sapphireore, "sapphireore");
        LanguageRegistry.addName(sapphireore, "Sapphire Ore");
        rubyore = (new DeNovoOre(2008, "rubyore")).setUnlocalizedName("rubyore").setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setResistance(10.0F).func_111022_d("minecraftdenovo:rubyore");
        GameRegistry.registerBlock(rubyore, "rubyore");
        LanguageRegistry.addName(rubyore, "Ruby Ore");
        orichalcumore = (new DeNovoOre(2009, "orichalcumore")).setUnlocalizedName("orichalcumore").setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setResistance(10.0F).func_111022_d("minecraftdenovo:orichalcumore");
        GameRegistry.registerBlock(orichalcumore, "orichalcumore");
        LanguageRegistry.addName(orichalcumore, "Orichalcum Ore");
        limestoneore = (new DeNovoBlock(2010, "limestoneore")).setUnlocalizedName("limestoneore").setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setResistance(10.0F).func_111022_d("minecraftdenovo:limestoneore");
        GameRegistry.registerBlock(limestoneore, "limestoneore");
        LanguageRegistry.addName(limestoneore, "Limestone");
        limestonebrick = (new DeNovoBlock(2011, "limestonebrick")).setUnlocalizedName("limestonebricks").setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setResistance(10.0F).func_111022_d("minecraftdenovo:limestonebricks");
        GameRegistry.registerBlock(limestonebrick, "limestonebrick");
        LanguageRegistry.addName(limestonebrick, "Limestone Brick");
        granite = (new DeNovoBlock(2012, "granite")).setUnlocalizedName("granite").setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setResistance(10.0F).func_111022_d("minecraftdenovo:granite");
        GameRegistry.registerBlock(granite, "granite");
        LanguageRegistry.addName(granite, "Granite");
        marble = (new DeNovoBlock(2013, "marble")).setUnlocalizedName("marble").setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setResistance(10.0F).func_111022_d("minecraftdenovo:marble");
        GameRegistry.registerBlock(marble, "marble");
        LanguageRegistry.addName(marble, "Marble");
        granitebrick = (new DeNovoBlock(2014, "granitebrick")).setUnlocalizedName("granitebricks").setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setResistance(10.0F).func_111022_d("minecraftdenovo:granitebricks");
        GameRegistry.registerBlock(granitebrick, "granitebrick");
        LanguageRegistry.addName(granitebrick, "Granite Brick");
        marblebrick = (new DeNovoBlock(2015, "marblebrick")).setUnlocalizedName("marblebricks").setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setResistance(10.0F).func_111022_d("minecraftdenovo:marblebricks");
        GameRegistry.registerBlock(marblebrick, "marblebrick");
        LanguageRegistry.addName(marblebrick, "Marble Brick");
        LanguageRegistry.addName(barleyseeds, "Barley Seeds");
        MinecraftForge.addGrassSeed(new ItemStack(barleyseeds), 10);
        GameRegistry.registerBlock(barleycrop, "barleycrop");
        LanguageRegistry.addName(cottonseeds, "Cotton Seeds");
        MinecraftForge.addGrassSeed(new ItemStack(cottonseeds), 10);
        GameRegistry.registerBlock(cottoncrop, "cottoncrop");
        LanguageRegistry.addName(tomatoseeds, "Tomato Seeds");
        MinecraftForge.addGrassSeed(new ItemStack(tomatoseeds), 10);
        GameRegistry.registerBlock(tomatocrop, "tomatocrop");
        LanguageRegistry.addName(turnipseeds, "Turnip Seeds");
        MinecraftForge.addGrassSeed(new ItemStack(turnipseeds), 10);
        GameRegistry.registerBlock(turnipcrop, "turnipcrop");
        LanguageRegistry.addName(cucumberSeeds, "Cucumber Seeds");
        MinecraftForge.addGrassSeed(new ItemStack(cucumberSeeds), 10);
        GameRegistry.registerBlock(cucumbercrop, "cucumbercrop");
        LanguageRegistry.addName(beetseeds, "Beet Seeds");
        MinecraftForge.addGrassSeed(new ItemStack(beetseeds), 10);
        GameRegistry.registerBlock(beetcrop, "beetcrop");
        GameRegistry.addRecipe(new ItemStack(limestonebrick), new Object[] {"xx", "xx", 'x', limestoneore});
        GameRegistry.addRecipe(new ItemStack(marblebrick), new Object[] {"xx", "xx", 'x', marble});
        GameRegistry.addRecipe(new ItemStack(granitebrick), new Object[] {"xx", "xx", 'x', granite});
        GameRegistry.addShapelessRecipe(new ItemStack(barleyseeds, 4), new Object[] {new ItemStack(Barley)});
        //anvil
        StoneAnvil = (new BlockStoneAnvil(2022)).setUnlocalizedName("stoneanvil").setHardness(3.0F).setStepSound(Block.soundWoodFootstep).setResistance(1.0F).func_111022_d("minecraftdenovo:stoneanvil");
        GameRegistry.registerBlock(StoneAnvil, "StoneAnvil");
        LanguageRegistry.addName(StoneAnvil, "Stone Anvil");
    }
}
