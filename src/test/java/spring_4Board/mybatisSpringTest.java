package spring_4Board;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/applicationContext.xml")
class mybatisSpringTest {

	@Autowired
	SqlSessionTemplate sessionTemplate;
	
	@DisplayName("mybatis-spring이 정상 작동합니다.")
	@Test
	void mybatis() {
		assertNotNull(sessionTemplate);
	}

}
