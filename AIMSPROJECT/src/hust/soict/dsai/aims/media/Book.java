package hust.soict.dsai.aims.media;
import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    
    private List<String> authors= new ArrayList<String>();

public Book(int id , String title , String cateGory , float cost , List<String> authors) {
  super(id, title, cateGory, cost);
  this.authors =authors;
}
public Book(String title , String cateGory , float cost ){
    super(title, cateGory, cost);
}

public List<String> getAuthors() {
    return authors;
}

public void setAuthors(List<String> authors) {
    this.authors = authors;
}
public void addAuthor(String authorName) {
    if(!authors.contains(authorName))
    authors.add(authorName);
}
public void removeAuthor(String authorName) {
    if(authors.contains(authorName))
    authors.remove(authorName);
}

@Override
public String toString() {
    return "Book id=" + id + ", title=" + title + ", category=" + category + ", authors=" + authors + ", cost=" + cost;
}

}
