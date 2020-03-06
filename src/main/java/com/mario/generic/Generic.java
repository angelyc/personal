package com.mario.generic;

public class Generic<E> {
    /** 定义有泛型的类
     * class CLASS_NAME <泛型变量> {
     *     泛型变量一般用 E，K，V，T
     * }
     * 泛型类的泛型，在创建类的对象时确定
     *     */
    private E e;

    public Generic() {

    }

    public Generic(E e) {
        this.e = e;
    }

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }

    @Override public String toString() {
        return "Generic{" + "e=" + e + "}";
    }

    /** 泛型方法
     *  修饰符 <泛型变量> 返回值类型 方法名称(参数列表){
     *      ...
     *  }*/

    /** 使用方法自定义的泛型和类定义的泛型 */
    public <K> boolean isEequal(K k, E e) {
        /** 创建在放方法上的泛型是在真正调用方法时确定，一般都由传入的参数确定，
         * 包含这个方法的类创建对象时，并不会确定方法上的类型，一定在调用方法时确定。
         * */
        System.out.println(k);
        return super.equals(k) == super.equals(e);
    }

    /** 使用类定义的泛型 */
    private void compare(E t) {
        System.out.println(t);
    }
}
