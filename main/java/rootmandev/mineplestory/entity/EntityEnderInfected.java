package rootmandev.mineplestory.entity;

import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;

public class EntityEnderInfected extends EntityPigZombie {
	
	public EntityEnderInfected(World worldIn) {
		super(worldIn);
	}
	
	 protected void setEquipment()
	    {
	        this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND, new ItemStack(Items.IRON_SWORD));
	    }
}
