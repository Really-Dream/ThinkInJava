package holding;

import java.util.*;

/**
 * Created by H.J
 * 2018/5/28
 */
public class PriorityQueueDemo {
    public static void main(String[] args){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        Random rand = new Random(47);
        for(int i = 0; i < 10; i++){
            priorityQueue.offer(rand.nextInt(i + 10));
        }
        QueueDemo.pringQ(priorityQueue);
        List<Integer> ints = Arrays.asList(25,22,20,18,14,9,3,1,1,2,3,9,14,18,21,23,25);
        priorityQueue = new PriorityQueue<>();
        QueueDemo.pringQ(priorityQueue);
        priorityQueue = new PriorityQueue<>(ints.size(),Collections.reverseOrder());
        priorityQueue.addAll(ints);
        QueueDemo.pringQ(priorityQueue);

        String fact = "EDUCATION SHOULD ESCHEW OBFUSCATION";
        List<String> strings = Arrays.asList(fact.split(" "));
        PriorityQueue<String> stringPQ = new PriorityQueue<>(strings);
        QueueDemo.pringQ(stringPQ);
        stringPQ = new PriorityQueue<>(
                strings.size(),Collections.reverseOrder()
        );
        stringPQ.addAll(strings);
        QueueDemo.pringQ(stringPQ);

        Set<Character> charSet = new HashSet<>();
        for (char c : fact.toCharArray()){
            charSet.add(c);
        }
        PriorityQueue<Character> characterPQ = new PriorityQueue<>(charSet);
        QueueDemo.pringQ(characterPQ);
    }
}
