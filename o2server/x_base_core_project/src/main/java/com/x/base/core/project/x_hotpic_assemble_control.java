package com.x.base.core.project;

import com.x.base.core.entity.StorageType;
import com.x.base.core.project.annotation.Module;
import com.x.base.core.project.annotation.ModuleCategory;
import com.x.base.core.project.annotation.ModuleType;

@Module(type = ModuleType.ASSEMBLE, category = ModuleCategory.OFFICIAL, name = "热点图片", packageName = "com.x.hotpic.assemble.control", containerEntities = {
		"com.x.hotpic.entity.HotPictureInfo", "com.x.bbs.entity.BBSSubjectInfo",
		"com.x.cms.core.entity.Document" }, storageTypes = { StorageType.file }, storeJars = {
				"x_organization_core_entity", "x_organization_core_express", "x_hotpic_core_entity",
				"x_cms_core_entity", "x_bbs_core_entity" })
public class x_hotpic_assemble_control extends Deployable {

//	public x_hotpic_assemble_control() {
//		super();
//		dependency.containerEntities.add("com.x.hotpic.entity.HotPictureInfo");
//		dependency.containerEntities.add("com.x.bbs.entity.BBSSubjectInfo");
//		dependency.containerEntities.add("com.x.cms.core.entity.Document");
//		dependency.storageTypes.add(StorageType.file.toString());
//		dependency.storeJars.add(x_organization_core_entity.class.getSimpleName());
//		dependency.storeJars.add(x_organization_core_express.class.getSimpleName());
//		dependency.storeJars.add(x_hotpic_core_entity.class.getSimpleName());
//		dependency.storeJars.add(x_cms_core_entity.class.getSimpleName());
//		dependency.storeJars.add(x_bbs_core_entity.class.getSimpleName());
//	}
}
