package com.sap.junit.timeout;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GlobalTimeoutTest {

    public static String log = "";
    private final CountDownLatch latch = new CountDownLatch(1);

    @Rule
    public Timeout globalTimeout = Timeout.seconds(3); // 10 seconds max per method tested
    
    @Ignore
    @Test
    public void _1_testSleepForTooLong() throws Exception {
        log += "ran sleep\n";
        TimeUnit.SECONDS.sleep(5); // sleep for 100 seconds
    }
    
    @Ignore
    @Test
    public void _2_testBlockForever() throws Exception {
        log += "ran block\n";
        latch.await(); // will block 
    }
    
    @Ignore
    @Test
    public void _3_testLoopsForever() throws Exception {
        log += "ran loop\n";
        while(true){}
    }
    
    @After
    public void after(){
    	System.out.println(log);
    }
}
