public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Criando itens
        LibraryItem book = new Book("Diario de um banana", "Joao A.", 2000, "Cartoon");
        LibraryItem magazine = new Magazine("Diario de um banana - Magazine", "Joao A.", 2001, 120);
        LibraryItem digitalMedia = new DigitalMedia("Diario de um banana - Audiobook", "Joao A.", 2002, "MP4");

        // Polimorfismo - todos tratados como LibraryItem
        LibraryItem[] items = {book, magazine, digitalMedia};

        for (LibraryItem item : items) {
            System.out.println("\n=== Informações ===");
            item.showData();
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
