public class Magazine extends CatalogItem {
    private String author;

    public Magazine(String title, String author) {
        super(title);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }


}
