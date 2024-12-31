package me.ibeyond.springboottest;

import me.ibeyond.springboottest.base.model.Emp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootTestApplicationTests {
	@Autowired
	private Emp emp;

	@Test
	public void contextLoads() {
		System.out.println(emp);
	}

}
