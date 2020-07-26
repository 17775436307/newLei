package StudyLei;
//实例化对象
public class LeiStudyTest {
    public static void main(String[]args){
        LeiStudy ls=new LeiStudy();/*      new关键字为对象实例化       光 LeiStudy ls；不能使用，要用new关键字来指向一个对象       */
        LeiStudy ls1=new LeiStudy();/*    ls与ls1是两个不同的变量    修改任何一个的属性值都不会影响另一个的属性          */
        LeiStudy ls2=ls;/* 这里相当于这是两个不同名字的相同个体；即是修改另一个的属性另一个的属性也会变得跟修改后的一样                     */
     //   ls1.name="beach";
        ls.eat();//结合属性前
      //  ls.name="kaikai";//也可以在主方法调用时给它一个属性值；
      //  ls2.name="kaikai1";
       // ls.name;某个单纯的属性不能直接调用输出;要用输出语句来输出属性的值
       // System.out.println("name:"+ls.name);//名字跟ls2一样了
        //System.out.println("name:"+ls2.name);//名字跟ls一样了
        //System.out.println("name:"+ls1.name);
        //ls.eat(ls.name);
        //ls1.eat(ls1.name);
    }
}
