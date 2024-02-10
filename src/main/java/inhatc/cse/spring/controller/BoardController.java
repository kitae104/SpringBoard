package inhatc.cse.spring.controller;

import inhatc.cse.spring.dto.BoardDTO;
import inhatc.cse.spring.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/board")
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/list")
    public String findAll(Model model) {
        List<BoardDTO> boardDTOList = boardService.findAll();
        model.addAttribute("boardList", boardDTOList);
        return "board/list";
    }

    @GetMapping("/save")
    public String saveForm() {
        return "board/save";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute BoardDTO boardDTO) {

        System.out.println("======> boardDTO : " + boardDTO);

        int saveResult = boardService.save(boardDTO);
        System.out.println("======> saveResult : " + saveResult);
        if (saveResult > 0) {
            return "redirect:/board/paging";
        } else {
            return "board/save";
        }
    }
}
