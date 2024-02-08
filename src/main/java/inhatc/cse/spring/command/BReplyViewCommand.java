package inhatc.cse.spring.command;

import inhatc.cse.spring.dao.BDao;
import inhatc.cse.spring.dto.BDto;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;

import java.util.Map;


public class BReplyViewCommand implements BCommand {

	@Override
	public void execute(Model model) {
		
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		String bId = request.getParameter("bId");
		
		BDao dao = new BDao();
		BDto dto = dao.reply_view(bId);
		
		model.addAttribute("reply_view", dto);
		
	}

}
