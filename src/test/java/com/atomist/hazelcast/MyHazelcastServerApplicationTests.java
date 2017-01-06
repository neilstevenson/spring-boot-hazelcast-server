package com.atomist.hazelcast;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hazelcast.core.Hazelcast;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {MyHazelcastServerApplication.class})
public class MyHazelcastServerApplicationTests {

	@Test
	public void count_hazelcast_servers_in_this_jvm() {
		assertThat(Hazelcast.getAllHazelcastInstances().size(), equalTo(1));
	}
	
}
