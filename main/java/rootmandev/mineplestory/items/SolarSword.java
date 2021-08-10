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

public class SolarSword extends ItemSword implements IHasModel {

	public SolarSword(String name, ToolMaterial material) {

		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);

		rootmandev.mineplestory.init.Items.ITEMS.add(this);

	}

	// 불붙음 효과 10초(후에 변경 예정)
	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {

		stack.damageItem(1, attacker);
		target.setFire(10);
		return true;
	}

	@Override
	public void registerModels() {

		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

	@Override
	public void addInformation(ItemStack itemStack, @Nullable World worldIn, List<String> tooltip,
			ITooltipFlag flagIn) {

		tooltip.add("일러스트레이터가 가장 심혈을 기울인 작품입니다!");

	}
}
