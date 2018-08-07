package com.bilicrawler.db;

import java.util.List;
import javax.sql.DataSource;
import com.bilicrawler.fans.*;

public interface FansDAO {
	   /** 
	    * This is the method to be used to initialize
	    * database resources ie. connection.
	    */
	   public void setDataSource(DataSource ds);
	   /** 
	    * This is the method to be used to create
	    * a record in the Fans table.
	    */
	   public void create(String name, String registeTime, String follwNumber, String fansNumber, String mid);
	   /** 
	    * This is the method to be used to list down
	    * all the records from the Fans table.
	    */
	   public List<Fans> listFans();
	   /** 
	    * This is the method to be used to delete all parameters
	    * a record into the Fans table.
	    */
	   public void deleteAll();
}
