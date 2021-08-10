	package rootmandev.mineplestory.entities;

import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.world.World;

public class DarthVader extends EntityEnderman {
	
	public DarthVader(World worldIn) {
		super(worldIn);
	
	}
	
	@Override
	public void onUpdate() {
		super.onUpdate();
	}
	
	@Override
	public void onLivingUpdate() {
		if(!this.world.isRemote) {
			
		}
	}
		
	
}
