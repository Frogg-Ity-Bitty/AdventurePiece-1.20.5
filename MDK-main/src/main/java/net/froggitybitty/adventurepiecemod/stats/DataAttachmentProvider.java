package net.froggitybitty.adventurepiecemod.stats;

import com.mojang.serialization.Codec;
import net.froggitybitty.adventurepiecemod.AdventurePieceMod;
import net.neoforged.neoforge.attachment.AttachmentType;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.function.Supplier;


public class DataAttachmentProvider {
    public static final DeferredRegister<AttachmentType<?>> ATTACHMENT_TYPES = DeferredRegister.create(NeoForgeRegistries.Keys.ATTACHMENT_TYPES, AdventurePieceMod.MODID);

    public static final Supplier<AttachmentType<Float>> STRENGTH_STAT = ATTACHMENT_TYPES.register(
            "strength_stat", () -> AttachmentType.builder(() -> 0f).serialize(Codec.FLOAT).build());
    public static final Supplier<AttachmentType<Float>> STRENGTH_EXP = ATTACHMENT_TYPES.register(
            "strength_exp", () -> AttachmentType.builder(() -> 0f).serialize(Codec.FLOAT).build());

    public static final Supplier<AttachmentType<Float>> AGILITY_STAT = ATTACHMENT_TYPES.register(
            "agility_stat", () -> AttachmentType.builder(() -> 0f).serialize(Codec.FLOAT).build());
    public static final Supplier<AttachmentType<Float>> AGILITY_EXP = ATTACHMENT_TYPES.register(
            "agility_exp", () -> AttachmentType.builder(() -> 0f).serialize(Codec.FLOAT).build());

    public static final Supplier<AttachmentType<Integer>> BLOCK_POS_X = ATTACHMENT_TYPES.register(
            "block_pos_x", () -> AttachmentType.builder(() -> 0).serialize(Codec.INT).build());
    public static final Supplier<AttachmentType<Integer>> BLOCK_POS_Y = ATTACHMENT_TYPES.register(
            "block_pos_y", () -> AttachmentType.builder(() -> 0).serialize(Codec.INT).build());
    public static final Supplier<AttachmentType<Integer>> BLOCK_POS_Z = ATTACHMENT_TYPES.register(
            "block_pos_z", () -> AttachmentType.builder(() -> 0).serialize(Codec.INT).build());

    public static final Supplier<AttachmentType<Integer>> OLD_BLOCK_POS_X = ATTACHMENT_TYPES.register(
            "old_block_pos_x", () -> AttachmentType.builder(() -> 0).serialize(Codec.INT).build());
    public static final Supplier<AttachmentType<Integer>> OLD_BLOCK_POS_Y = ATTACHMENT_TYPES.register(
            "old_block_pos_y", () -> AttachmentType.builder(() -> 0).serialize(Codec.INT).build());
    public static final Supplier<AttachmentType<Integer>> OLD_BLOCK_POS_Z = ATTACHMENT_TYPES.register(
            "old_block_pos_z", () -> AttachmentType.builder(() -> 0).serialize(Codec.INT).build());

    public static final Supplier<AttachmentType<Integer>> ENDURANCE_STAT = ATTACHMENT_TYPES.register(
            "endurance_stat", () -> AttachmentType.builder(() -> 0).serialize(Codec.INT).build());
    public static final Supplier<AttachmentType<Float>> ENDURANCE_EXP = ATTACHMENT_TYPES.register(
            "endurance_exp", () -> AttachmentType.builder(() -> 0f).serialize(Codec.FLOAT).build());

    public static final Supplier<AttachmentType<Integer>> STAMINA = ATTACHMENT_TYPES.register(
            "stamina", () -> AttachmentType.builder(() -> 0).serialize(Codec.INT).build());
    public static final Supplier<AttachmentType<Integer>> MAX_STAMINA = ATTACHMENT_TYPES.register(
            "max_stamina", () -> AttachmentType.builder(() -> 100).serialize(Codec.INT).build());

}
