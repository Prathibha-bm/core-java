class FileRunner {
    public static void main(String[] args) {

        File f1 = new File("doc1", "txt", 10);
        f1.createdBy = CreatedBy.PRATHIBHA;
        f1.isHidden = false;

        File f2 = new File("doc2", "pdf", 20);
        f2.createdBy =CreatedBy.YASHAWSINI;
        f2.isHidden = true;

        File f3 = new File("doc3", "docx", 30);
        f3.createdBy =CreatedBy.SPANDANA;
        f3.isHidden = false;

        File[] files = {f1,f2,f3};

        Folder folder = new Folder("MyFolder", "Personal", "C:/Docs", files);
        folder.display();
    }
}