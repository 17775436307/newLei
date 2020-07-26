package Test;//定义导入包用import关键字
//import LeiStudyed.LeiStudy;//这是要导入LeiStudyed包下的LeiStudy下的类 也可以这样写import LeiStudyed.*；（不过这里是全部的类）
import  StudyLei.*;//import  StudyLei.LeiStudy;注意不可以同时导入两个具体的包下具体的同名类 即不可以跟上面的第一个语句同时存在 如果还要导入这个类 改成import  StudyLei.*;就可以了
//这样写代码的话，执行程序时调用类的肯定是调用最仔细的
public class TestStudy {
    public static void main(String [] args){
        LeiStudy si=new LeiStudy();//可调用不同包的同名类时候，一般都是调用导入最仔细的类
       // LeiStudy si1=new LeiStudy();
       // StudyLei.LeiStudy ly=new StudyLei.LeiStudy();//直接定义在哪个包的哪个类文件类导入
        //si.setName("huhu");
       // si1.setName("fanfan");
       // si.price=100;
       // si1.price=2000;
        /*   最后si.price和si1..price 的价格都会等于2000*/        //访问静态成员的方式：1对象.成员  2类.成员
       // LeiStudy.price=100;

       // System.out.println(si.getName()+"的价格为："+si.price);
       // System.out.println(si1.getName()+"的价格为："+si1.price);
        //si.eat();//最好采用类.方法来调用
        //LeiStudy.eat();//最好采用类.方法来调用
        LeiStudy si1=new LeiStudy();
//代码块的测试
          si.play();
         si1.play();
    }
}
