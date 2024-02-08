package inhatc.cse.spring.command;


import inhatc.cse.spring.dao.BDao;
import inhatc.cse.spring.dto.BDto;
import org.springframework.ui.Model;

import java.util.ArrayList;

public class BListCommand implements BCommand {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub
		
		BDao dao = new BDao();
		ArrayList<BDto> dtos = dao.list();
		model.addAttribute("list", dtos);
		
	}

}