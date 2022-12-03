package Task2;
public class Main {
    public static void main(String[] args) {
        AbstractHandler fileXML = new XMLHandler();
        AbstractHandler fileTXT = new TXTHandler();
        AbstractHandler fileDOC = new DOCHandler();

        fileXML.create();
        fileXML.open();
        fileXML.change();
        fileXML.save();
        System.out.println();

        fileTXT.create();
        fileTXT.open();
        fileTXT.change();
        fileTXT.save();
        System.out.println();

        fileDOC.create();
        fileDOC.open();
        fileDOC.change();
        fileDOC.save();
    }
}
