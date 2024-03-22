import java.util.ArrayList;
import java.util.List;

public class CatalogItemRepositoryImpl implements CatalogItemRepository {
    private List<CatalogItem> items = new ArrayList<>();

    @Override
    public void addItem(CatalogItem item) {
        items.add(item);
    }

    @Override
    public void removeItem(CatalogItem item) {
        items.remove(item);
    }

    @Override
    public List<CatalogItem> getAllItems() {
        return items;
    }
}
