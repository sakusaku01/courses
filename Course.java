public abstract class Course {
    private String name;
    private int price;
    private int group;
    private double duration;
    private boolean isOnline;

    public Course() {
    }

    public Course(String name, int price, int group, double duration, boolean isOnline) {
        this.name = name;
        this.price = price;
        this.group = group;
        this.duration = duration;
        this.isOnline = isOnline;
    }

    public void aboutCourses(){
        System.out.println("Название курсов: "+name+"\n"+"Цена: "+price+" сом"+"\n"+"Группа: "+group+"\n"+"Длительность: "+
                duration+" месяцев"+"\n"+"Онлайн ли? "+isOnline);
    }

    public abstract void uroven();

}
