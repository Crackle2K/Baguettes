package net.crackle.baguette.init;

import net.crackle.baguette.Baguette;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static Item BAGUETTE;

    public static void init() {
        BAGUETTE = registerItem(new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoods.BAGUETTE).maxCount(64)), "baguette");
    }

    public static Item registerItem(Item item, String name) {
        return Registry.register(Registry.ITEM, new Identifier(Baguette.MOD_ID, name), item);
    }
}
