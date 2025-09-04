public class DigitalMedia extends LibraryItem {
    private String fileFormat;

    public DigitalMedia(String title, String author, int publicationYear, String fileFormat) {
        super(title, author, publicationYear);
        this.fileFormat = fileFormat;
    }

    public void play() {
        System.out.println("Reproduzindo mídia digital: " + title + " [" + fileFormat + "]");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Formato do arquivo: " + fileFormat);
    }
}
