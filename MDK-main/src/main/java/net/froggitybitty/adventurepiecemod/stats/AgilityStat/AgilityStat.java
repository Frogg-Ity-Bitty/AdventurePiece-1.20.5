package net.froggitybitty.adventurepiecemod.stats.AgilityStat;

import net.froggitybitty.adventurepiecemod.AdventurePieceMod;
import net.froggitybitty.adventurepiecemod.stats.strengthstat.StrengthStat;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.entity.living.LivingEvent;
import net.neoforged.neoforge.event.entity.living.LivingHurtEvent;

import static net.froggitybitty.adventurepiecemod.stats.DataAttachmentProvider.*;
import static net.froggitybitty.adventurepiecemod.stats.DataAttachmentProvider.STRENGTH_STAT;

@Mod(AdventurePieceMod.MODID)
public class AgilityStat {
    public static float agilityStat;
    public static float agilityExp;
    public static float agilityExpLevelUp;
    public static int blockPosX;
    public static int blockPosY;
    public static int blockPosZ;
    public static int blockPosChange;

    public AgilityStat(IEventBus modBus) {
        NeoForge.EVENT_BUS.addListener(AgilityStat::onLivingJump2);
    }
    public static void addAgilityExp(Player player, float addXp){
        player.setData(AGILITY_EXP, player.getData(AGILITY_EXP) + addXp);
    }
    public static void addAgilityStat(Player player, float addLevel){
        player.setData(AGILITY_STAT, player.getData(AGILITY_STAT) + addLevel);
    }

    @SubscribeEvent
    public static void onLivingJump2(LivingEvent.LivingJumpEvent event){
        if (event.getEntity() instanceof Player player){
            if (!player.level().isClientSide){
                addAgilityExp(player, 1f);
                agilityStat = player.getData(AGILITY_STAT);
                agilityExp = player.getData(AGILITY_EXP);
                agilityExpLevelUp = 1f; // + (agilityStat * (agilityStat * 0.5f));
                player.sendSystemMessage(Component.literal("Agility level: " + agilityStat));
                player.sendSystemMessage(Component.literal("Agility exp: " + agilityExp));
                player.sendSystemMessage(Component.literal("Agility exp Needed: " + agilityExpLevelUp));
                if (agilityExp >= agilityExpLevelUp) {
                    addAgilityStat(player, 1);
                    agilityExp -= agilityExpLevelUp;
                    player.setData(AGILITY_EXP, agilityExp);
                    setBaseSpeed(player);
                    setBaseFallDamage(player);
                    setBaseAttackSpeed(player);
                }
            }
        }
    }
    
    public static void setBaseSpeed(Player player){
        agilityStat = player.getData(AGILITY_STAT);
        double movementSpeedModifier = 0.7d + (0.007 * agilityStat);
        player.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(movementSpeedModifier);
    }
    public static void setBaseFallDamage(Player player){
        agilityStat = player.getData(AGILITY_STAT);
        double fallDamageMultiplier = 1 - ((agilityStat / 100)/ 3.333);
        player.getAttribute(Attributes.FALL_DAMAGE_MULTIPLIER).setBaseValue(fallDamageMultiplier);
    }
    public static void setBaseAttackSpeed(Player player){
        agilityStat = player.getData(AGILITY_STAT);
        double attackSpeedModifier = 4 + ((4d / 300) * agilityStat);
        player.getAttribute(Attributes.ATTACK_SPEED).setBaseValue(attackSpeedModifier);
    }
}
