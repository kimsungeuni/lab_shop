package net.shop.dao;

import java.util.HashMap;
import java.util.List;

import net.shop.vo.WishlistVO;

/*
First Editor : Jisung Jeon (cbajs20@gmail.com)
Last Editor  :
Date         : 2015-04-21
*/
public interface WishlistDAO {

	public int insert(HashMap<String,Object> paraMap) throws Exception;

	public int count() throws Exception;
	
	public int count(String keyword) throws Exception;

	public List<WishlistVO> selectListMap(HashMap<String, Object> paraMap) throws Exception;

	public int delete(HashMap<String, Object> paraMap) throws Exception;

	public WishlistVO selectOne(HashMap<String, Object> paraMap) throws Exception;
}
