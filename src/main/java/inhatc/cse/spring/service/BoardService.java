package inhatc.cse.spring.service;

import inhatc.cse.spring.dto.BoardDTO;
import inhatc.cse.spring.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    public List<BoardDTO> findAll() {
        return boardRepository.findAll();
    }

    public int save(BoardDTO boardDTO) {
        return boardRepository.save(boardDTO);
    }
}
