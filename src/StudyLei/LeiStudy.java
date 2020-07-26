package StudyLei;

//在类中创建一些对象的属性（特殊模板）；
public class LeiStudy {
    //无值属性
     private String name;
     private double weight;//修改属性的私有公有性 private 为私有访问 public为公有访问   私有属性只有在同类的中的方法可以访问
     private String species;
     private int howOld;
     public static int price;//用static 修饰会成为静态成员；不管定义多少个不同名变量，如果不用类调用成员，只用简单的调用成员，最后都会以最后一个数据为主并共享数据
    //static：静态 静态成员 或 静态类成员
    //static+属性--》静态属性或类属性
    //static +方法--》类方法或静态方法
    //static 不能加在class类前面
    //static+方法内的局部变量也是不存在的
    //成员方法内（非静态成员方法）可以直接访问static的静态属性
    //静态方法中不能直接访问同一个类中的非静态成员，只能访问同一个类中的静态成员
    //静态方法只能通过建立一个实例对象后，调用访问一个非静态属性成员，静态属性成员可以直接访问
    //非静态方法可以调用静态方法
    public  static void  eat(){
          //run();静态方法中不能直接访问同一个类中的非静态成员，只能访问同一个类中的静态成员,即在所要调用的方法名前加static就可以互相调用了 而非静态方法可以调用静态方法
        //this.name="FF";静态方法中也不能使用this
       /* static int temp=0;// 不存在方法内加static修饰的局部变量 静态方法内也不行*/
        LeiStudy dy=new LeiStudy();//实例化 一个对象
        dy.name="FF";//对象.成员来访问
        price=100;//静态方法可以直接访问静态属性
        System.out.println("eat fish");

    }//方法类型的属性
    public void  run(){
         eat();//非静态方法可以调用静态方法
        /*static int temp=0;//不存在方法内加static修饰的局部变量 静态方法内也不行*/
        this.eat();//同样可以调用另一个普通方法   或者直接用 eat(); 调用方法     ！！！！注意this调用时在构造方法内只能调用构造方法，在普通方法内只能调用普通方法！！！
        this.price=100;//非静态方法也可以直接访问静态属性
        System.out.println("cat run fast");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHowOld() {
        return howOld;
    }

    public void setHowOld(int howOld) {
        if(howOld<=0)
            System.out.println("输入的年龄错误必须要大于0");
        else
        this.howOld = howOld;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }


    //建立私有属性的公有访问的set,get方法，并在其中加入一些属性的限定

    public void setWeight(double weight){
        this.weight=weight;//用this可以调用且简单

    }//set只用接受数据一般不需要返回值

    public double getWeight(){

        return   weight;
    }//get通常需要得到数据因此需要建立一个有返回值方法 通常可以不加参数

    public LeiStudy(){
        System.out.println("我是StudyLei的 LeiStudy");
    }
    public LeiStudy(int howOld){
           this.setHowOld(howOld);//封装的set,get方法属于构造方法一类
    }
    public void  eat(String name){
        System.out.println(name+":eat fish");

    }  //定义重载方法来结合其它属性；

    public LeiStudy(String name){
        System.out.println("有参构造");
    }
    //多个有参构造的实例
   /* public LeiStudy(String newName,double newWeight,String newSpecies,int newHowOld){
        name=newName;
        weight=newWeight;
        species=newSpecies;
        howOld=newHowOld;
    }*/

//用this(指的是谁调用就是指的哪个的当前对象）关键字来创建有参构造方法更简单,没有上面的各个属性名字复杂化
public  LeiStudy(String name,double weight,String species,int howOld){
         this();//同样可以用this调用构造方法； 且只能放在第一行，放在其他地方会报错的；{this(加参数）可以调用有参构造} ！！！！注意this调用时在构造方法内只能调用构造方法，在普通方法内只能调用普通方法！！！
         this.name=name;
         this.species=species;
         this.howOld=howOld;
}
//代码块
    {
          System.out.println("我是构造代码块2");
    }//构造代码块
    public void play(){
            int temp=12;
        {
            int a=23;
            System.out.println("我是普通代码块1"+temp+a);
        }//普通代码块


        System.out.println("play with ball"+temp);//System.out.println("play with ball"+temp+a);这样就会报错，不能应用a的名和值

        {
            int a=26;
            System.out.println("我是普通代码块2"+temp+a);
        }//普通代码块


    }//如果在有普通代码块的方法中要定义一个局部变量，在哪个地方定义，就从哪个地方开始到最后结束的应用这个变量，就不允许再定义一个同名的局部变量了；如上所示
    // 也可以在两个普通代码块中定义两个名相同值不相同的变量，这样的变量只会应用于自己的代码块；如上所示
    static{
        System.out.println("我是静态代码块2");
    }//静态代码块


    {
        System.out.println("我是构造代码块1");
    }//构造代码块


    static{
        System.out.println("我是静态代码块1");
    }//静态代码块
/*  代码块的运行是先静态代码块运行，定义好静态代码块后，不管实例化几个对象，都只运行一遍静态代码块且先出现先运行（代码块的运行在所有程序之前）；运行完后就轮到构造代码块了
     而构造代码块就不一样了，定义好构造代码块后，实例化几个对象后就会运行运行几次，也是先出现先运行，且在所有静态代码块运行完后；（静态代码块和构造代码块都是放在类中的），运行完后就轮到普通代码块了
     而普通代码块是放在方法中的，且运行顺序为代码的正常情况下运行，（即一般都是一行一行代码顺序执行的），方法调用几次，所在方法内的所有代码就会运行几遍（包括普通代码块）； */

}