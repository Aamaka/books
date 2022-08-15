package africa.semicolon.books.controller;
import africa.semicolon.books.model.data.Book;
import africa.semicolon.books.services.BookServices;
import lombok.AllArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class BookController {

    private final BookServices bookServices;

    @GetMapping("/books")
    public String list(Model model){
        model.addAttribute(bookServices.findAll());
        return "list";
    }

    @PostMapping("/book/save")
    public String save(@RequestBody Book book) {
        bookServices.save(book);
        return "Saved book successfully!";
    }
}
