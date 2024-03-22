public class CD extends CatalogItem{
    private String author;

    public CD(String title, String author) {
        super(title);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

}
