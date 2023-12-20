package com.pansmith.rechiseled.cabinadditions;

import com.supermartijn642.core.registry.Registries;
import com.supermartijn642.rechiseled.api.blocks.RechiseledBlockBuilder;
import com.supermartijn642.rechiseled.api.blocks.RechiseledBlockType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

import static com.supermartijn642.rechiseled.api.blocks.BlockSpecification.GLASS;
import static com.supermartijn642.rechiseled.api.blocks.BlockSpecification.GLASS_PILLAR;

/**
 * Created 25/04/2023 by SuperMartijn642
 */
@SuppressWarnings("unused")
public class Blocks {

    // Agon
    public static final RechiseledBlockType AGON_0 = create("agon_0", "Agon 0", () -> net.minecraft.world.level.block.Blocks.STONE).noConnectingVariant().recipe(Recipes.AGON).build();
    public static final RechiseledBlockType AGON_1 = create("agon_1", "Agon 1", () -> net.minecraft.world.level.block.Blocks.STONE).noConnectingVariant().recipe(Recipes.AGON).build();
    public static final RechiseledBlockType AGON_2 = create("agon_2", "Agon 2", () -> net.minecraft.world.level.block.Blocks.STONE).noConnectingVariant().recipe(Recipes.AGON).build();
    public static final RechiseledBlockType AGON_3 = create("agon_3", "Agon 3", () -> net.minecraft.world.level.block.Blocks.STONE).noConnectingVariant().recipe(Recipes.AGON).build();
    public static final RechiseledBlockType AGON_4 = create("agon_4", "Agon 4", () -> net.minecraft.world.level.block.Blocks.STONE).noConnectingVariant().recipe(Recipes.AGON).build();
    public static final RechiseledBlockType AGON_5 = create("agon_5", "Agon 5", () -> net.minecraft.world.level.block.Blocks.STONE).noConnectingVariant().recipe(Recipes.AGON).build();
    public static final RechiseledBlockType AGON_6 = create("agon_6", "Agon 6", () -> net.minecraft.world.level.block.Blocks.STONE).noConnectingVariant().recipe(Recipes.AGON).build();
    public static final RechiseledBlockType AGON_7 = create("agon_7", "Agon 7", () -> net.minecraft.world.level.block.Blocks.STONE).noConnectingVariant().recipe(Recipes.AGON).build();
    public static final RechiseledBlockType AGON_8 = create("agon_8", "Agon 8", () -> net.minecraft.world.level.block.Blocks.STONE).noConnectingVariant().recipe(Recipes.AGON).build();
    public static final RechiseledBlockType AGON_9 = create("agon_9", "Agon 9", () -> net.minecraft.world.level.block.Blocks.STONE).noConnectingVariant().recipe(Recipes.AGON).build();
    public static final RechiseledBlockType AGON_10 = create("agon_10", "Agon 10", () -> net.minecraft.world.level.block.Blocks.STONE).noConnectingVariant().recipe(Recipes.AGON).build();
    public static final RechiseledBlockType AGON_11 = create("agon_11", "Agon 11", () -> net.minecraft.world.level.block.Blocks.STONE).noConnectingVariant().recipe(Recipes.AGON).build();
    public static final RechiseledBlockType AGON_12 = create("agon_12", "Agon 12", () -> net.minecraft.world.level.block.Blocks.STONE).noConnectingVariant().recipe(Recipes.AGON).build();
    public static final RechiseledBlockType AGON_13 = create("agon_13", "Agon 13", () -> net.minecraft.world.level.block.Blocks.STONE).noConnectingVariant().recipe(Recipes.AGON).build();
    public static final RechiseledBlockType AGON_14 = create("agon_14", "Agon 14", () -> net.minecraft.world.level.block.Blocks.STONE).noConnectingVariant().recipe(Recipes.AGON).build();
    public static final RechiseledBlockType AGON_15 = create("agon_15", "Agon 15", () -> net.minecraft.world.level.block.Blocks.STONE).noConnectingVariant().recipe(Recipes.AGON).build();
    // Bitt
    public static final RechiseledBlockType BITT_0 = create("bitt_0", "Bitt 0", () -> net.minecraft.world.level.block.Blocks.STONE).noConnectingVariant().recipe(Recipes.BITT).build();
    public static final RechiseledBlockType BITT_1 = create("bitt_1", "Bitt 1", () -> net.minecraft.world.level.block.Blocks.STONE).noConnectingVariant().recipe(Recipes.BITT).build();
    public static final RechiseledBlockType BITT_2 = create("bitt_2", "Bitt 2", () -> net.minecraft.world.level.block.Blocks.STONE).noConnectingVariant().recipe(Recipes.BITT).build();
    public static final RechiseledBlockType BITT_3 = create("bitt_3", "Bitt 3", () -> net.minecraft.world.level.block.Blocks.STONE).noConnectingVariant().recipe(Recipes.BITT).build();
    public static final RechiseledBlockType BITT_4 = create("bitt_4", "Bitt 4", () -> net.minecraft.world.level.block.Blocks.STONE).noConnectingVariant().recipe(Recipes.BITT).build();
    public static final RechiseledBlockType BITT_5 = create("bitt_5", "Bitt 5", () -> net.minecraft.world.level.block.Blocks.STONE).noConnectingVariant().recipe(Recipes.BITT).build();
    public static final RechiseledBlockType BITT_6 = create("bitt_6", "Bitt 6", () -> net.minecraft.world.level.block.Blocks.STONE).noConnectingVariant().recipe(Recipes.BITT).build();
    public static final RechiseledBlockType BITT_7 = create("bitt_7", "Bitt 7", () -> net.minecraft.world.level.block.Blocks.STONE).noConnectingVariant().recipe(Recipes.BITT).build();
    public static final RechiseledBlockType BITT_8 = create("bitt_8", "Bitt 8", () -> net.minecraft.world.level.block.Blocks.STONE).noConnectingVariant().recipe(Recipes.BITT).build();
    public static final RechiseledBlockType BITT_9 = create("bitt_9", "Bitt 9", () -> net.minecraft.world.level.block.Blocks.STONE).noConnectingVariant().recipe(Recipes.BITT).build();
    public static final RechiseledBlockType BITT_20 = create("bitt_10", "Bitt 10", () -> net.minecraft.world.level.block.Blocks.STONE).noConnectingVariant().recipe(Recipes.BITT).build();
    public static final RechiseledBlockType BITT_11 = create("bitt_11", "Bitt 11", () -> net.minecraft.world.level.block.Blocks.STONE).noConnectingVariant().recipe(Recipes.BITT).build();
    public static final RechiseledBlockType BITT_12 = create("bitt_12", "Bitt 12", () -> net.minecraft.world.level.block.Blocks.STONE).noConnectingVariant().recipe(Recipes.BITT).build();
    public static final RechiseledBlockType BITT_13 = create("bitt_13", "Bitt 13", () -> net.minecraft.world.level.block.Blocks.STONE).noConnectingVariant().recipe(Recipes.BITT).build();
    public static final RechiseledBlockType BITT_14 = create("bitt_14", "Bitt 14", () -> net.minecraft.world.level.block.Blocks.STONE).noConnectingVariant().recipe(Recipes.BITT).build();
    public static final RechiseledBlockType BITT_15 = create("bitt_15", "Bitt 15", () -> net.minecraft.world.level.block.Blocks.STONE).noConnectingVariant().recipe(Recipes.BITT).build();
    // Glaxx
    public static final RechiseledBlockType GLAXX_0 = createGlass("glaxx_0", "Glaxx 0", () -> net.minecraft.world.level.block.Blocks.GLASS).noConnectingVariant().recipe(Recipes.GLAXX).build();
    public static final RechiseledBlockType GLAXX_1 = createGlass("glaxx_1", "Glaxx 1", () -> net.minecraft.world.level.block.Blocks.GLASS).noConnectingVariant().recipe(Recipes.GLAXX).build();
    public static final RechiseledBlockType GLAXX_2 = createGlass("glaxx_2", "Glaxx 2", () -> net.minecraft.world.level.block.Blocks.GLASS).noConnectingVariant().recipe(Recipes.GLAXX).build();
    public static final RechiseledBlockType GLAXX_3 = createGlass("glaxx_3", "Glaxx 3", () -> net.minecraft.world.level.block.Blocks.GLASS).noConnectingVariant().recipe(Recipes.GLAXX).build();
    public static final RechiseledBlockType GLAXX_4 = createGlass("glaxx_4", "Glaxx 4", () -> net.minecraft.world.level.block.Blocks.GLASS).noConnectingVariant().recipe(Recipes.GLAXX).build();
    public static final RechiseledBlockType GLAXX_5 = createGlass("glaxx_5", "Glaxx 5", () -> net.minecraft.world.level.block.Blocks.GLASS).noConnectingVariant().recipe(Recipes.GLAXX).build();
    public static final RechiseledBlockType GLAXX_6 = createGlass("glaxx_6", "Glaxx 6", () -> net.minecraft.world.level.block.Blocks.GLASS).noConnectingVariant().recipe(Recipes.GLAXX).build();
    public static final RechiseledBlockType GLAXX_7 = createGlass("glaxx_7", "Glaxx 7", () -> net.minecraft.world.level.block.Blocks.GLASS).noConnectingVariant().recipe(Recipes.GLAXX).build();
    public static final RechiseledBlockType GLAXX_8 = createGlass("glaxx_8", "Glaxx 8", () -> net.minecraft.world.level.block.Blocks.GLASS).noConnectingVariant().recipe(Recipes.GLAXX).build();
    public static final RechiseledBlockType GLAXX_9 = createGlass("glaxx_9", "Glaxx 9", () -> net.minecraft.world.level.block.Blocks.GLASS).noConnectingVariant().recipe(Recipes.GLAXX).build();
    public static final RechiseledBlockType GLAXX_10 = createGlass("glaxx_10", "Glaxx 10", () -> net.minecraft.world.level.block.Blocks.GLASS).noConnectingVariant().recipe(Recipes.GLAXX).build();
    public static final RechiseledBlockType GLAXX_11 = createGlass("glaxx_11", "Glaxx 11", () -> net.minecraft.world.level.block.Blocks.GLASS).noConnectingVariant().recipe(Recipes.GLAXX).build();
    public static final RechiseledBlockType GLAXX_12 = createGlass("glaxx_12", "Glaxx 12", () -> net.minecraft.world.level.block.Blocks.GLASS).noConnectingVariant().recipe(Recipes.GLAXX).build();
    public static final RechiseledBlockType GLAXX_13 = createGlass("glaxx_13", "Glaxx 13", () -> net.minecraft.world.level.block.Blocks.GLASS).noConnectingVariant().recipe(Recipes.GLAXX).build();
    public static final RechiseledBlockType GLAXX_14 = createGlass("glaxx_14", "Glaxx 14", () -> net.minecraft.world.level.block.Blocks.GLASS).noConnectingVariant().recipe(Recipes.GLAXX).build();
    public static final RechiseledBlockType GLAXX_15 = createGlass("glaxx_15", "Glaxx 15", () -> net.minecraft.world.level.block.Blocks.GLASS).noConnectingVariant().recipe(Recipes.GLAXX).build();
    // Lab
    public static final RechiseledBlockType CHECKERTILE = create("checkertile", "Laboratory (Checker tile)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.LAB).build();
    public static final RechiseledBlockType CLEARSCREEN = create("clearscreen", "Laboratory (Clears creen)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.LAB).build();
    public static final RechiseledBlockType DIRECTIONLEFT = create("directionleft-side", "Laboratory (Left Lab Arrow)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.LAB).build();
    public static final RechiseledBlockType DIRECTIONRIGHT = create("directionright-side", "Laboratory (Right Lab Arrow)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.LAB).build();
    public static final RechiseledBlockType DOTTEDPANEL = create("dottedpanel", "Laboratory (Dotted Panel)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.LAB).build();
    public static final RechiseledBlockType FLOORTILE = create("floortile", "Laboratory (Floor tile)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.LAB).build();
    public static final RechiseledBlockType FUZZSCREEN = create("fuzzscreen", "Laboratory (Fuzzy Screen)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.LAB).build();
    public static final RechiseledBlockType INFOCON = create("infocon-side", "Laboratory (Information Console)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.LAB).build();
    public static final RechiseledBlockType SMALLSTEEL = create("smallsteel-top", "Laboratory (Small Steel)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.LAB).build();
    public static final RechiseledBlockType SPIKESMALLSTEEL = create("smallsteel-side", "Laboratory (Spiked Small Steel)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.LAB).build();
    public static final RechiseledBlockType LARGESTEEL = create("largesteel-top", "Laboratory (Large Steel)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.LAB).build();
    public static final RechiseledBlockType SPIKEDLARGESTEEL = create("largesteel-side", "Laboratory (Spiked Large Steel)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.LAB).build();
    public static final RechiseledBlockType SMALLTILE = create("smalltile", "Laboratory (Small White Tile)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.LAB).build();
    public static final RechiseledBlockType LARGETILE = create("largetile", "Laboratory (Large White Tile)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.LAB).build();
    public static final RechiseledBlockType LARGEWALL = create("largewall", "Laboratory (Large White Tile Wall)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.LAB).build();
    public static final RechiseledBlockType WALLVENT = create("wallvents-side", "Laboratory (Wall Vent)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.LAB).build();
    public static final RechiseledBlockType ROUNDEL = create("roundel", "Laboratory (Roundel)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.LAB).build();
    // Antiblock
    public static final RechiseledBlockType ANTIBLOCK_WHITE = create("antiblock_white", "Antiblock (White)", () -> net.minecraft.world.level.block.Blocks.GLASS).noConnectingVariant().recipe(Recipes.ANTIBLOCK).build();
    public static final RechiseledBlockType ANTIBLOCK_RED = create("antiblock_red", "Antiblock (Red)", () -> net.minecraft.world.level.block.Blocks.GLASS).noConnectingVariant().recipe(Recipes.ANTIBLOCK).build();
    public static final RechiseledBlockType ANTIBLOCK_ORANGE = create("antiblock_orange", "Antiblock (Orange)", () -> net.minecraft.world.level.block.Blocks.GLASS).noConnectingVariant().recipe(Recipes.ANTIBLOCK).build();
    public static final RechiseledBlockType ANTIBLOCK_YELLOW = create("antiblock_yellow", "Antiblock (Yellow)", () -> net.minecraft.world.level.block.Blocks.GLASS).noConnectingVariant().recipe(Recipes.ANTIBLOCK).build();
    public static final RechiseledBlockType ANTIBLOCK_LIME = create("antiblock_lime", "Antiblock (Lime)", () -> net.minecraft.world.level.block.Blocks.GLASS).noConnectingVariant().recipe(Recipes.ANTIBLOCK).build();
    public static final RechiseledBlockType ANTIBLOCK_GREEN = create("antiblock_green", "Antiblock (Green)", () -> net.minecraft.world.level.block.Blocks.GLASS).noConnectingVariant().recipe(Recipes.ANTIBLOCK).build();
    public static final RechiseledBlockType ANTIBLOCK_BLUE = create("antiblock_blue", "Antiblock (Blue)", () -> net.minecraft.world.level.block.Blocks.GLASS).noConnectingVariant().recipe(Recipes.ANTIBLOCK).build();
    public static final RechiseledBlockType ANTIBLOCK_CYAN = create("antiblock_cyan", "Antiblock (Cyan)", () -> net.minecraft.world.level.block.Blocks.GLASS).noConnectingVariant().recipe(Recipes.ANTIBLOCK).build();
    public static final RechiseledBlockType ANTIBLOCK_LIGHT_BLUE = create("antiblock_light_blue", "Antiblock (Light Blue)", () -> net.minecraft.world.level.block.Blocks.GLASS).noConnectingVariant().recipe(Recipes.ANTIBLOCK).build();
    public static final RechiseledBlockType ANTIBLOCK_MAGENTA = create("antiblock_magenta", "Antiblock (Magenta)", () -> net.minecraft.world.level.block.Blocks.GLASS).noConnectingVariant().recipe(Recipes.ANTIBLOCK).build();
    public static final RechiseledBlockType ANTIBLOCK_PURPLE = create("antiblock_purple", "Antiblock (Purple)", () -> net.minecraft.world.level.block.Blocks.GLASS).noConnectingVariant().recipe(Recipes.ANTIBLOCK).build();
    public static final RechiseledBlockType ANTIBLOCK_PINK = create("antiblock_pink", "Antiblock (Pink)", () -> net.minecraft.world.level.block.Blocks.GLASS).noConnectingVariant().recipe(Recipes.ANTIBLOCK).build();
    public static final RechiseledBlockType ANTIBLOCK_LIGHT_GRAY = create("antiblock_light_gray", "Antiblock (Light Gray)", () -> net.minecraft.world.level.block.Blocks.GLASS).noConnectingVariant().recipe(Recipes.ANTIBLOCK).build();
    public static final RechiseledBlockType ANTIBLOCK_GRAY = create("antiblock_gray", "Antiblock (Gray)", () -> net.minecraft.world.level.block.Blocks.GLASS).noConnectingVariant().recipe(Recipes.ANTIBLOCK).build();
    public static final RechiseledBlockType ANTIBLOCK_BLACK = create("antiblock_black", "Antiblock (Black)", () -> net.minecraft.world.level.block.Blocks.GLASS).noConnectingVariant().recipe(Recipes.ANTIBLOCK).build();
    public static final RechiseledBlockType ANTIBLOCK_BROWN = create("antiblock_brown", "Antiblock (Brown)", () -> net.minecraft.world.level.block.Blocks.GLASS).noConnectingVariant().recipe(Recipes.ANTIBLOCK).build();
    //Factory
    public static final RechiseledBlockType CIRCUIT = create("circuit", "Factory (Circuit)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.FACTORY).build();
    public static final RechiseledBlockType DOTS = create("dots", "Factory (Dots)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.FACTORY).build();
    public static final RechiseledBlockType FRAMEBLUE = create("frameblue", "Factory (Frame Blue)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.FACTORY).build();
    public static final RechiseledBlockType GOLDPLATE = create("goldplate", "Factory (Gold Plate)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.FACTORY).build();
    public static final RechiseledBlockType GOLDPLATING = create("goldplating", "Factory (Gold Plating)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.FACTORY).build();
    public static final RechiseledBlockType GRINDER = create("grinder", "Factory (Grinder)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.FACTORY).build();
    public static final RechiseledBlockType HAZARD = create("hazard", "Factory (Hazard)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.FACTORY).build();
    public static final RechiseledBlockType HAZARDORANGE = create("hazardorange", "Factory (Hazard (Orange))", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.FACTORY).build();
    public static final RechiseledBlockType ICEICEICE = create("iceiceice", "Factory (Blue Plate)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.FACTORY).build();
    public static final RechiseledBlockType METALBOXSIDE = create("metalbox-side", "Factory (Metal Box Side)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.FACTORY).build();
    public static final RechiseledBlockType METALBOXTOP = create("metalbox-top", "Factory (Metal Box Top)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.FACTORY).build();
    public static final RechiseledBlockType PLATEX = create("platex", "Factory (Platex)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.FACTORY).build();
    public static final RechiseledBlockType PLATING = create("plating", "Factory (Plating)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.FACTORY).build();
    public static final RechiseledBlockType RUST = create("rust", "Factory (Rust)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.FACTORY).build();
    public static final RechiseledBlockType RUST2 = create("rust2", "Factory (Bolted Rust)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.FACTORY).build();
    public static final RechiseledBlockType RUSTPLATES = create("rustplates", "Factory (Plated Rust)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.FACTORY).build();
    public static final RechiseledBlockType TILEMOSAIC = create("tilemosaic", "Factory (Mosaic Tile)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.FACTORY).build();
    public static final RechiseledBlockType VENT = create("vent-side", "Factory (Vent)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.FACTORY).build();
    public static final RechiseledBlockType HEX = create("hexnew", "Factory (Hex)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.FACTORY).build();
    public static final RechiseledBlockType WIREFRAME = create("wireframe", "Factory (Wireframe)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.FACTORY).build();
    public static final RechiseledBlockType WIREFRAMEBLUE = create("wireframeblue", "Factory (Blue Wireframe)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.FACTORY).build();
    public static final RechiseledBlockType WIREFRAMEWHITE = create("wireframewhite", "Factory (White Wireframe)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.FACTORY).build();
    // Technical
    public static final RechiseledBlockType CABLES = create("cables", "Technical (Cables)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.TECHNICAL).build();
    public static final RechiseledBlockType CAUTIONTAPE = create("cautiontape", "Technical (Caution Tape)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.TECHNICAL).build();
    public static final RechiseledBlockType GRATE = create("grate", "Technical (Grate)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.TECHNICAL).build();
    public static final RechiseledBlockType GRATERUSTY = create("graterusty", "Technical (Rusty Grate)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.TECHNICAL).build();
    public static final RechiseledBlockType INDUSTRIALRELIC = create("industrialrelic", "Technical (Industrial Relic)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.TECHNICAL).build();
    public static final RechiseledBlockType INSULATION = create("insulationv2", "Technical (Insulation)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.TECHNICAL).build();
    public static final RechiseledBlockType PIPESLARGE = create("pipeslarge", "Technical (Large Pipes)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.TECHNICAL).build();
    public static final RechiseledBlockType PIPESSMALL = create("pipessmall", "Technical (Small Pipes)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.TECHNICAL).build();
    public static final RechiseledBlockType RUSTYBOLTEDPLATES = create("rustyboltedplates", "Technical (Rusty Bolted Plates)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.TECHNICAL).build();
    public static final RechiseledBlockType SCAFFOLD = create("scaffold", "Technical (Scaffold)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.TECHNICAL).build();
    public static final RechiseledBlockType SCAFFOLDTRANSPARENT = createGlass("scaffoldtransparent", "Technical (Transparent Scaffold)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.TECHNICAL).build();
    public static final RechiseledBlockType VENT2 = create("vent", "Technical (Vent)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.TECHNICAL).build();
    public static final RechiseledBlockType VENTGLOWING = create("ventglowing", "Technical (Glowing Vent)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.TECHNICAL).build();
    public static final RechiseledBlockType WIRES = create("wires", "Technical (Wires)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.TECHNICAL).build();
    // Engineering
    public static final RechiseledBlockType ENGINEERING = create("engineering", "Engineering (Machinery)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.ENGINEERING).build();
    public static final RechiseledBlockType ENGINEERINGPIPE = create("engineering_pipe", "Engineering (Pipes)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.ENGINEERING).build();
    public static final RechiseledBlockType EXHAUSTPLATING = create("exhaustplating", "Engineering (Exhaust Plating)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.ENGINEERING).build();
    public static final RechiseledBlockType MAKESHIFTPANELS = create("makeshiftpanels", "Engineering (Makeshift Panels)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.ENGINEERING).build();
    public static final RechiseledBlockType PIPING = create("piping", "Engineering (Piping)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.ENGINEERING).build();
    public static final RechiseledBlockType SCAFFOLDLARGE0 = create("scaffoldlarge_0", "Engineering (Scaffolding)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.ENGINEERING).build();
    public static final RechiseledBlockType SCAFFOLDLARGE = create("scaffoldlarge", "Engineering (Scaffolding)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.ENGINEERING).build();
    public static final RechiseledBlockType STURDY = create("sturdy", "Engineering (Sturdy)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.ENGINEERING).build();
    public static final RechiseledBlockType WEATHEREDPANELSGREEN = create("weatheredgreenpanels", "Engineering (Weathered Green Panels)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.ENGINEERING).build();
    public static final RechiseledBlockType WEATHEREDPANELSORANGE = create("weatheredorangepanels", "Engineering (Weathered Orange Panels)", () -> net.minecraft.world.level.block.Blocks.IRON_BLOCK).noConnectingVariant().recipe(Recipes.ENGINEERING).build();

    // Arcane
    public static final RechiseledBlockType ARCANE_RAW = create("arcane_raw", "Arcane Stone", () -> net.minecraft.world.level.block.Blocks.DEEPSLATE).noConnectingVariant().recipe(Recipes.ARCANE).build();
    public static final RechiseledBlockType ARCANE_ARRAY = create("arcane_array", "Arcane Stone (Array)", () -> net.minecraft.world.level.block.Blocks.DEEPSLATE).noConnectingVariant().recipe(Recipes.ARCANE).build();
    public static final RechiseledBlockType ARCANE_BRAID = create("arcane_braid", "Arcane Stone (Braid)", () -> net.minecraft.world.level.block.Blocks.DEEPSLATE).noConnectingVariant().recipe(Recipes.ARCANE).build();
    public static final RechiseledBlockType ARCANE_CHAOTIC_MEDIUM = create("arcane_chaotic_medium", "Arcane Stone (Chaotic Medium)", () -> net.minecraft.world.level.block.Blocks.DEEPSLATE).noConnectingVariant().recipe(Recipes.ARCANE).build();
    public static final RechiseledBlockType ARCANE_CHAOTIC_SMALL = create("arcane_chaotic_small", "Arcane Stone (Chaotic Small)", () -> net.minecraft.world.level.block.Blocks.DEEPSLATE).noConnectingVariant().recipe(Recipes.ARCANE).build();
    public static final RechiseledBlockType ARCANE_CIRCULAR = create("arcane_circular", "Arcane Stone (Circular)", () -> net.minecraft.world.level.block.Blocks.DEEPSLATE).noConnectingVariant().recipe(Recipes.ARCANE).build();
    public static final RechiseledBlockType ARCANE_CUTS = create("arcane_cuts", "Arcane Stone (Cuts)", () -> net.minecraft.world.level.block.Blocks.DEEPSLATE).noConnectingVariant().recipe(Recipes.ARCANE).build();
    public static final RechiseledBlockType ARCANE_DENT = create("arcane_dent", "Arcane Stone (Dent)", () -> net.minecraft.world.level.block.Blocks.DEEPSLATE).noConnectingVariant().recipe(Recipes.ARCANE).build();
    public static final RechiseledBlockType ARCANE_FRENCH = create("arcane_french", "Arcane Stone (French)", () -> net.minecraft.world.level.block.Blocks.DEEPSLATE).noConnectingVariant().recipe(Recipes.ARCANE).build();
    public static final RechiseledBlockType ARCANE_JELLYBEAN = create("arcane_jellybean", "Arcane Stone (Jellybean)", () -> net.minecraft.world.level.block.Blocks.DEEPSLATE).noConnectingVariant().recipe(Recipes.ARCANE).build();
    public static final RechiseledBlockType ARCANE_LAYERS = create("arcane_layers", "Arcane Stone (Layers)", () -> net.minecraft.world.level.block.Blocks.DEEPSLATE).noConnectingVariant().recipe(Recipes.ARCANE).build();
    public static final RechiseledBlockType ARCANE_MOSAIC = create("arcane_mosaic", "Arcane Stone (Mosaic)", () -> net.minecraft.world.level.block.Blocks.DEEPSLATE).noConnectingVariant().recipe(Recipes.ARCANE).build();
    public static final RechiseledBlockType ARCANE_ORNATE = create("arcane_ornate", "Arcane Stone (Ornate)", () -> net.minecraft.world.level.block.Blocks.DEEPSLATE).noConnectingVariant().recipe(Recipes.ARCANE).build();
    public static final RechiseledBlockType ARCANE_PANEL = create("arcane_panel", "Arcane Stone (Panel)", () -> net.minecraft.world.level.block.Blocks.DEEPSLATE).noConnectingVariant().recipe(Recipes.ARCANE).build();
    public static final RechiseledBlockType ARCANE_PILLAR = create("arcane_pillar", "Arcane Stone (Pillar)", () -> net.minecraft.world.level.block.Blocks.DEEPSLATE).noConnectingVariant().recipe(Recipes.ARCANE).build();
    public static final RechiseledBlockType ARCANE_ROAD = create("arcane_road", "Arcane Stone (Road)", () -> net.minecraft.world.level.block.Blocks.DEEPSLATE).noConnectingVariant().recipe(Recipes.ARCANE).build();
    public static final RechiseledBlockType ARCANE_SLANTED = create("arcane_slanted", "Arcane Stone (Slanted)", () -> net.minecraft.world.level.block.Blocks.DEEPSLATE).noConnectingVariant().recipe(Recipes.ARCANE).build();
    public static final RechiseledBlockType ARCANE_TILES_SMAlL = create("arcane_tiles_small", "Arcane Tiles (Small)", () -> net.minecraft.world.level.block.Blocks.DEEPSLATE).noConnectingVariant().recipe(Recipes.ARCANE).build();
    public static final RechiseledBlockType ARCANE_TILES_MEDIUM = create("arcane_tiles_medium", "Arcane Tiles (Medium)", () -> net.minecraft.world.level.block.Blocks.DEEPSLATE).noConnectingVariant().recipe(Recipes.ARCANE).build();
    public static final RechiseledBlockType ARCANE_TILES_LARGE = create("arcane_tiles_large", "Arcane Tiles (Large)", () -> net.minecraft.world.level.block.Blocks.DEEPSLATE).noConnectingVariant().recipe(Recipes.ARCANE).build();
    public static final RechiseledBlockType ARCANE_WEAVER = create("arcane_weaver", "Arcane Stone (Weaver)", () -> net.minecraft.world.level.block.Blocks.DEEPSLATE).noConnectingVariant().recipe(Recipes.ARCANE).build();
    public static final RechiseledBlockType ARCANE_ZAG = create("arcane_zag", "Arcane Stone (Zag)", () -> net.minecraft.world.level.block.Blocks.DEEPSLATE).noConnectingVariant().recipe(Recipes.ARCANE).build();
    //Arcane Brick
    public static final RechiseledBlockType ARCANE_SMALL_BRICK = create("arcane_small_bricks", "Arcane Bricks", () -> net.minecraft.world.level.block.Blocks.DEEPSLATE).noConnectingVariant().recipe(Recipes.ARCANEBRICK).build();
    public static final RechiseledBlockType ARCANE_CHAOTIC_BRICK = create("arcane_chaotic_bricks", "Arcane Bricks (Chaotic)", () -> net.minecraft.world.level.block.Blocks.DEEPSLATE).noConnectingVariant().recipe(Recipes.ARCANEBRICK).build();
    public static final RechiseledBlockType ARCANE_CRACKED_BRICK = create("arcane_cracked_bricks", "Arcane Bricks (Cracked)", () -> net.minecraft.world.level.block.Blocks.DEEPSLATE).noConnectingVariant().recipe(Recipes.ARCANEBRICK).build();
    public static final RechiseledBlockType ARCANE_ENCASED_BRICKS = create("arcane_encased_bricks", "Arcane Bricks (Encased)", () -> net.minecraft.world.level.block.Blocks.DEEPSLATE).noConnectingVariant().recipe(Recipes.ARCANEBRICK).build();
    public static final RechiseledBlockType ARCANE_SOFT_BRICKS = create("arcane_soft_bricks", "Arcane Bricks (Soft)", () -> net.minecraft.world.level.block.Blocks.DEEPSLATE).noConnectingVariant().recipe(Recipes.ARCANEBRICK).build();
    public static final RechiseledBlockType ARCANE_SOLID_BRICKS = create("arcane_solid_bricks", "Arcane Bricks (Solid)", () -> net.minecraft.world.level.block.Blocks.DEEPSLATE).noConnectingVariant().recipe(Recipes.ARCANEBRICK).build();
    public static final RechiseledBlockType ARCANE_TRIPLE_BRICKS = create("arcane_triple_bricks", "Arcane Bricks (Triple)", () -> net.minecraft.world.level.block.Blocks.DEEPSLATE).noConnectingVariant().recipe(Recipes.ARCANEBRICK).build();


    private static RechiseledBlockBuilder createWindow(String identifier, String translation, Supplier<? extends Block> parent){
        return create(identifier, translation, () -> net.minecraft.world.level.block.Blocks.GLASS).specification(GLASS_PILLAR);
    }

    private static RechiseledBlockBuilder createGlass(String identifier, String translation, Supplier<? extends Block> parent){
        return create(identifier, translation, () -> net.minecraft.world.level.block.Blocks.GLASS).specification(GLASS);
    }

    private static RechiseledBlockBuilder create(String identifier, String translation){
        return RechiseledCabinadditions.REGISTRATION.block(identifier).translation(translation);
    }

    private static RechiseledBlockBuilder create(String identifier, String translation, Supplier<? extends Block> parent){
        //noinspection unchecked
        return RechiseledCabinadditions.REGISTRATION.block(identifier).translation(translation).copyProperties((Supplier<Block>)parent).miningTagsFrom((Supplier<Block>)parent);
    }

    private static Supplier<Block> getBlock(String identifier){
        ResourceLocation location = new ResourceLocation(identifier);
        return () -> Registries.BLOCKS.getValue(location);
    }

    public static void init(){
        // Cause this class to be initialized
    }
}
