package cn.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import cn.dao.IAreaDAO;
import cn.mldn.util.dao.abs.AbstractDAO;
import cn.mldn.vo.Area;

public class AreaDAOImpl extends AbstractDAO implements IAreaDAO {

	@Override
	public boolean doCreate(Area vo) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean doUpdate(Area vo) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean doRemove(Integer id) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean doRemoveBatch(Set<Integer> ids) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Area findById(Integer id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Area> findAll() throws SQLException {
		List<Area> all = new ArrayList<>();
		Area vo = null;
		String sql = "select aid,title from area ";
		this.pstmt  = this.conn.prepareStatement(sql);
		ResultSet rs = this.pstmt.executeQuery();
		while (rs.next()) {
			vo = new Area();
			vo.setAid(rs.getInt(1));
			vo.setTitle(rs.getString(2));
			all.add(vo);
		}
		return all;
	}

	@Override
	public List<Area> findAllSplit(Integer currentPage, Integer lineSize) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Area> findAllSplit(Integer currentPage, Integer lineSize, String column, String keyWord)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getAllCount() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getAllCount(String column, String keyWord) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
