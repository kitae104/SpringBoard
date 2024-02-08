package inhatc.cse.spring.command;

import inhatc.cse.spring.dao.BDao;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;

import java.util.Map;


public class BWriteCommand implements BCommand {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub
		
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		String bName = request.getParameter("bName");
		String bTitle = request.getParameter("bTitle");
		String bContent = request.getParameter("bContent");
		
		BDao dao = new BDao();
		dao.write(bName, bTitle, bContent);
	}
}
