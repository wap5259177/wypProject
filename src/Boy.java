//类名
public class Boy {
    //给类+了一个年龄 int代表数字
    private int age;
// 给age赋值，表示setAge为数字
    public void setAge(int setAge){
        this.age =setAge;
    }
    //public为可以使用调用，公共 其他类也可以使用。return为可以返回这个age
    public int getAge(){
        return age;
    }
    //String 为文字  为name加文字属性
    private String name;

    public void setName(String setName){
        this.name =setName;
    }
    public String setName(){
        return name;
    }
//程序入口
    public static void main(String args[]){
        Boy boy =new Boy();
        boy.age =1;
        boy.name ="小白cai";
        System.out.println(boy.age);
        System.out.println(boy.name);
        System.out.println(boy.name+boy.age+"岁了");
    }
    }


