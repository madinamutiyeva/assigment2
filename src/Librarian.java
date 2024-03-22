import java.util.List;

public class Librarian implements LibraryUser {
    private CatalogManager catalogManager;

    public Librarian(CatalogManager catalogManager) {
        this.catalogManager = catalogManager;
    }

    public void addCatalogItem(CatalogItem item) {
        catalogManager.addCatalogItem(item);
    }

    public void removeCatalogItem(CatalogItem item) {
        catalogManager.removeCatalogItem(item);
    }

    public CatalogItem findItemByTitle(String title) {
        return catalogManager.findItemByTitle(title);
    }

    public List<CatalogItem> getAllCatalogItems() {
        return catalogManager.getAllCatalogItems();
    }
}
