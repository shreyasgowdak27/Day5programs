class India{
    void independence(){
        System.out.println("India snatched its independence in 1947");
    }
}
class Delhi extends India{
    void august(){
        System.out.println("Every year aug 15 is celebrated for the reason of independence");
    }
}
public class single{
    public static void main(String[] args) {
        Delhi de=new Delhi();       
        de.independence();
        de.august();
    }
}