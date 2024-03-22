import java.util.Scanner;

public class LibraryCLI {
    private CatalogManager catalogManager;

    public LibraryCLI(CatalogManager catalogManager) {
        this.catalogManager = catalogManager;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Add Catalog Item");
            System.out.println("2. Remove Catalog Item");
            System.out.println("3. View All Catalog Items");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addCatalogItem(scanner);
                    break;
                case 2:
                    removeCatalogItem(scanner);
                    break;
                case 3:
                    viewAllCatalogItems();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        scanner.close();
    }

    private void addCatalogItem(Scanner scanner) {
        System.out.print("Enter item title: ");
        String title = scanner.next();

        if (!title.isEmpty()) {
            CatalogItem item = new Book(title, "Unknown Author"); // Устанавливаем название книги при создании
            catalogManager.addCatalogItem(item);
            System.out.println("Catalog item added successfully!");
        } else {
            System.out.println("Title cannot be empty!");
        }
    }

    private void removeCatalogItem(Scanner scanner) {
        System.out.print("Enter item title to remove: ");
        String title = scanner.next();
        CatalogItem itemToRemove = catalogManager.findItemByTitle(title);

        if (itemToRemove != null) {
            catalogManager.removeCatalogItem(itemToRemove);
            System.out.println("Catalog item removed successfully!");
        } else {
            System.out.println("Item not found in the catalog!");
        }
    }

    private void viewAllCatalogItems() {
        System.out.println("All Catalog Items:");
        for (CatalogItem item : catalogManager.getAllCatalogItems()) {
            System.out.println("Title: " + item.getTitle());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CatalogItemRepository catalogItemRepository = new CatalogItemRepositoryImpl();
        CatalogManager catalogManager = new CatalogManager(catalogItemRepository);
        LibraryCLI cli = new LibraryCLI(catalogManager);
        cli.start();
    }
}
