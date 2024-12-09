public class MainForFiles {
    public static void main(String[] args) {
        Folder folder = new Folder("Folder1");
        
        File file1 = new File("file1", "/somewhere1", 20);
        File file2 = new File("file2", "/somewhere2", 10);

        folder.addFile(file1);
        folder.addFile(file2);

        folder.displayFiles();

        folder.removeFile(file1);

        folder.displayFiles();
        
    }
}
