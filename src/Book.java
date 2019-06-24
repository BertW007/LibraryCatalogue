public class Book {

    // Properties
    private String title;
    private int pageCount;
    private int ISBN;
    private boolean isCheckedOut;
    private int dayCheckedOut = -1;

    // Constructor
    public Book (String bookTitle, int bookPageCount, int bookISBN) {
        this.title = bookTitle;
        this.pageCount = bookPageCount;
        this.ISBN=bookISBN;
        this.isCheckedOut=false;
    }

    // Getters & Setters


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setIsCheckedOut(boolean newIsCheckedOut, int currentDayCheckedOut) {
        isCheckedOut = newIsCheckedOut;
        setDayCheckedOut(currentDayCheckedOut);
    }

    public int getDayCheckedOut() {
        return dayCheckedOut;
    }

    private void setDayCheckedOut(int dayCheckedOut) {
        this.dayCheckedOut = dayCheckedOut;
    }
}
