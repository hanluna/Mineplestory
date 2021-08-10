package rootmandev.mineplestory.util.handlers;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import rootmandev.mineplestory.init.Entities;
import rootmandev.mineplestory.init.Items;
import rootmandev.mineplestory.util.IHasModel;

@EventBusSubscriber
public class RegistryHandler {
	
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		
		// Items 클래스의 ITEMS리스트의 값을 전부 등록한다.
		
		event.getRegistry().registerAll(Items.ITEMS.toArray(new Item[0]));
		
	}
	
	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public static void onModelRegister(ModelRegistryEvent event) {
		
		// 모델도 등록한다.
		
		for(Item item:Items.ITEMS) {
			if(item instanceof IHasModel) {
				ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
			
			}
		}
	}
	
	public static void preInitRegistries() {
		
		Entities.registerEntites();
		RenderHandler.registerEntityRenders();
	}

	


}
