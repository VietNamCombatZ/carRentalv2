package Model;

import javax.swing.JFrame;
import java.util.Scanner;

public interface Operation {

	void operation(Database database, Scanner s, User user);

	public void operation(Database database, JFrame f, User user);

}
