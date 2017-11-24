package com.restful.studentservices;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.restful.application.StudentServicesApplication;
import com.restful.domain.BoardVO;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = StudentServicesApplication.class)
public class StudentServicesApplicationTests {

//	@Autowired
//	private DataSource ds;
	
	@Test
	public void contextLoads() {
	}

	@Test
	public void testConnection() throws Exception {
//		System.out.println("ds : " + ds);
//		
//		Connection con = ds.getConnection();
//		PreparedStatement pstmt = con.prepareStatement("select * from board");
//		ResultSet rs = pstmt.executeQuery();
//		ArrayList<BoardVO> bvos = new ArrayList<BoardVO>();
//		
//		while(rs.next()){
//			int id = rs.getInt("id");
//			String name = rs.getString("name");
//			String title = rs.getString("title");
//			String content = rs.getString("content");
//			Timestamp date = rs.getTimestamp("date");
//			
//			bvos.add(new BoardVO(id, name, title, content, date));
//		}
//		
//		for(int i=0;i<bvos.size();i++){
//			System.out.println(bvos.get(i).toString());
//		}
//		
//		System.out.println("con : " + con);
//		
//		con.close();
	}
}
