package library;

public class Library {

    int availableBooks = 0;

    public void addBook(int count) {
        if (count > 0) {
            availableBooks += count;
        }
    }

    public int lendBook(int count) {
        if (count <= availableBooks) {
            availableBooks -= count;
            return availableBooks;
        }
        return -1;
    }

    public int getAvailableBooks() {
        return availableBooks;
    }
}