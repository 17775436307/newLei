package StudyLei;

public class WuCanGouZao {
    public static void main(String[] args){
        LeiStudy ls3= new LeiStudy();//没有定义无参构造 系统会自动添加无参构造 已在LeiStudy建也可以用无参构造的实例化对象
        ls3.eat();
        LeiStudy ls4= new LeiStudy("KeLe"); //定义一个有参构造后（以在LeiStudy定义），还想用无参构造（但没有建立一个无参构造），就还需要自己再建立一个无参构造
        ls4.eat();
    }
}
