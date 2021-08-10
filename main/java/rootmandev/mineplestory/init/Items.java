package rootmandev.mineplestory.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import rootmandev.mineplestory.items.BloodySword;
import rootmandev.mineplestory.items.DemonicSword;
import rootmandev.mineplestory.items.EmeraldSword;
import rootmandev.mineplestory.items.FrozenBlade;
import rootmandev.mineplestory.items.GhostSword;
import rootmandev.mineplestory.items.IndomitableFrozenBlade;
import rootmandev.mineplestory.items.LavaDropper;
import rootmandev.mineplestory.items.LifeHarvester;
import rootmandev.mineplestory.items.LightSaber;
import rootmandev.mineplestory.items.SolarSword;

public class Items {

	public static final List<Item> ITEMS = new ArrayList<Item>();

	// 도구재료를 생성합니다. 자세한 설명은 README를 참조하십시오.
	// EnumHelper.addToolMaterial('도구ID', 수확 레벨(나무부터 다이아까지 0~3입니다.), 사용 횟수, 효율,
	// 데미지(나무부터 다이아까지 0~3입니다.), 인챈트 효율

	public static final ToolMaterial LIGTHSABOR_CRYSTAL = EnumHelper.addToolMaterial("lightsaber_crystal", 6, 3000,
			24.0F, 18.0F, 10);
	public static final ToolMaterial LAVADROPPER_MATERIAL = EnumHelper.addToolMaterial("swordlava_material", 0, 300,
			10.0F, 5.0F, 0);
	public static final ToolMaterial SOLARSWORD_MATERIAL = EnumHelper.addToolMaterial("solarsword_material", 0, 300,
			10.0F, 5.0F, 0);
	public static final ToolMaterial BLOODYSWORD_MATERIAL = EnumHelper.addToolMaterial("bloodysword_material", 0, 300,
			10.0F, 5.0F, 0);
	public static final ToolMaterial LIFEHARVESTER_MATERIAL = EnumHelper.addToolMaterial("lifeharvester_material", 0,
			300, 10.0F, 5.0F, 0);
	public static final ToolMaterial GHOSTSWORD_MATERIAL = EnumHelper.addToolMaterial("ghostsword_material", 0, 300,
			10.0F, 5.0F, 0);
	public static final ToolMaterial DEMONICSWORD_MATERIAL = EnumHelper.addToolMaterial("demonicsword_material", 0, 300,
			10.0F, 5.0F, 0);
	public static final ToolMaterial FROZENBLADE_MATERIAL = EnumHelper.addToolMaterial("frozenblade_material", 0, 300,
			10.0F, 5.0F, 0);
	public static final ToolMaterial INDOMITABLEFROZENBLADE_MATERIAL = EnumHelper
			.addToolMaterial("indomitablefrozenblade_material", 0, 300, 10.0F, 5.0F, 0);
	public static final ToolMaterial EMERALDSWORD_MATERIAL = EnumHelper.addToolMaterial("emeraldsword_material", 0, 300,
			10.0F, 1000.0F, 0);

	// ===================================== 검 입니다
	// ==========================================

	// \ 태양 만세 /
	public static final Item LAVADROPPER = new LavaDropper("lavadropper", LAVADROPPER_MATERIAL);
	public static final Item SOLARSWORD = new SolarSword("solarsword", SOLARSWORD_MATERIAL);

	// 블라디미르?
	public static final Item BLOODYSWORD = new BloodySword("bloodysword", BLOODYSWORD_MATERIAL);
	public static final Item LIFEHARVESTER = new LifeHarvester("lifeharvester", LIFEHARVESTER_MATERIAL);

	// 영혼..참마도!
	public static final Item GhostSword = new GhostSword("ghostsword", GHOSTSWORD_MATERIAL);
	public static final Item DEMONICSWORD = new DemonicSword("demonicsword", DEMONICSWORD_MATERIAL);

	// 렛잇고~
	public static final Item FROZENBLADE = new FrozenBlade("frozenblade", FROZENBLADE_MATERIAL);
	public static final Item INDOMITABLEFROZENBLADE = new IndomitableFrozenBlade("indomitablefrozenblade",
			INDOMITABLEFROZENBLADE_MATERIAL);

	// 세상에서 가장 강력한 검
	public static final Item EMERALDSWORD = new EmeraldSword("emeraldsword", EMERALDSWORD_MATERIAL);

	// 개발자 선정 최고의 검.. "라이트세이버"
	public static final Item LIGHTSABER = new LightSaber("lightsaber", LIGTHSABOR_CRYSTAL);
}
