/**
 * @author mlj
 * 1.线程就是独立的执行路径
 * 2.在一个进程中，如果开辟了多个线程，线程的运行有调度器安排，跟操作系统紧密相关，不能人工干预
 * 3.对同一份资源荟萃在资源抢夺的问题，需要加入并发控制
 * 4.线程会带来额外的开销，比如cpu调度时间，并发控制开销
 * 5.每个线程在自己的工作内存交互，内存控制不当会造成数据不一致
 */
package com.thread;

public class Demo01 {
    public static void main(String[] args) {

    }
}
