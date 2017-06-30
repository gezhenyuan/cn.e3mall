package cn.e3mall.service;

import java.util.List;

import cn.e3mall.common.pojo.DataGridResult;
import cn.e3mall.common.pojo.TreeNode;
import cn.e3mall.pojo.TbItem;

public interface ItemService {

	TbItem getItemById(long itemId);

	DataGridResult getItemList(int page, int rows);

	
}
