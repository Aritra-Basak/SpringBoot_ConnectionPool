package com.demo.ConnectionPool.scheduler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @author Aritra
 *
 */
public class ConcurrentApiCaller {

    private static final String API_URL = "http://localhost:8080/api/v1/users/getUsers";
    private static final int NUM_THREADS = 8;//Here each number of Thread = Each User
    private static final int NUM_ITERATIONS = 8000;

    public static void main(String[] args) {
        for (int i = 0; i < NUM_ITERATIONS; i++) {
        	//Creating NUM_THREADS number of Threads, which will run independently of each other and concurrently.
            for (int j = 0; j < NUM_THREADS; j++) {
            	//A Thread object is initialized and with the Lambda expression we represents the task that the created thread will execute
                Thread thread = new Thread(() -> {
                    RestTemplate restTemplate = new RestTemplate();
                    ResponseEntity<String> responseEntity = restTemplate.getForEntity(API_URL, String.class);
                    System.out.println("Thread " + Thread.currentThread().getId() + " received response: " + responseEntity.getBody());
                });
                //Starting each threads.
                thread.start();
                try {
                	//After starting each thread, the main thread waits for it to finish using thread.join()
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
/*
In the above code the lambda expression ( ) -> { ... } represents the run() method of the thread.abstract
So while we are not explicitly defining a run() method in a separate class that implements Runnable,
 we're still defining the behavior of the thread by providing code to be executed within the lambda expression passed to the Thread constructor.
*/