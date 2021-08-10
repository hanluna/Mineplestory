package rootmandev.mineplestory.entity.render;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import rootmandev.mineplestory.Reference;
import rootmandev.mineplestory.entity.EntityDarthVader;
import rootmandev.mineplestory.entity.model.ModelDarthVader;

public class RenderDarthVader extends RenderLiving<EntityDarthVader> {
	
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/darthvader.png");
	
	public RenderDarthVader(RenderManager manager) {
		
		super(manager, new ModelDarthVader(), 0.5F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityDarthVader entity) {
		return TEXTURES;
	}
}
