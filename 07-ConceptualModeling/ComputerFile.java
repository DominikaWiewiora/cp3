public class ComputerFile {
    
    private String name;
    private int size; 
    private String permissions;
    private String modification; 
    private String type; 


    public ComputerFile(String name, int size, String permissions, String modification, String type) {
        this.name = name;
        this.size = size;
        this.permissions = permissions;
        this.modification = modification;
        this.type = type;
    }

   
    public void open() {
        System.out.println("Opening file: " + name + "." + type);
    }

  
    public void edit(String newContent) {
        if (permissions.contains("write")) {
            System.out.println("Editing file: " + name + "." + type);
        
            this.modification = java.time.LocalDateTime.now().toString();
        } else {
            System.out.println("File cannot be edited. Insufficient permissions.");
        }
    }

   
    public void save() {
        if (permissions.contains("write")) {
            System.out.println("Saving file: " + name + "." + type);
          
            this.modification = java.time.LocalDateTime.now().toString();
        } else {
            System.out.println("File cannot be saved. Insufficient permissions.");
        }
    }

   
    public ComputerFile copy(String newName) {
        System.out.println("Copying file: " + name + "." + type + " to " + newName + "." + type);
        return new ComputerFile(newName, this.size, this.permissions, this.modification, this.type);
    }


    public void delete() {
        System.out.println("Deleting file: " + name + "." + type);
        this.name = null;
        this.size = 0;
        this.permissions = null;
        this.modification = null;
        this.type = null;
    }

    public void displayDetails() {
        System.out.println("File Details:");
        System.out.println("Name: " + (name != null ? name : "Deleted"));
        System.out.println("Size: " + (size > 0 ? size + " KB" : "N/A"));
        System.out.println("Permissions: " + (permissions != null ? permissions : "N/A"));
        System.out.println("Last Modified: " + (modification != null ? modification : "N/A"));
        System.out.println("Type: " + (type != null ? type : "N/A"));
    }
}
