package com.pansmith.rechiseled.cabinadditions;

import com.supermartijn642.core.item.CreativeItemGroup;
import com.supermartijn642.core.registry.GeneratorRegistrationHandler;
import com.supermartijn642.rechiseled.api.registration.RechiseledRegistration;
import net.minecraftforge.fml.common.Mod;

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


}
