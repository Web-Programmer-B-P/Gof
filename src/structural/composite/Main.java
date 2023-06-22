package structural.composite;

/**
 * Паттерн составной(Composite).
 * <p>
 * Позволяет хранить и работать с древовидной структурой.
 */
public class Main {
    public static void main(String[] args) {
        Folder folder1 = new Folder("Directory 1");
        Folder folder2 = new Folder("Directory 2");

        Folder root = new Folder("root");
        root.addFolder(folder1);
        root.addFolder(folder2);

        Folder user = new Folder("user");
        Folder child = new Folder("child");

        folder1.addFolder(user);
        folder1.addFolder(child);

        user.addFolder(new Folder("user1"));
        user.addFolder(new Folder("user2"));

        root.printFolders();
    }
}
