package mjyuu.springJPA.entity;

import java.sql.Timestamp;
import org.hibernate.annotations.CreationTimestamp;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment primary key
    private Long id; // ✅ Use Long for IDs (standard JPA convention)

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false, length = 50)
    private String writer;

    @Column(nullable = false, length = 4000)
    private String content;

    @CreationTimestamp // Automatically fills on insert
    @Column(updatable = false)
    private Timestamp createdDate;
}
