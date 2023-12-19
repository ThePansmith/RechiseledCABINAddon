package com.pansmith.rechiseled.cabinadditions;

import com.supermartijn642.core.item.CreativeItemGroup;
import com.supermartijn642.core.registry.GeneratorRegistrationHandler;
import com.supermartijn642.rechiseled.ChiselItem;
import com.supermartijn642.rechiseled.api.registration.RechiseledRegistration;
import net.minecraftforge.fml.common.Mod;
import com.supermartijn642.core.CommonUtils;
import com.supermartijn642.core.gui.BaseContainerType;
import com.supermartijn642.core.item.CreativeItemGroup;
import com.supermartijn642.core.network.PacketChannel;
import com.supermartijn642.core.registry.GeneratorRegistrationHandler;
import com.supermartijn642.core.registry.RegistrationHandler;
import com.supermartijn642.core.registry.RegistryEntryAcceptor;
import com.supermartijn642.rechiseled.api.blocks.RechiseledBlockType;
import com.supermartijn642.rechiseled.api.registration.RechiseledRegistration;
import com.supermartijn642.rechiseled.chiseling.PacketChiselingRecipes;
import com.supermartijn642.rechiseled.data.RechiseledItemModelGenerator;
import com.supermartijn642.rechiseled.data.RechiseledLanguageGenerator;
import com.supermartijn642.rechiseled.data.RechiseledRecipeGenerator;
import com.supermartijn642.rechiseled.data.RechiseledTextureProvider;
import com.supermartijn642.rechiseled.packet.PacketChiselAll;
import com.supermartijn642.rechiseled.packet.PacketSelectEntry;
import com.supermartijn642.rechiseled.packet.PacketToggleConnecting;
import com.supermartijn642.rechiseled.screen.ChiselContainer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 * Created 25/04/2023 by SuperMartijn642
 */
@Mod(RechiseledCabinadditions.MODID)
public class RechiseledCabinadditions {

    public static final String MODID = "rechiseledcabinadditions";
    public static final RechiseledRegistration REGISTRATION = RechiseledRegistration.get(MODID);
    @SuppressWarnings("Convert2MethodRef")
    public static final CreativeItemGroup GROUP = (CreativeItemGroup)REGISTRATION.itemGroup(() -> Blocks.AGON_14.getRegularBlock(), "Rechiseled: CABIN additions");

    public RechiseledCabinadditions(){
        // Make sure the blocks get loaded
        Blocks.init();
        Recipes.init();

        // Register data providers for generating all the json files
        GeneratorRegistrationHandler.get("rechiseledcabinadditions");
        REGISTRATION.registerDataProviders();

    }
    public static void register(){
        RegistrationHandler handler = RegistrationHandler.get("rechiseledcabinadditions");
    }
    private static void registerGenerators(){
        GeneratorRegistrationHandler handler = GeneratorRegistrationHandler.get("rechiseledcabinadditions");
        handler.addGenerator(BlockRecipes::new);
        REGISTRATION.registerDataProviders();
    }
}
