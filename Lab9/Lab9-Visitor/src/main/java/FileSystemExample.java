public class FileSystemExample {
    public static void main(String[] args) {
        File file1 = new File("file1.txt", 100);
        File file2 = new File("file2.txt", 50);

        Directory directory1 = new Directory("Folder1");
        directory1.addElement(file1);

        Directory directory2 = new Directory("Folder2");
        directory2.addElement(file2);

        Directory rootDirectory = new Directory("Root");
        rootDirectory.addElement(directory1);
        rootDirectory.addElement(directory2);

        FileSystemVisitor fileSizeVisitor = new FileSizeVisitor();
        rootDirectory.accept(fileSizeVisitor);

        System.out.println("Total size of the file system: " + fileSizeVisitor.getTotalSize() + " bytes");
    }
}
