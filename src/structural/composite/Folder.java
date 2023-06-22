package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder {
    private final String name;
    private final List<Folder> folderList = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addFolder(Folder folder) {
        folderList.add(folder);
    }

    public void printFolders() {
        for (Folder folder : folderList) {
            System.out.println(folder.name);
            folder.printFolders();
        }
    }
}
