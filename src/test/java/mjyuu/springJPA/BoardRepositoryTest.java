package mjyuu.springJPA;

import java.lang.foreign.Linker.Option;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;
import mjyuu.springJPA.entity.Board;
import mjyuu.springJPA.repository.BoardRepository;

@Slf4j
@SpringBootTest
public class BoardRepositoryTest {

    @Autowired
    private BoardRepository boardRepository;

    @Test
    public void createBoard() {

        // Board board = new Board();
        // board.setTitle("Test Title");
        // board.setContent("Test Content");
        // board.setWriter("Test Writer");

        // boardRepository.save(board);

        Board board = Board.builder()
                .title("Test Title New")
                .content("Test Content Newer")
                .writer("Test Writer Newest")
                .build();

        boardRepository.save(board);
    }

    // show all boards
    // @Test
    // public void showAllBoards() {
    //     List<Board> boards = boardRepository.findAll();
    //     for (Board board : boards) {
    //         log.info("---> " + board.toString());
    //     }
    // }

    @Test
    public void getBoard() {
        log.info("------------- ");
        Optional<Board> board = boardRepository.findById(2);
        log.info("-----------------------------> " + board.toString());
    }

    // update board method
    @Test
    public void updateBoard() {
        log.info("------------- ");
        Optional<Board> boardOptional = boardRepository.findById(3);
        if (boardOptional.isPresent()) {
            Board board = boardOptional.get();
            board.setTitle("Updated Title Second");
            board.setContent("Updated Content Second");
            boardRepository.save(board);
            log.info("Board updated: " + board.toString());
        } else {
            log.info("Board with ID 2 not found.");
        }
    }

    @Test
    public void deleteBoard() {
        log.info("------------- ");
        boardRepository.deleteById(1);
        log.info("Board with ID 1 deleted.");
    }
}
