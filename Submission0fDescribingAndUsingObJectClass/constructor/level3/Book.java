package constructor.level3;

class Book {
    public int ISBN;
    protected String title;
    private String author;

    public void setAuthor(String a) {
        author = a;
    }

    public String getAuthor() {
        return author;
    }
}

class EBook extends Book {
    void display() {
        System.out.println(ISBN + " " + title);
    }
}