package net.froggitybitty.adventurepiecemod.stats.strengthstat;

import net.froggitybitty.adventurepiecemod.AdventurePieceMod;
import net.froggitybitty.adventurepiecemod.stats.stamina.Stamina;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BowItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.entity.living.LivingEvent;
import net.neoforged.neoforge.event.entity.living.LivingHurtEvent;
import org.spongepowered.asm.mixin.MixinEnvironment;

import static net.froggitybitty.adventurepiecemod.stats.DataAttachmentProvider.STRENGTH_EXP;
import static net.froggitybitty.adventurepiecemod.stats.DataAttachmentProvider.STRENGTH_STAT;

@Mod(AdventurePieceMod.MODID)
public class StrengthStat {
    //public static float playerDmg;
    //public static float strengthStat;
    //public static float strengthExp;
    //public static float strengthExpLevelUp;
//
    //public StrengthStat(IEventBus modBus) {
    //    NeoForge.EVENT_BUS.addListener(StrengthStat::onLivingHurt);
    //    NeoForge.EVENT_BUS.addListener(StrengthStat::onLivingJump);
    //}
//
    //public static void addStrengthExp(Player player, float addXp){
    //    player.setData(STRENGTH_EXP, player.getData(STRENGTH_EXP) + addXp);
    //}
    //public static void addStrengthStat(Player player, float addLevel){
    //    player.setData(STRENGTH_STAT, player.getData(STRENGTH_STAT) + addLevel);
    //}
//
    //@SubscribeEvent
    //public static void onLivingHurt(LivingHurtEvent event){
    //    if (event.getSource().getEntity() instanceof Player player){
    //        if (!player.level().isClientSide){
    //            if (!event.getSource().isIndirect()) {
    //                playerDmg = event.getAmount();
    //                addStrengthExp(player, playerDmg);
    //                strengthStat = player.getData(STRENGTH_STAT);
    //                strengthExp = player.getData(STRENGTH_EXP);
    //                strengthExpLevelUp = 100f + (strengthStat * (strengthStat * 0.2f));
    //                if (strengthExp >= strengthExpLevelUp) {
    //                    addStrengthStat(player, 1);
    //                    strengthExp -= strengthExpLevelUp;
    //                    setBaseDamage(player);
    //                    player.setData(STRENGTH_EXP, strengthExp);
    //                    strengthStat = player.getData(STRENGTH_STAT);
    //                }
//
    //            }
    //            player.sendSystemMessage(Component.literal("Dealt " + playerDmg + " Damage"));
    //            player.sendSystemMessage(Component.literal("Strength level: " + strengthStat));
    //            player.sendSystemMessage(Component.literal("Strength exp: " + strengthExp));
    //            player.sendSystemMessage(Component.literal("Strength exp Needed: " + strengthExpLevelUp));
    //        }
    //    }
    //}
    //public static void setBaseDamage(Player player){
    //    double strengthStatDmg = 1 + ((double) strengthStat / 10.0);
    //    player.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(strengthStatDmg);
    //}
    //@SubscribeEvent
    //public static void onLivingJump(LivingEvent.LivingJumpEvent event) {
    //    float jumpMultiplier = (strengthStat * 0.005f);
    //    if (event.getEntity() instanceof Player player) {
    //        event.getEntity().push(0, jumpMultiplier, 0);
    //        addStrengthExp(player, 1);
    //    }
    //}

}
