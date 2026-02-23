package com.dmitrik.notebook;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class DmitrikNotebookMod implements ModInitializer {
    public static final String MOD_ID = "dmitrik.notebook";

    // Блок
    public static final Block NOTEBOOK_BLOCK = new Block(FabricBlockSettings.create()
            .strength(2.0f, 6.0f)
            .sounds(BlockSoundGroup.STONE));

    // Предмет блока
    public static final Item NOTEBOOK_ITEM = new BlockItem(NOTEBOOK_BLOCK,
            new FabricItemSettings());

    @Override
    public void onInitialize() {
        // Регистрация блока
        Registry.register(Registries.BLOCK,
                new Identifier(MOD_ID, "notebook"), NOTEBOOK_BLOCK);

        // Регистрация предмета
        Registry.register(Registries.ITEM,
                new Identifier(MOD_ID, "notebook"), NOTEBOOK_ITEM);

        // Добавление в группу предметов
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(content -> content.add(NOTEBOOK_ITEM));
    }
}