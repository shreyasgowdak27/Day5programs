class animals{
    void dog(){
        System.out.println("dogs are most loyal animals");
    }
}
class horse extends animals{
    @Override
    void dog(){
        System.out.println("dogs are good, but horse has history in loyalty");
       
    }
}


public class override {
    public static void main(String[] args) {
        animals an=new animals();
        horse h=new horse();
        an.dog();
        h.dog();
    }
}
