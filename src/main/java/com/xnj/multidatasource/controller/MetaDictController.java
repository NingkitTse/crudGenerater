package com.xnj.multidatasource.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xnj.multidatasource.entity.MetaDict;
import com.xnj.multidatasource.service.IMetaDictService;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author NingkitTse
 * @since 2020-01-05
 */
@RestController
@RequestMapping("/multidatasource/meta-dict")
public class MetaDictController {
	@Autowired
	private IMetaDictService service;

	@GetMapping(value = "/infos")
	public IPage<MetaDict> selectWithMap(Page<MetaDict> page) {
		return service.page(page, null);
	}

}
