package 队列;

import java.util.Stack;

public class __232__用栈实现队列 {
    class MyQueue {
        private Stack<Integer> InSt;
        private Stack<Integer> OutSt;
        /** Initialize your data structure here. */
        public MyQueue() {
            InSt=new Stack();
            OutSt=new Stack();
        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            InSt.push(x);
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            if (OutSt.empty()){
                while (!InSt.empty()){
                    OutSt.push(InSt.pop());
                }

            }
            return OutSt.pop();
        }

        /** Get the front element. */
        public int peek() {
            if (OutSt.empty()){
                while (!InSt.empty()){
                    OutSt.push(InSt.pop());
                }

            }
            return OutSt.peek();
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            if(InSt.empty()&&OutSt.empty()){
                return true;
            }else {
                return false;
            }
        }
    }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
}
