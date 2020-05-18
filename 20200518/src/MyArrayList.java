/**
 * @Version 1.0
 * @Author:LiuXinYu
 * @Date:2020/5/18
 * @Content:
 */

/**
 * <T>只是一个占位符 表示当前类是个泛型类
 * 泛型的意义
 * 1.可以自动进行类型检查
 * 2.可以自动进行类型转换
 *
 *
 * 面试问题：泛型到底是怎么编译的   （擦除机制）
 *    重要： 泛型只是编译时期的一种机制
 *    在运行时就不存在泛型这种说法了  所有的处理均在编译阶段已经处理
 *    擦除机制：在编译的时候 泛型类型被擦除为Object了  不是替换
 *
 * 泛型的坑
 * 1.不能new泛型类型的数组
 * 2.简单类型不能作为泛型类型的参数
 * 3.泛型类型的参数 不参与类型的组成
 */
public class MyArrayList<T> {
    public T[] elem;
    public int usedSize;
    public MyArrayList(){
        this.elem = (T[])new Object[10];
        this.usedSize = 0;
    }

    //默认放在数组最后
    public void add(T val){
        this.elem[this.usedSize] = val;
        this.usedSize++;
    }

    public T getVal(int pos){
        return this.elem[pos];
    }
}
