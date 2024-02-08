package inhatc.cse.spring.command;

import java.util.Map;

import inhatc.cse.spring.dao.BDao;
import inhatc.cse.spring.dto.BDto;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;


public class BContentCommand implements BCommand {

	@Override
	public void execute(Model model) {

		Map<String, Object> map = model.asMap();								// 모델로부터 맵 생성
		HttpServletRequest request = (HttpServletRequest) map.get("request");	// request 객체 생성
		String bId = request.getParameter("bId");							// bId 파라미터를 가져와서 bId 변수에 저장
		
		BDao dao = new BDao();											// dao 객체 생성
		BDto dto = dao.contentView(bId);								// bId에 해당하는 내용 가져와 dto에 설정
		
		model.addAttribute("content_view", dto);		// dto를 모델로 전달
		
	}

}
