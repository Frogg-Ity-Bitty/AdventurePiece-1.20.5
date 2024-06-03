package net.froggitybitty.adventurepiecemod.stats.agilityStat;

import net.froggitybitty.adventurepiecemod.AdventurePieceMod;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.tick.ServerTickEvent;

import static net.froggitybitty.adventurepiecemod.stats.DataAttachmentProvider.*;

@Mod(AdventurePieceMod.MODID)
public class AgilityStat {
    //public static float agilityStat;
    //public static float agilityExp;
    //public static float agilityExpLevelUp;
    //public static int blockPosX;
    //public static int blockPosY;
    //public static int blockPosZ;
    //public static int blockPosX_old;
    //public static int blockPosY_old;
    //public static int blockPosZ_old;
    //public static int xDifference;
    //public static int yDifference;
    //public static int zDifference;
    //public static int blockPosChange;
//
    //public AgilityStat(IEventBus modBus) {
//
    //}
    //public static void addAgilityExp(Player player, float addXp){
    //    player.setData(AGILITY_EXP, player.getData(AGILITY_EXP) + addXp);
    //}
    //public static void addAgilityStat(Player player, float addLevel){
    //    player.setData(AGILITY_STAT, player.getData(AGILITY_STAT) + addLevel);
    //}
//
    //@SubscribeEvent
    //public static void onLivingJump2(ServerTickEvent.Post eventPost, Player player){
    //    if (player.onGround() || player.isInLiquid()){
    //        blockPosX = player.blockPosition().getX();
    //        blockPosY = player.blockPosition().getY();
    //        blockPosZ = player.blockPosition().getZ();
    //        blockPosX_old = player.getData(BLOCK_POS_X);
    //        blockPosY_old = player.getData(BLOCK_POS_Y);
    //        blockPosZ_old = player.getData(BLOCK_POS_Z);
    //        if (blockPosX != blockPosX_old || blockPosY != blockPosY_old || blockPosZ != blockPosZ_old) {
    //            xDifference = (blockPosX - blockPosX_old);
    //            yDifference = (blockPosY - blockPosY_old);
    //            zDifference = (blockPosZ - blockPosZ_old);
    //            if (xDifference < 0) {
    //                xDifference *= -1;
    //                blockPosChange += xDifference;
    //            }
    //            if (yDifference < 0) {
    //                yDifference *= -1;
    //                blockPosChange += yDifference;
    //            }
    //            if (zDifference < 0) {
    //                zDifference *= -1;
    //                blockPosChange += zDifference;
    //            }
    //            blockPosChange = xDifference + yDifference + zDifference;
    //            if (!player.level().isClientSide) {
    //                addAgilityExp(player, blockPosChange);
    //                agilityStat = player.getData(AGILITY_STAT);
    //                agilityExp = player.getData(AGILITY_EXP);
    //                agilityExpLevelUp = 100f + (agilityStat * (agilityStat * 0.5f));
    //                player.sendSystemMessage(Component.literal("Agility level: " + agilityStat));
    //                player.sendSystemMessage(Component.literal("Agility exp: " + agilityExp));
    //                player.sendSystemMessage(Component.literal("Agility exp Needed: " + agilityExpLevelUp));
    //                if (agilityExp >= agilityExpLevelUp) {
    //                    addAgilityStat(player, 1);
    //                    agilityExp -= agilityExpLevelUp;
    //                    player.setData(AGILITY_EXP, agilityExp);
    //                    setBaseSpeed(player);
    //                    setBaseFallDamage(player);
    //                    setBaseAttackSpeed(player);
    //                }
    //            }
    //        }
    //        blockPosX_old = player.blockPosition().getX(); blockPosY_old = player.blockPosition().getY(); blockPosZ_old = player.blockPosition().getZ();
    //        player.setData(BLOCK_POS_X, blockPosX_old); player.setData(BLOCK_POS_Y, blockPosY_old); player.setData(BLOCK_POS_Z, blockPosZ_old);
    //    }
    //}
    //
    //public static void setBaseSpeed(Player player){
    //    agilityStat = player.getData(AGILITY_STAT);
    //    double movementSpeedModifier = 0.1d + (0.001 * agilityStat);
    //    player.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(movementSpeedModifier);
    //}
    //public static void setBaseFallDamage(Player player){
    //    agilityStat = player.getData(AGILITY_STAT);
    //    double fallDamageMultiplier = 1 - ((agilityStat / 100)/ 3.333);
    //    player.getAttribute(Attributes.FALL_DAMAGE_MULTIPLIER).setBaseValue(fallDamageMultiplier);
    //}
    //public static void setBaseAttackSpeed(Player player){
    //    agilityStat = player.getData(AGILITY_STAT);
    //    double attackSpeedModifier = 4 + ((0.5 / 300) * agilityStat);
    //    player.getAttribute(Attributes.ATTACK_SPEED).setBaseValue(attackSpeedModifier);
    //}
}
