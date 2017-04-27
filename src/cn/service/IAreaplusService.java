package cn.service;

import java.util.List;

import cn.mldn.vo.Areaplus;

public interface IAreaplusService {
	public List<Areaplus> listByArea(Integer id)throws Exception;
}	
