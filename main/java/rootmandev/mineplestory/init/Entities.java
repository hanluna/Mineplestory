package rootmandev.mineplestory.init;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import rootmandev.mineplestory.Main;
import rootmandev.mineplestory.Reference;
import rootmandev.mineplestory.entity.EntityDarthVader;
import rootmandev.mineplestory.entity.EntityEnderInfected;
import rootmandev.mineplestory.entity.EntityOrcSoldier;

public class Entities {
	
	public static void registerEntites() {
		
		// 순서대로 엔티티 아이디(문자), 엔티티 클래스, 엔티티 아이디(숫자), 보는 범위, 알 색상, 알 색상
		registerEntity("darthvader", EntityDarthVader.class, Reference.ENTITY_DARTHVADER, 50, 000000, 000000); 
		registerEntity("orcsoldier", EntityOrcSoldier.class, Reference.ENTITY_ORCSOLDIER, 50, 43520, 11141120); 
		registerEntity("enderinfected", EntityEnderInfected.class, Reference.ENTITY_ENDERINFECTED, 50, 000000, 660099);
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2) {
		
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
	
	}	
}
