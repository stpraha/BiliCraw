package com.bilicrawler.db;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.bilicrawler.fans.*;

public class FansMapper implements RowMapper {

	@Override
	public Object mapRow(ResultSet rs, int rowNUm) throws SQLException {
		// TODO Auto-generated method stub
		Fans fan = new Fans();
		fan.setName(rs.getString("name"));
		fan.setRegisterTime(rs.getString("registeTime"));
		fan.setFollowNumber(rs.getString("followNumber"));
		fan.setFansNumber(rs.getString("fansNumber"));
		fan.setMid(rs.getString("mid"));
		return fan;
	}
}
