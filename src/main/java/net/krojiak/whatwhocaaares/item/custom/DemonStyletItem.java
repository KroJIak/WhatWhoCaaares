package net.krojiak.whatwhocaaares.item.custom;

import net.krojiak.whatwhocaaares.block.ModBlocks;
import net.minecraft.block.Block;

public class DemonStyletItem extends DoneStyletItem {

    public DemonStyletItem(Settings settings) {
        super(settings);
    }

    @Override
    public Block outputBlock() {
        return ModBlocks.DEMON_SYMBOL;
    }


}
