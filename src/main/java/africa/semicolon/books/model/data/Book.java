package africa.semicolon.books.model.data;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "author")
    private String author;

    @Column(name = "isbn")
    private String isbn;

    @Column(name = "publisher")
    private String publisher;

//    @Column(name = "published_on")
//    @DateTimeFormat(pattern = "yyyy-MM-dd")
//    @CreationTimestamp
//    private LocalDate publishedOn;

    public Book(String name, BigDecimal price, String author, String isbn, String publisher) {
        this.name = name;
        this.price = price;
        this.author = author;
        this.isbn = isbn;
        this.publisher = publisher;
//        publishedOn = LocalDate.now();
    }
}
