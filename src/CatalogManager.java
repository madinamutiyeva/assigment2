import java.util.ArrayList;
import java.util.List;

public class CatalogManager {
    private CatalogItemRepository repository;

    public CatalogManager(CatalogItemRepository repository) {
        this.repository = repository;
    }

    public void addCatalogItem(CatalogItem item) {
        repository.addItem(item);
    }

    public void removeCatalogItem(CatalogItem item) {
        repository.removeItem(item);
    }

    public CatalogItem findItemByTitle(String title) {
        List<CatalogItem> items = repository.getAllItems();
        for (CatalogItem item : items) {
            if (item.getTitle().equals(title)) {
                return item;
            }
        }
        return null;
    }
    public List<CatalogItem> getAllCatalogItems() {
        return repository.getAllItems();
    }

}
