package net.froggitybitty.adventurepiecemod.stats.strengthstat;

import net.froggitybitty.adventurepiecemod.AdventurePieceMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.components.ChatComponent;
import net.minecraft.client.multiplayer.chat.report.ReportEnvironment;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.network.chat.Component;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Explosion;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.entity.living.LivingDamageEvent;
import net.neoforged.neoforge.event.entity.living.LivingEvent;
import net.neoforged.neoforge.event.entity.living.LivingHurtEvent;

import java.awt.*;

import static net.froggitybitty.adventurepiecemod.stats.strengthstat.StrengthStatDataAttachment.STRENGTH_EXP;
import static net.froggitybitty.adventurepiecemod.stats.strengthstat.StrengthStatDataAttachment.STRENGTH_STAT;

@Mod(AdventurePieceMod.MODID)
public class StrengthStat {
    public static float playerDmg;
    public static float strengthStat;
    public static float strengthExp;
    public static float strengthExpLevelUp;

    public static void addStrengthExp(Player player, float addXp){
        player.setData(STRENGTH_EXP, player.getData(STRENGTH_EXP) + addXp);
    }
    public static void addStrengthStat(Player player, float number){
        player.setData(STRENGTH_STAT, player.getData(STRENGTH_STAT) + number);
    }

    @SubscribeEvent
    public static void detectDamage(LivingHurtEvent event){
        if (event.getSource().getEntity() instanceof Player player){
            if (!event.getSource().isIndirect()){
                playerDmg = event.getAmount();
                addStrengthExp(player, playerDmg);
                strengthStat = player.getData(STRENGTH_STAT);
                strengthExp = player.getData(STRENGTH_EXP);
                strengthExpLevelUp = 1f + (strengthStat * (strengthStat * 0.2f));
                if (strengthExp >= strengthExpLevelUp){
                    addStrengthStat(player, 1);
                    strengthExp -= strengthExpLevelUp;
                    setBaseDamage(player);
                }
            }
            player.displayClientMessage(Component.literal("Detected " + playerDmg + " Damage"), true);
            player.displayClientMessage(Component.literal("Strength level: " + strengthStat), true);
            player.displayClientMessage(Component.literal("Strength exp: " + strengthExp), true);
            player.displayClientMessage(Component.literal("Strength exp Needed: " + strengthExpLevelUp), true);
        }
    }
    public static void setBaseDamage(Player player){
        double strengthStatDmg = 1 + ((double) strengthStat / 10.0);
        player.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(strengthStatDmg);
    }
    @SubscribeEvent
    public static void onLivingJump(LivingEvent.LivingJumpEvent event) {
        float jumpMultiplier = (strengthStat * 0.005f);
        if (event.getEntity() instanceof Player player) {
            event.getEntity().push(0, jumpMultiplier, 0);
            addStrengthExp(player, 1);
        }
    }
}
