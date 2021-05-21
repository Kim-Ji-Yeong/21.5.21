package com.koreait.board.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.koreait.board.MyUtils;

@WebServlet("/board/list")
public class ListServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession hs = request.getSession();
		if (hs.getAttribute("loginUser") == null) {
			response.sendRedirect("/user/login");
			return;
		}

		request.setAttribute("list", BoardDAO.selBoardList());
		MyUtils.openJSP("board/boardList", request, response);
	}
}
