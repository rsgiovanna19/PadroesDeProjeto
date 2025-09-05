public class Book extends LibraryItem {
    private String genre;

    public Book(String title, String author, int publicationYear, String genre) {
        super(title, author, publicationYear);
        this.genre = genre;
    }

    public void readSample() {
        System.out.println("Lendo amostra do livro: " + title + " [" + genre + "]");
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("Gênero: " + genre);
    }
}
