/*Name :AbdulKarim
Roll number:H-56
T.E.
Tutorial Number : 10 :Write a Java program to implement applet with event
						handling.
 */
import static com.googlecode.javacv.cpp.opencv_highgui.cvSaveImage;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import com.googlecode.javacv.OpenCVFrameGrabber;
import com.googlecode.javacv.cpp.opencv_core.IplImage;

@SuppressWarnings("serial")
public class myApplet extends Applet implements ActionListener {

	Button capture;
	Button display;

	public void init() {
		capture = new Button("Capture!");
		display = new Button("Display!");
		add(capture);
		add(display);
		capture.addActionListener(this);
		display.addActionListener(this);
	}

	public void actionPerformed(ActionEvent evt) {
		if (evt.getSource() == capture)
			captureFrame();
		else if (evt.getSource() == display) {
			displayImage();
		}
	}

	private void captureFrame() {
		// 0-default camera, 1 - next...so on
		final OpenCVFrameGrabber grabber = new OpenCVFrameGrabber(-1);
		try {
			grabber.start();
			IplImage img = grabber.grab();
			if (img != null) {
				cvSaveImage("./cap.jpg", img);
			}
			grabber.stop();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void displayImage() {

		try {
			Runtime rt = Runtime.getRuntime();
			@SuppressWarnings("unused")
			Process pr = rt.exec("eog ./cap.jpg");
		} catch (Exception ew) {
			ew.printStackTrace();
		}
	}
}