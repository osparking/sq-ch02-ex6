package ssh.ch02_ex6.main;

import static java.nio.charset.StandardCharsets.UTF_8;
import java.io.PrintStream;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ssh.ch02_ex6.config.ProjectConfig;
import ssh.ch02_ex6.entity.Parrot;

// @formatter:off
public class Main {
	public static void main(String[] args) {
		var ctxt = new AnnotationConfigApplicationContext(
				ProjectConfig.class);
		var par = (Parrot) ctxt.getBean(Parrot.class);
		PrintStream ps = new PrintStream(System.out, true, UTF_8);
		ps.println("parrot 이름: " + par.getName());
	}
}
// @formatter:on
