package rootmandev.mineplestory.items;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import rootmandev.mineplestory.Main;
import rootmandev.mineplestory.util.IHasModel;

public class FrozenBlade extends ItemSword implements IHasModel {

	public FrozenBlade(String name, ToolMaterial material) {

		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);

		rootmandev.mineplestory.init.Items.ITEMS.add(this);

	}

	// 느려짐 효과 추가
	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {

		stack.damageItem(1, attacker); // 아이템의 내구도가 얼마나 닳을 것인가?
		target.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 30, 5));
		return true;
	}

	@Override
	public void registerModels() {

		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

	@Override
	public void addInformation(ItemStack itemStack, @Nullable World worldIn, List<String> tooltip,
			ITooltipFlag flagIn) {

		tooltip.add("개발자 공인 가장 쓰레기인 검입니다..");

	}
}
