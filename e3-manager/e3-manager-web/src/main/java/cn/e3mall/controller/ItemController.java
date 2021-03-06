package cn.e3mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3mall.pojo.TbItem;
import cn.e3mall.service.TbItemService;

@Controller
public class ItemController {

	@Autowired
	private TbItemService itemService;
	
	@RequestMapping("/item/{itemId}")
	@ResponseBody
	public TbItem findByItemId(@PathVariable Long itemId){
		TbItem item = itemService.findByItemId(itemId);
		return item;
	}
	
}
