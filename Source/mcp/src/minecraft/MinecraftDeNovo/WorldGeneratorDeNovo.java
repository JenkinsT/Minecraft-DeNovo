package MinecraftDeNovo;

import cpw.mods.fml.common.IWorldGenerator;
import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class WorldGeneratorDeNovo implements IWorldGenerator
{
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        switch (world.provider.dimensionId)
        {
            case 0:
                this.generatetin(world, random, chunkX * 16, chunkZ * 16);
                this.generatecopper(world, random, chunkX * 16, chunkZ * 16);
                this.generatesilver(world, random, chunkX * 16, chunkZ * 16);
                this.generatelead(world, random, chunkX * 16, chunkZ * 16);
                this.generateorichalcum(world, random, chunkX * 16, chunkZ * 16);
                this.generatemithril(world, random, chunkX * 16, chunkZ * 16);
                this.generateruby(world, random, chunkX * 16, chunkZ * 16);
                this.generatesapphire(world, random, chunkX * 16, chunkZ * 16);
                this.generateonyx(world, random, chunkX * 16, chunkZ * 16);
                this.generatelimestone(world, random, chunkX * 16, chunkZ * 16);

            default:
        }
    }

    private void generatecopper(World world, Random random, int BlockX, int BlockZ)
    {
        for (int a = 0; a < 16; ++a)
        {
            int Xcoord = BlockX + random.nextInt(16);
            int Zcoord = BlockZ + random.nextInt(16);
            int Ycoord = random.nextInt(64);
            (new WorldGenMinable(Main.copperore.blockID, 8)).generate(world, random, Xcoord, Ycoord, Zcoord);
        }
    }

    private void generatetin(World world, Random random, int BlockX, int BlockZ)
    {
        for (int b = 0; b < 20; ++b)
        {
            int Xcoord = BlockX + random.nextInt(16);
            int Zcoord = BlockZ + random.nextInt(16);
            int Ycoord = random.nextInt(10);
            (new WorldGenMinable(Main.tinore.blockID, 8)).generate(world, random, Xcoord, Ycoord, Zcoord);
        }
    }

    private void generatelead(World world, Random random, int BlockX, int BlockZ)
    {
        for (int c = 0; c < 12; ++c)
        {
            int Xcoord = BlockX + random.nextInt(16);
            int Zcoord = BlockZ + random.nextInt(16);
            int Ycoord = random.nextInt(64);
            (new WorldGenMinable(Main.leadore.blockID, 8)).generate(world, random, Xcoord, Ycoord, Zcoord);
        }
    }

    private void generatesilver(World world, Random random, int BlockX, int BlockZ)
    {
        for (int d = 0; d < 8; ++d)
        {
            int Xcoord = BlockX + random.nextInt(16);
            int Zcoord = BlockZ + random.nextInt(16);
            int Ycoord = random.nextInt(48);
            (new WorldGenMinable(Main.silverore.blockID, 8)).generate(world, random, Xcoord, Ycoord, Zcoord);
        }
    }

    private void generateorichalcum(World world, Random random, int BlockX, int BlockZ)
    {
        for (int e = 0; e < 2; ++e)
        {
            int Xcoord = BlockX + random.nextInt(16);
            int Zcoord = BlockZ + random.nextInt(16);
            int Ycoord = random.nextInt(16);
            (new WorldGenMinable(Main.orichalcumore.blockID, 8)).generate(world, random, Xcoord, Ycoord, Zcoord);
        }
    }

    private void generatemithril(World world, Random random, int BlockX, int BlockZ)
    {
        for (int f = 0; f < 4; ++f)
        {
            int Xcoord = BlockX + random.nextInt(16);
            int Zcoord = BlockZ + random.nextInt(16);
            int Ycoord = random.nextInt(16);
            (new WorldGenMinable(Main.mithrilore.blockID, 8)).generate(world, random, Xcoord, Ycoord, Zcoord);
        }
    }

    private void generateruby(World world, Random random, int BlockX, int BlockZ)
    {
        for (int g = 0; g < 4; ++g)
        {
            int Xcoord = BlockX + random.nextInt(16);
            int Zcoord = BlockZ + random.nextInt(16);
            int Ycoord = random.nextInt(32);
            (new WorldGenMinable(Main.rubyore.blockID, 8)).generate(world, random, Xcoord, Ycoord, Zcoord);
        }
    }

    private void generatesapphire(World world, Random random, int BlockX, int BlockZ)
    {
        for (int h = 0; h < 4; ++h)
        {
            int Xcoord = BlockX + random.nextInt(16);
            int Zcoord = BlockZ + random.nextInt(16);
            int Ycoord = random.nextInt(32);
            (new WorldGenMinable(Main.sapphireore.blockID, 8)).generate(world, random, Xcoord, Ycoord, Zcoord);
        }
    }

    private void generateonyx(World world, Random random, int BlockX, int BlockZ)
    {
        for (int k = 0; k < 4; ++k)
        {
            int Xcoord = BlockX + random.nextInt(16);
            int Zcoord = BlockZ + random.nextInt(16);
            int Ycoord = random.nextInt(32);
            (new WorldGenMinable(Main.onyxore.blockID, 8)).generate(world, random, Xcoord, Ycoord, Zcoord);
        }
    }

    private void generatelimestone(World world, Random random, int BlockX, int BlockZ)
    {
        for (int k = 0; k < 20; ++k)
        {
            int Xcoord = BlockX + random.nextInt(16);
            int Zcoord = BlockZ + random.nextInt(16);
            int Ycoord = random.nextInt(50);
            (new WorldGenMinable(Main.limestoneore.blockID, 10)).generate(world, random, Xcoord, Ycoord, Zcoord);
        }
    }

    private void generatemarble(World world, Random random, int BlockX, int BlockZ)
    {
        for (int k = 0; k < 20; ++k)
        {
            int Xcoord = BlockX + random.nextInt(16);
            int Zcoord = BlockZ + random.nextInt(16);
            int Ycoord = random.nextInt(50);
            (new WorldGenMinable(Main.marble.blockID, 10)).generate(world, random, Xcoord, Ycoord, Zcoord);
        }
    }

    private void generategranite(World world, Random random, int BlockX, int BlockZ)
    {
        for (int k = 0; k < 20; ++k)
        {
            int Xcoord = BlockX + random.nextInt(16);
            int Zcoord = BlockZ + random.nextInt(16);
            int Ycoord = random.nextInt(50);
            (new WorldGenMinable(Main.granite.blockID, 10)).generate(world, random, Xcoord, Ycoord, Zcoord);
        }
    }
}
