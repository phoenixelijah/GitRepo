import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class HelloWorldSWT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display display = new Display();
		Shell shell = new Shell();
		shell.setText("Hello World. Go get your goals!");
		shell.open();
		while (!shell.isDisposed()){
			if (!display.readAndDispatch()) display.sleep();
		}
		display.dispose();
	}

}
