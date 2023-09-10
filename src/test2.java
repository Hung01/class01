class test2 extends test1{
    {System.out.println("3");}
    int x;
    static {System.out.println("6");}
    public test2() {

        System.out.println("4");
    }
    public test2(int b){
//        super(0);
        x = b;
        System.out.println(b);
    }
}

// 在Java中，当一个子类的构造方法被调用时，它会首先调用其父类的构造方法。
// 如果没有明确指定调用父类的哪个构造方法，则会调用默认的无参构造方法。
// 在这个例子中，test2是test1的子类，因此在创建test2的实例时，会首先调用test1的构造方法。
// 但是，在test2类的构造方法中没有明确调用父类构造方法，因此默认会调用父类的无参构造方法。
// 因此，在创建test2的实例时，首先会执行test1的无参构造方法，输出"2"，然后再执行test2的实例初始化块和构造方法。