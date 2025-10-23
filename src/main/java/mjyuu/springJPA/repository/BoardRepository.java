package mjyuu.springJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import mjyuu.springJPA.entity.Board;

public interface BoardRepository extends JpaRepository<Board, Integer> {
    // Custom query methods (if needed) can be defined here
    // update(), findById(), findAll(), delete() are provided by JpaRepository

}
