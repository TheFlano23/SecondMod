package io.github.theflano23.secondmod.item;

import io.github.theflano23.secondmod.SecondMod;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(modid = SecondMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab FLANO_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) { //makes a new creative mode tab
        FLANO_TAB = event.registerCreativeModeTab(new ResourceLocation(SecondMod.MOD_ID, "flano_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.BLACK_OPAL.get())) //sets tab icon to black opal
                        .title(Component.translatable("creativemodetab.flano_tab"))); //sets title to translation key in lang json file/s
    }

}
