package rootmandev.mineplestory.util.handlers;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import rootmandev.mineplestory.entity.EntityDarthVader;
import rootmandev.mineplestory.entity.EntityEnderInfected;
import rootmandev.mineplestory.entity.EntityOrcSoldier;
import rootmandev.mineplestory.entity.render.RenderDarthVader;
import rootmandev.mineplestory.entity.render.RenderEnderInfected;
import rootmandev.mineplestory.entity.render.RenderOrcSoldier;

public class RenderHandler {
	
	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityDarthVader.class, new IRenderFactory<EntityDarthVader>() {
			
			@Override
			public Render<? super EntityDarthVader> createRenderFor(RenderManager manager){
				
				return new RenderDarthVader(manager);
			}
			
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityOrcSoldier.class, new IRenderFactory<EntityOrcSoldier>() {
			
			@Override
			public Render<? super EntityOrcSoldier> createRenderFor(RenderManager manager){
				
				return new RenderOrcSoldier(manager);
			}
			
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityEnderInfected.class, new IRenderFactory<EntityEnderInfected>() {
			
			@Override
			public Render<? super EntityEnderInfected> createRenderFor(RenderManager manager){
				
				return new RenderEnderInfected(manager);
			}
			
		});
	}

}
