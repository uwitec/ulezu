package ulezu.com.controler.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ulezu.com.util.EscapeAndUnescapeUtil;

/**
 * Servlet implementation class SearchServlet
 */
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		//先从缓存中加载数据，然后再从数据库中加载数据
		String searchValue = request.getParameter("v");
		String searchSelectAddress = request.getParameter("h");
		String keyword = "";
		if("none".equals(EscapeAndUnescapeUtil.unescape(searchSelectAddress))){
			String[] searchArr = searchValue.split(" ");
			for (String value : searchArr) {
				keyword = value;
			}
		}else{
			keyword = EscapeAndUnescapeUtil.unescape(searchSelectAddress);
			
		}
	}

}
