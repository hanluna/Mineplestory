package rootmandev.mineplestory.entity.render;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import rootmandev.mineplestory.Reference;
import rootmandev.mineplestory.entity.EntityEnderInfected;
import rootmandev.mineplestory.entity.model.ModelEnderInfected;

public class RenderEnderInfected extends RenderLiving<EntityEnderInfected> {
	
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/enderinfected.png");
	
	public RenderEnderInfected(RenderManager manager) {
		
		super(manager, new ModelEnderInfected(), 0.5F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityEnderInfected entity) {
		return TEXTURES;
	}
}

