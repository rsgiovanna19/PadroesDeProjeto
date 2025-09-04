public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Criando itens
        LibraryItem book = new Book("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, "Fantasia");
        LibraryItem magazine = new Magazine("National Geographic", "Vários", 2023, 120);
        LibraryItem digitalMedia = new DigitalMedia("Curso de Java", "OpenAI", 2024, "MP4");

        // Polimorfismo - todos tratados como LibraryItem
        LibraryItem[] items = {book, magazine, digitalMedia};

        for (LibraryItem item : items) {
            System.out.println("\n=== Informações do Item ===");
            item.displayInfo();
            item.borrow();
            item.returnItem();

            // Métodos específicos - usando instanceof
            if (item instanceof Book) {
                ((Book) item).readSample();
            } else if (item instanceof Magazine) {
                ((Magazine) item).flipPages();
            } else if (item instanceof DigitalMedia) {
                ((DigitalMedia) item).play();
            }
        }
    }
}
