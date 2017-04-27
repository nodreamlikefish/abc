package cn.dao;

import java.sql.SQLException;
import java.util.List;

import cn.mldn.util.dao.IBaseDAO;
import cn.mldn.vo.Areaplus;

public interface IAreaplusDAO extends IBaseDAO<Integer, Areaplus> {
	public List<Areaplus> findByArea(Integer id)throws SQLException;
}
