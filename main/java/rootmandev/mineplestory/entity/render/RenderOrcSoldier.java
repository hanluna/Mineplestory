package rootmandev.mineplestory.entity.render;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import rootmandev.mineplestory.Reference;
import rootmandev.mineplestory.entity.EntityOrcSoldier;
import rootmandev.mineplestory.entity.model.ModelOrcSoldier;

public class RenderOrcSoldier extends RenderLiving<EntityOrcSoldier> {
	
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/orcsoldier.png");
	
	public RenderOrcSoldier(RenderManager manager) {
		
		super(manager, new ModelOrcSoldier(), 0.5F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityOrcSoldier entity) {
		return TEXTURES;
	}
}
