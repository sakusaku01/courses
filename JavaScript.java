public class JavaScript extends Course{

    private String translateName;

    public JavaScript() {
    }

    public JavaScript(String name, int price, int group, double duration, boolean isOnline, String translateName) {
        super(name, price, group, duration, isOnline);
        this.translateName = translateName;
    }

    @Override
    public void aboutCourses(){
        super.aboutCourses();
        System.out.println("Перевод имени: "+translateName);
    }
    @Override
    public void uroven() {
        System.out.println("Языки программирования высокого уровня!!!");
    }

}
