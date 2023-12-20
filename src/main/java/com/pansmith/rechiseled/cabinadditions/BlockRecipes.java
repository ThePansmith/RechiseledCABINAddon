package com.pansmith.rechiseled.cabinadditions;

import com.supermartijn642.core.generator.RecipeGenerator;
import com.supermartijn642.core.generator.ResourceCache;
import com.pansmith.rechiseled.cabinadditions.RechiseledCabinadditions;
import net.minecraftforge.common.Tags;

/**
 * Created 26/12/2021 by SuperMartijn642
 */
public class BlockRecipes extends RecipeGenerator {

    public BlockRecipes(ResourceCache cache){
        super("rechiseledcabinadditions", cache);
    }

    @Override
    public void generate(){
        this.shaped(RechiseledCabinadditions.agon_0)
                .pattern(" A")
                .pattern("B ")
                .input('A', Tags.Items.INGOTS_IRON)
                .input('B', Tags.Items.RODS_WOODEN)
                .unlockedBy(Tags.Items.INGOTS_IRON);
    }
}
