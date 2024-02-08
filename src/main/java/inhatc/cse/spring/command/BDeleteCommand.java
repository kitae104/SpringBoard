package inhatc.cse.spring.command;

import inhatc.cse.spring.dao.BDao;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;

import java.util.Map;

public class BDeleteCommand implements BCommand {

	@Override
	public void execute(Model model) {

		Map<String, Object> map = model.asMap();								//
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String bId = request.getParameter("bId");
		BDao dao = new BDao();
		dao.delete(bId);
		
	}

}
