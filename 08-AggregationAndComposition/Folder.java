import java.util.ArrayList;
import java.util.List;

public class Folder {
    private String name;
    private List<File> files;

    public Folder(String name) {
        this.name = name;
        this.files = new ArrayList<>();
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void addFile(File file) {
        files.add(file);
        System.out.println(file.getName() + " added to the folder");
    }

    public void removeFile(File file) {
        files.remove(file);
        System.out.println(file.getName()+ "removed from the folder");
    }

    public void displayFiles() {
        for (File f : files) {
            System.out.println(f);
        }
    }
    

}
