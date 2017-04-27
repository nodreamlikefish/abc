package cn.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import cn.dao.IAreaplusDAO;
import cn.mldn.util.dao.abs.AbstractDAO;
import cn.mldn.vo.Area;
import cn.mldn.vo.Areaplus;

public class AreaplusDAOImpl extends AbstractDAO implements IAreaplusDAO {

	@Override
	public boolean doCreate(Areaplus vo) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean doUpdate(Areaplus vo) throws SQLException {
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
	public Areaplus findById(Integer id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Areaplus> findAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Areaplus> findAllSplit(Integer currentPage, Integer lineSize) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Areaplus> findAllSplit(Integer currentPage, Integer lineSize, String column, String keyWord)
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

	@Override
	public List<Areaplus> findByArea(Integer id) throws SQLException {
		List<Areaplus> all = new ArrayList<>();
		Areaplus vo = null;
		String sql = "select apid,aid,title from areaplus where aid = ? ";
		this.pstmt  = this.conn.prepareStatement(sql);
		this.pstmt.setInt(1, id);
		ResultSet rs = this.pstmt.executeQuery();
		while (rs.next()) {
			vo = new Areaplus();
			vo.setApid(rs.getInt(1));
			vo.setAid(rs.getInt(2));
			vo.setTitle(rs.getString(3));
			all.add(vo);
		}
		return all;
	}
	

}
