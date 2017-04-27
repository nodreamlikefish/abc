package cn.service.impl;

import java.util.List;

import cn.dao.IAreaplusDAO;
import cn.mldn.util.factory.Factory;
import cn.mldn.vo.Areaplus;
import cn.service.IAreaplusService;

public class AreaplusServiceImpl implements IAreaplusService {

	@Override
	public List<Areaplus> listByArea(Integer id) throws Exception {
		IAreaplusDAO areaplusDAO = Factory.getDAOInstance("areaplus.dao");
		return areaplusDAO.findByArea(id);
	}

}
