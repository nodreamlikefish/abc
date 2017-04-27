package cn.service.impl;

import java.util.List;

import cn.dao.IAreaDAO;
import cn.mldn.util.factory.Factory;
import cn.mldn.vo.Area;
import cn.service.IAreaService;

public class AreaServiceImpl implements IAreaService {

	@Override
	public List<Area> list() throws Exception {
		IAreaDAO areaDAO = Factory.getDAOInstance("area.dao");
		return areaDAO.findAll();
	}

}
