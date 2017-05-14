package StackAndQueuePackage;

import java.io.*;

import VectorPackage.Vector;
import junit.framework.TestCase;

public class Stack_Queue_Tests extends TestCase {
    
    private ByteArrayOutputStream out = new ByteArrayOutputStream();
    
    protected void setUp() throws IOException{
        System.setOut(new PrintStream(out));
    }    
    
    public void test1() {
        Stack s = new Stack();
        s.push(8);
        
        assertEquals("Неправильный результат", 1, s.getSize());
        assertEquals("Неправильный результат", 8.0, s.pop());
        assertEquals("Неправильный результат", 0, s.getSize());
    }
    
    public void test2(){
        Vector v = new Vector();
        v.print();
        assertEquals("Неправильный вывод:", "Empty", out.toString().trim());
        out.reset();
        
        v.insert(8.8, 0);
        v.insert(9.9, 1);
        assertEquals("Неправильный размер вектора после добавления:", 2, v.getSize());
        v.print();
        assertEquals("Неправильно сработало добавление:", "8.8 9.9", out.toString().trim());
        out.reset();
        
        v.insert(5.5, 0);
        v.print();
        assertEquals("Неправильно сработало добавление:", "5.5 8.8 9.9", out.toString().trim());
        out.reset();
        
        v.set(-2, 0);
        assertEquals("Неправильно сработало set():", -2.0, v.get(0));
        
        v.erase(0);
        assertEquals("Неправильно сработало erase():", 2, v.getSize());
        assertEquals("Неправильно сработало erase():", 8.8, v.get(0));
        
        Vector vc = new Vector(100);
        assertEquals("Ошибка с размером:", 0, vc.getSize());
        vc.insert(99, 0);
        assertEquals("Ошибка с размером:", 1, vc.getSize());
        assertEquals("Неправильно сработало добавление:", 99.0, vc.get(0));
    }

    public void test3(){
        Stack s = new Stack();
        
        s.push(9);
        s.push(8);
        s.push(7);
        assertEquals("Неправильный результат", 3, s.getSize());
        
        assertEquals("Неправильный результат", 7.0, s.pop());
        assertEquals("Неправильный результат", 8.0, s.pop());
        assertEquals("Неправильный результат", 1, s.getSize());
        
        s.push(50.5);
        assertEquals("Неправильный результат", 50.5, s.pop());
        assertEquals("Неправильный результат", 9.0, s.pop());
        
        assertEquals("Неправильный результат", 0, s.getSize());
        
        Queue q = new Queue();
        
        q.enqueue(9);
        q.enqueue(8);
        q.enqueue(7);
        
        assertEquals("Неправильный результат", 3, q.getSize());
        
        assertEquals("Неправильный результат", 9.0, q.dequeue());
        assertEquals("Неправильный результат", 8.0, q.dequeue());
        assertEquals("Неправильный результат", 1, q.getSize());
        
        q.enqueue(50.5);
        assertEquals("Неправильный результат", 7.0, q.dequeue());
        assertEquals("Неправильный результат", 50.5, q.dequeue());
        
        assertEquals("Неправильный результат", 0, q.getSize());
    }
    
    public void test4(){
        Stack s1 = new Stack(), s2 = new Stack();
        Queue q = new Queue();
        final int N = 10000;
        
        // push
        for(int i=0; i<N; i++){
            s1.push(i);
            q.enqueue(i);
        }
        
        // reverse
        for(int i=0; i<N; i++){
            s2.push(s1.pop());
        }
        
        // check
        for(int i=0; i<N; i++){
            assertEquals("Значения должны совпадать", s2.pop(), q.dequeue());
        }// for
    }
    
    public void test5(){
        Stack s = new Stack();
        for(int i=0; i<100; i++){
            s.push(i);
            if(i>=50)
                s.pop();
        }
        assertEquals("Должно было остаться 50 чисел", 50, s.getSize());
        
        Queue q = new Queue();
        for(int i=0; i<100; i++){
            q.enqueue(i);
            if(i>=50)
                q.dequeue();
        }
        assertEquals("Должно было остаться 50 чисел", 50, q.getSize());
    }

}