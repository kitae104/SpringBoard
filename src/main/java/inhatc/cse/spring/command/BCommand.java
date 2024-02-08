package inhatc.cse.spring.command;

import org.springframework.ui.Model;

// 이후에 서비스 역할을 하는 인터페이스
public interface BCommand {
	
	void execute(Model model);
	
}