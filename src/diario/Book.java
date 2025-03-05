package diario;


import java.time.LocalDate;

public class Book {
    private int note;
    private String title;
    private String author;
    private String editor;
    private String year;
    private String genre;
    private boolean haveBook;
    private boolean read;
    private String review;


    public void book(String title, String author, String editor, String year, String genre, boolean haveBook, boolean read, String review) {
        // Registrar livro
        this.title = title;
        this.author = author;
        this.editor = editor;
        this.year = year;
        this.genre = genre;
        this.haveBook = haveBook;
        this.read = read;
        this.review = review;
    }

    public void evaluateBook(int notaRecebida) {
        this.note = notaRecebida;
    }

    // Getters e Setter
    public int getNote() {
        return note;
    }
    public void setNote(int note) {
        if(note>=0 && note<=5){
            this.note = note;
        }
        else{
            System.out.println("Nota deve ser um valor entre 0 e 5");
        }
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        if(!(title.isEmpty())){
            this.title = title;
        } else {
            System.out.println("Titulo inválido");
        }
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        if(!(author.isEmpty())){
            this.author = author;
        } else {
            System.out.println("Autor inválido");
        }
    }

    public String getEditor() {
        return editor;
    }
    public void setEditor(String editor) {
        if(!(editor.isEmpty())){
            this.editor = editor;
        } else {
            System.out.println("Editora inválida");
        }
    }

    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        if(year.matches("[0-9]{4}")){
            this.year = year;
        } else {
            System.out.println("Padrão de ano inválido");
        }
    }

    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        if(!(genre.isEmpty())){
            this.genre = genre;
        } else {
            System.out.println("Genero inválido");
        }
    }

    public boolean isHaveBook() {
        return haveBook;
    }
    public void setHaveBook() {
        if(haveBook){
            System.out.println("Voce já tem este livro");
        } else {
            this.haveBook = true;
        }
    }

    public boolean isRead() {
        return read;
    }
    public void setRead() {
        if(read){
            System.out.println("Voce já leu o livro");
        } else {
            this.read = true;
        }
    }

    public String getReview() {
        return review;
    }
    public void setReview(String review) {
        if(!(review.isEmpty())){
            this.review = review;
        } else {
            System.out.println("Review está vazio");
        }
    }
}
