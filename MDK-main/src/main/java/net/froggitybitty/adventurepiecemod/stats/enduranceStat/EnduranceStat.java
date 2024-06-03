package net.froggitybitty.adventurepiecemod.stats.enduranceStat;

import net.froggitybitty.adventurepiecemod.stats.stamina.Stamina;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.entity.living.LivingHurtEvent;

import static net.froggitybitty.adventurepiecemod.stats.DataAttachmentProvider.*;

public class EnduranceStat {
    //public static float dmg;
    //public static float enduranceStat;
    //public static float enduranceExp;
    //public static float enduranceExpLevelUp;
    //public static float stamina;
    //public static float maxStamina;
//
    //public EnduranceStat(IEventBus modBus) {
    //    NeoForge.EVENT_BUS.addListener(EnduranceStat::onLivingHurt);
    //}
//
    //public static void addEnduranceExp(Player player, float addXp){
    //    player.setData(ENDURANCE_EXP, player.getData(ENDURANCE_EXP) + addXp);
    //}
    //public static void addEnduranceStat(Player player, int addLevel){
    //    player.setData(ENDURANCE_STAT, player.getData(ENDURANCE_STAT) + addLevel);
    //}
//
    //@SubscribeEvent
    //public static void onLivingHurt(LivingHurtEvent event){
    //    if (event.getEntity() instanceof Player player){
    //        if (!player.level().isClientSide){
    //            dmg = event.getAmount();
    //            addEnduranceExp(player, dmg);
    //            enduranceStat = player.getData(ENDURANCE_STAT);
    //            enduranceExp = player.getData(ENDURANCE_EXP);
    //            enduranceExpLevelUp = 100f + (enduranceStat * (enduranceStat * 0.35f));
    //            if (enduranceExp >= enduranceExpLevelUp) {
    //                addEnduranceStat(player, 1);
    //                enduranceExp -= enduranceExpLevelUp;
    //                setMaxHealth(player);
    //                player.setData(ENDURANCE_EXP, enduranceExp);
    //                enduranceStat = player.getData(ENDURANCE_STAT);
    //            }
//
    //            player.sendSystemMessage(Component.literal("Recieved " + dmg + " Damage"));
    //            player.sendSystemMessage(Component.literal("Endurance level: " + enduranceStat));
    //            player.sendSystemMessage(Component.literal("Endurance exp: " + enduranceExp));
    //            player.sendSystemMessage(Component.literal("Endurance exp Needed: " + enduranceExpLevelUp));
    //        }
    //    }
    //}
    //public static void setMaxHealth(Player player){
    //    double maxHealth = 20 + ((double) enduranceStat * 2);
    //    player.getAttribute(Attributes.MAX_HEALTH).setBaseValue(maxHealth);
    //}
}
