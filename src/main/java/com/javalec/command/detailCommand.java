package com.javalec.command;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.Dao.detail_Dao;
import com.javalec.Dto.detail_Dto;

public class detailCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		int pid = Integer.parseInt("1");
		detail_Dao dao = new detail_Dao();
		detail_Dto dto = dao.detail(pid);
		request.setAttribute("detail", dto);
		
		
//		response.setContentType("image/jpeg");
//		try {
//			ServletOutputStream out=response.getOutputStream();
			String filePath=request.getServletContext().getRealPath("/WEB-INF/img/won.png");
//			FileInputStream fin = new FileInputStream(filePath);
			request.setAttribute("filePath", filePath);
			
			System.out.println("filePath = "+filePath);
			
//		    BufferedInputStream bin = new BufferedInputStream(fin);  
//		    BufferedOutputStream bout = new BufferedOutputStream(out);  
//
//		    int ch =0;
//		    while((ch=bin.read())!=-1) {  
//		    	bout.write(ch);  
//		    }
//		    
//			//파일 입력스트림 제거
//		    bin.close();  
//		    fin.close();  
//		    bout.close();  
//		    out.close();  
//
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		
		
	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

}
