## Threads and Synchronization

This lab illustrates the problem of synchronization when many threads are operating on a shared object.  The general issue is called "thread safety", and it is a major cause of errors in computer software.

## Assignment

To the problems on the lab sheet and record your answers here.

1. Record average run times.
2. Write your explanation of the results.  Use good English and proper grammar.  Also use good Markdown formatting.

## ThreadCount run times

These are the average runtime using 3 or more runs of the application.
The Counter class is the object being shared by the threads.
The threads use the counter to add and subtract values.

| Counter class           | Limit              | Runtime (sec)   |
|:------------------------|:-------------------|-----------------|
| Unsynchronized counter  |   10000            | 0.001419        |
| Using ReentrantLock     |   10000            | 0.007763        |
| Syncronized method      |   10000            | 0.003810        |
| AtomicLong for total    |   10000            | 0.002132        |

## 1. Using unsynchronized counter object

1.1) It sometimes be zero, and total doesn't the same.

1.2) Limit = 1,000,000,000 => Average runtime = 0.848141

1.3) Because in CPU Memory has three things to do in this program. First, load that will load data from memory. Second, change that change data (add or subtract). Last, replace that return data after change it. When two thread in same time each thread will do 3 things above and sometimes it can replace data wrong. Ex. data = 5 in Add thread will load, change and replace(6) while Subtract thread will do same but return 4 that will replace 6 and make mistake.

## 2. Implications for Multi-threaded Applications

If you withdraw money in the same purse and same time. If purse balance is 1 baht and you withdraw 1 baht in 2 thread at the same time, you can receive 2 bahts because each thread get balance of purse is 1 baht that can withdraw.

## 3. Counter with ReentrantLock

3.1) Total always 0. Average runtime = 0.007763

3.2) Because Lock will do one thread until finish and run another thread next.

3.3) ReentrantLock gives a lock to the current working thread and blocks all other threads which are trying to take a lock on the shared resource. It should use when threads more than one thread use same resource.

3.4) To unlock the thread which running and make it can lock another.

## 4. Counter with synchronized method

4.1) Total always 0. Average runtime = 0.003810.

4.2) Because synchronized that write in method will make this method can't call in the same time that make you don't worry about replace mistake.

4.3) Synchronized will make this method can't call in the same time. It should use when threads more than one thread use same resource.

## 5. Counter with AtomicLong

5.1) Because AtomicLong is the safe thread for long.

5.2) Because AtomicLong is use in program that incremented sequence numbers and cannot be replace in Long.

## 6. Analysis of Results

6.1) AtomicLong is the fastest. ReentrantLock is the slowest.

6.2) Synchronized because it can use flexible and runtime is less than other solutions.

## 7. Using Many Threads (optional)

| Counter class           | Limit              | Runtime (sec)   |
|:------------------------|:-------------------|-----------------|
| Unsynchronized counter  |   10000            | 0.017370        |
| Using ReentrantLock     |   10000            | 0.025915        |
| Syncronized method      |   10000            | 0.018416        |
| AtomicLong for total    |   10000            | 0.009190        |

From table, AtomicLong is the fastest and ReentrantLock is the slowest.
