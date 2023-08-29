package ssh.ch02_ex6.entity;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Parrot {
	private String name = "(무명)";
	
	@PostConstruct
	void changeName() {
		this.name = "구키";
	}
}
