package com.pansmith.rechiseled.cabinadditions;

import com.supermartijn642.core.registry.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.ItemLike;

import java.util.function.Supplier;

/**
 * Created 25/04/2023 by SuperMartijn642
 */
public class Recipes {

    public static final ResourceLocation AGON = location("agon");
    public static final ResourceLocation BITT = location("bitt");
    public static final ResourceLocation GLAXX = location("glaxx");
    public static final ResourceLocation LAB = location("lab");
    public static final ResourceLocation ANTIBLOCK = location("antiblock");
    public static final ResourceLocation FACTORY = location("factory");
    public static final ResourceLocation TECHNICAL = location("technical");
    public static final ResourceLocation ENGINEERING = location("engineering");
    public static final ResourceLocation FUTURA = location("futura");
    public static final ResourceLocation ARCANE = location("arcane");
    public static final ResourceLocation ARCANEBRICK = location("arcanebrick");



    private static ResourceLocation location(String name){
        return new ResourceLocation(RechiseledCabinadditions.MODID, name);
    }

    private static ResourceLocation rechiseledLocation(String name){
        return new ResourceLocation(RechiseledCabinadditions.MODID, name);
    }

    private static Supplier<ItemLike> getBlock(String identifier){
        ResourceLocation location = new ResourceLocation(identifier);
        return () -> Registries.BLOCKS.getValue(location);
    }

    public static void init(){
    }
}
