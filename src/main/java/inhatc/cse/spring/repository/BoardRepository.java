package inhatc.cse.spring.repository;

import inhatc.cse.spring.dto.BoardDTO;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

//@Respository
@Component
@RequiredArgsConstructor
public class BoardRepository {

    private final SqlSessionTemplate sql;


    public List<BoardDTO> findAll() {
        return sql.selectList("Board.findAll");
    }

    public int save(BoardDTO boardDTO) {
        return sql.insert("Board.save", boardDTO);
    }
}
