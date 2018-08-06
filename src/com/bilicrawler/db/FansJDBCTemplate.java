package com.bilicrawler.db;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import com.bilicrawler.fans.*;

public class FansJDBCTemplate implements FansDAO {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	@Override
	public void create(String name, String registeTime, Integer followNumber, Integer fansNumber, Integer collectionNumber) {
		String sql = "INSERT INTO Fans (name, registeTime, followNumber, fansNumber, collectionNumber) values (?, ?, ?, ?, ?)";
		jdbcTemplateObject.update(sql, name, registeTime, followNumber, fansNumber, collectionNumber);
		System.out.println("Create Record Name = " + name);
	}
	
	@Override
	public List<Fans> listFans(){
		String sql ="SELECT * FROM Fans";
		List<Fans> Fanss = jdbcTemplateObject.query(sql, new FansMapper());
		return Fanss;
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		String sql = "TRUNCATE Fans";
		jdbcTemplateObject.update(sql);
	}
}
