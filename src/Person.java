public class Person {
    // 声明属性
    String name;
    int age;
    int id;

    // 使用 Class的同名函数，作为构造器

    /* 单行注释 */

    /**
     * javadoc 测试。 这是类的描述 --- Javadoc
     *
     * @author Hung
     * @version 0.1
     * @param name 姓名
     * @param n 年龄
     * @return 生成一个新的Person实体
     */
    Person(String name, int n){
        this.name = name; // 当参数名，与属性名重复时，为了区分，我们会给属性名加this
        age = n; // 默认就是调用上面的属性

        // 但从习惯上来说，我们都会给属性名 加 this

        this.id = 0;

    }

}
