import java.util.List;

public interface CatalogItemRepository {
    void addItem(CatalogItem item);
    void removeItem(CatalogItem item);
    List<CatalogItem> getAllItems();
}
