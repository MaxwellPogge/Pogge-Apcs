import packagename.StaticSentenceMaker;
public class Launcher {
    public static void main(String[] args) {
        System.out.println(ImportedStaticClass.getMessage());
        ImportedConstructedClass icc = new ImportedConstructedClass("Beans that are cool.");
        System.out.println(StaticSentenceMaker.getMessage());
        //System.out.println(icc.message) -- Won't work. Message is scoped as private.
    }
}