/**
 * Exception
 * 检测行异常
 * 运行时异常
 * error
 * java.lang.Throwable
 */
package com.error;

public class Demo01 {
    public static void main(String[] args) {
        try{
            new Demo01().a();
        } catch (Error e){
            System.out.println(e);
        } catch (Exception e){
            System.out.println("Exception");
        } catch (Throwable e){
            System.out.println("Throwable");
        }

        try {
            System.out.println(10/0);
        }catch (ArithmeticException e){
            System.out.println("程序出现异常");
        } finally {
            System.out.println("finally");
        }

    }
    public void a() {
        b();
    }
    public void b() {
        a();
    }
}
