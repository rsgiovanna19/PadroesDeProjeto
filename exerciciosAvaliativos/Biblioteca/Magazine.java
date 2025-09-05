public class Magazine extends LibraryItem {
    private int issueNumber;

    public Magazine(String title, String author, int publicationYear, int issueNumber) {
        super(title, author, publicationYear);
        this.issueNumber = issueNumber;
    }

    public void flipPages() {
        System.out.println("Folheando a revista " + title + ", edição " + issueNumber);
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("Número da edição: " + issueNumber);
    }
}

