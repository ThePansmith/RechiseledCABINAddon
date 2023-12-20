package com.pansmith.rechiseled.cabinadditions;

import com.supermartijn642.core.generator.RecipeGenerator;
import com.supermartijn642.core.generator.ResourceCache;
import com.pansmith.rechiseled.cabinadditions.RechiseledCabinadditions;
import com.supermartijn642.core.registry.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.Tags;

/**
 * Created 26/12/2021 by SuperMartijn642
 */
public class BlockRecipes extends RecipeGenerator {

    public BlockRecipes(ResourceCache cache) {
        super("rechiseledcabinadditions", cache);
    }

    @Override
    public void generate() {
        this.shaped(Blocks.AGON_0.getRegularBlock(), 16)
                .pattern("SCS")
                .pattern("CSC")
                .pattern("SCS")
                .input('S', Tags.Items.STONE)
                .input('C', Tags.Items.COBBLESTONE);

        this.shaped(Blocks.BITT_0.getRegularBlock(), 16)
                .pattern("CSC")
                .pattern("SCS")
                .pattern("CSC")
                .input('S', Tags.Items.STONE)
                .input('C', Tags.Items.COBBLESTONE);

        this.shaped(Blocks.GLAXX_0.getRegularBlock(), 16)
                .pattern(" G ")
                .pattern("G G")
                .pattern(" G ")
                .input('G', Tags.Items.GLASS);

        this.shaped(Blocks.CHECKERTILE.getRegularBlock(), 16)
                .pattern("SSS")
                .pattern("SQS")
                .pattern("SSS")
                .input('S', Tags.Items.STONE)
                .input('Q', Tags.Items.GEMS_QUARTZ);

        this.shaped(Blocks.ANTIBLOCK_WHITE.getRegularBlock(), 8)
                .pattern("SSS")
                .pattern("SGS")
                .pattern("SSS")
                .input('S', Tags.Items.STONE)
                .input('G', Tags.Items.DUSTS_GLOWSTONE);

        this.shaped(Blocks.CIRCUIT.getRegularBlock(), 16)
                .pattern("ISI")
                .pattern("S S")
                .pattern("ISI")
                .input('S', Tags.Items.STONE)
                .input('I', Tags.Items.INGOTS_IRON);

        this.shaped(Blocks.CABLES.getRegularBlock(), 16)
                .pattern("ISI")
                .pattern("S S")
                .pattern("ISI")
                .input('S', Tags.Items.STONE)
                .input('I', Tags.Items.INGOTS_COPPER);

        this.shaped(Blocks.ENGINEERING.getRegularBlock(), 16)
                .pattern("ISI")
                .pattern("S S")
                .pattern("ISI")
                .input('S', Tags.Items.STONE)
                .input('I', Tags.Items.INGOTS_GOLD);

        this.shaped(Blocks.ARCANE_RAW.getRegularBlock(), 16)
                .pattern("DC")
                .pattern("CD")
                .input('D', Tags.Items.COBBLESTONE_DEEPSLATE)
                .input('C', () -> Items.COAL);

        this.shaped(Blocks.ARCANE_SMALL_BRICK.getRegularBlock(), 16)
                .pattern("AA")
                .pattern("AA")
                .input('A', Registries.ITEMS.getValue(new ResourceLocation("rechiseledcabinadditions", "arcane_raw")));
    }
}