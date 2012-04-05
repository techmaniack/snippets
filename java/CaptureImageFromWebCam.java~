//Title:Code Snippet to Capture Image from WebCam
//Link:http://stackoverflow.com/questions/115835/what-is-the-best-method-to-capture-images-from-a-live-video-device-for-use-by-a
//Requirements: OpenCV, javaCV
//Tip: export CLASSPATH=/path/to/javacv.jar:.
import com.googlecode.javacv.OpenCVFrameGrabber;
import com.googlecode.javacv.cpp.opencv_core.IplImage;
import static com.googlecode.javacv.cpp.opencv_highgui.*;

public class CaptureImageFromWebCam {
    private static void captureFrame() {
        final OpenCVFrameGrabber grabber = new OpenCVFrameGrabber(0);
        try {
            grabber.start();
            IplImage img = grabber.grab();
            if (img != null) {
                cvSaveImage("/tmp/capture.jpg", img);
                //replace "/tmp/capture.jpg" accordingly
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        captureFrame();
    }
}
