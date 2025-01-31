package com.javalec.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.javalec.Dto.aProductList_Dto;

public class aProductList_Dao {
	
	// Field
		DataSource dataSource;

		// Constructor
		public aProductList_Dao() {
			try {
				Context context = new InitialContext();
				dataSource = (DataSource) context.lookup("java:comp/env/jdbc/shoes");
				// lookup은 데이터를 찾는 api
				// java:com/env = Context.xml
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		// Method

		// 전체 검색
		public ArrayList<aProductList_Dto> list() {

			ArrayList<aProductList_Dto> dtos = new ArrayList<aProductList_Dto>();// arraylist 생성

			// connection, preparedstatement, resultset 에 값을 미리 넣어두면 해킹당할 위험이 높음
			// Connection 인터페이스는 데이터베이스와의 연결
			// PreparedStatement 인터페이스는 SQL 쿼리를 실행하기 위한 객체
			// ResultSet 인터페이스는 데이터베이스에서 가져온 쿼리 결과
			Connection connection = null;
			PreparedStatement preparedStatement = null;
			ResultSet resultset = null;

			try {
				// data 베이스 연결
				connection = dataSource.getConnection();
				// 쿼리 작성
				String query = "select pid, pname, pcolor, pprice from product";

				// 작성한 쿼리를 데이터 connection을 사용하여 실행
				preparedStatement = connection.prepareStatement(query);

				// 실행한 쿼리문을 resultset에 삽입
				resultset = preparedStatement.executeQuery();

				while (resultset.next()) {
					// 데이터 불러오기
					int pid = resultset.getInt("pid"); // 칼럼 이름을 넣어야함
					String pname = resultset.getString("pname"); 
					String pcolor = resultset.getString("pcolor"); 
					String pprice = resultset.getString("pprice"); 
					

					// 불러온 데이터들을 dto 객체에 추가
					aProductList_Dto dto = new aProductList_Dto(pid,pname,pcolor,pprice);

					// 데이터들이 담겨있는 dto객체를 dtos(arraylist)에 추가
					dtos.add(dto);
				}

			} catch (Exception e) {
				e.printStackTrace();
			} finally { // 데이터 정리하는 용도로 쓰임 (만든 순서 거꾸로 정리해야함)
				try {
					if (resultset != null) {
						resultset.close();
					}
					if (preparedStatement != null) {
						preparedStatement.close();
					}
					if (connection != null) {
						connection.close();
					}
				} catch (Exception e) {

				}
			}
			return dtos;
		}

}
