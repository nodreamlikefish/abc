package cn.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.mldn.util.factory.Factory;
import cn.mldn.vo.Areaplus;
import cn.service.IAreaplusService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@SuppressWarnings("serial")
@WebServlet("/areaplus")
public class AreaplusServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IAreaplusService service = Factory.getServiceInstance("areaplus.service");
		try {
			int aid = Integer.parseInt(request.getParameter("aid"));
			List<Areaplus> all = service.listByArea(aid);
			JSONObject obj = new JSONObject();
			JSONArray array = new JSONArray();
			Iterator<Areaplus> iter = all.iterator();
			while(iter.hasNext()){
				array.add(iter.next());
			}
			obj.put("allplus", array);
			response.getWriter().println(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(request, response);
	}
}
