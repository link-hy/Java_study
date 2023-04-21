package genericity_1;

import java.util.ArrayList;

public class genericity1 {
    public static void main(String[] args) {
        // 泛型设计
        MyArrayKist1<String> list=new MyArrayKist1<>();
        list.add("aaa");
        list.add("aaa");
        System.out.println(list);

        MyArrayKist1<Integer> list2=new MyArrayKist1<>();
        list2.add(1);
        list2.add(2);
        System.out.println(list2);

        show(1);
        show("1111");
        Integer[] a={1,2,3,4,5};
        shows(a);
    }

    /**
     * 泛型方法，使用泛型接受一切实际类型的参数，方法更具有通用性
     * @param e
     * @param <E>
     */
    public static <E> void show(E e){
        System.out.println(e.toString());
    }
    public static <K> void shows(K[] k){
        if (k==null){
            System.out.println(k);
        }
        else{
            StringBuilder sb=new StringBuilder("[");
            for (int i=0;i< k.length;i++) {
                sb.append(k[i]).append(i==k.length-1?"]":",");
            }
            System.out.println(sb);
        }
    }
}

/**
 * 泛型类
 * @param <E>
 */
class MyArrayKist1<E>{
    private ArrayList lists=new ArrayList();

    public void add(E e){
        lists.add(e);
    }

    public void remove(E e){
        lists.remove(e);
    }

    public String toString(){
        return lists.toString();
    }
}

/**
 * 泛型接口  可以让实现类选择当前功能需要操作的数据类型
 * @param <T>
 */
interface Data<T>{
    void add(T t);
    void delete(int id);
    void update(T t);
    T queryById(int id);
}
class Student{}
class Teacher{}
class SDate implements Data<Student>{
    @Override
    public void add(Student student) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(Student student) {

    }

    @Override
    public Student queryById(int id) {
        return null;
    }
}
class TDate implements Data<Teacher>{
    @Override
    public void add(Teacher teacher) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(Teacher teacher) {

    }

    @Override
    public Teacher queryById(int id) {
        return null;
    }
}