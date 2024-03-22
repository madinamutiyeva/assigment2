import java.util.Objects;

public abstract class CatalogItem implements CatalogInt {
    private String title;

    public CatalogItem(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String toString(){
        return title;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CatalogItem other = (CatalogItem) obj;
        return Objects.equals(this.title, other.title);
    }


}