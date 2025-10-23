package mjyuu.springJPA.entity;

import java.sql.Timestamp; // ✅ correct import

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor // ✅ needed by JPA
@Getter
@Setter
@Entity
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ✅ auto-increment primary key
    private Integer id;

    @Column(nullable=false)
    private String title;

    @Column(length=20, nullable=false)
    private String writer;

    @Column(length=4000, nullable=false)
    private String content;

    @CreationTimestamp
    private Timestamp createdDate;
}
