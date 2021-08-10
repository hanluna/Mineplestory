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

public class GhostSword extends ItemSword implements IHasModel {

	public GhostSword(String name, ToolMaterial material) {

		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);

		rootmandev.mineplestory.init.Items.ITEMS.add(this);

	}

	// 이동속도 증가
	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {

		stack.damageItem(1, attacker);
		attacker.addPotionEffect(new PotionEffect(MobEffects.SPEED, 30, 10, false, false));
		return true;
	}

	@Override
	public void registerModels() {

		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

	@Override
	public void addInformation(ItemStack itemStack, @Nullable World worldIn, List<String> tooltip,
			ITooltipFlag flagIn) {

		tooltip.add("원조 벨튀 아이템입니다.");

	}
}
