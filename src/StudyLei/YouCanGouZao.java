package StudyLei;
//有参构造对单一属性赋予值并调用方法
public class YouCanGouZao {
    public static void main(String[] args){
        LeiStudy ls7=new LeiStudy(23);
       // LeiStudy ls5=new LeiStudy("ming",1,"印度短毛猫",3);
       // System.out.println(ls5.name);
       // System.out.println(ls5.species);
       // System.out.println(ls5.howOld);
       // LeiStudy ls6=new LeiStudy();
        //ls6.eat();//还可以调用无参构造
       // ls6.run();
       // ls7.setHowOld(-56);
       if(ls7.getHowOld()<=0){
            return;
        }//条件语句使得决定输不输出数据
        else{
        System.out.println(ls7.getHowOld());}//或者   if(ls7.getHowOld()<=0) return;  System.out.println(ls7.getHowOld());

    }
}
