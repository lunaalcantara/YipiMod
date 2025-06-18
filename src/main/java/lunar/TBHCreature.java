package lunar;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class TBHCreature extends Item {
    public TBHCreature(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult use(World world, PlayerEntity user, Hand hand) {


            // Play the sound as if it was coming from the entity.
            user.playSound(SoundEvents.ENTITY_PILLAGER_AMBIENT, 2f, 0.7f);
            System.out.println("hi");


        return ActionResult.PASS;
    }
}
