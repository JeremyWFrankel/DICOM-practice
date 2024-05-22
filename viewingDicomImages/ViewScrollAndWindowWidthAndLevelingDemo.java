package viewingDicomImages;

import java.awt.Color;
    import javax.swing.JFrame;
    import com.pixelmed.display.SourceImage;
    import com.pixelmed.display.SingleImagePanel;

    public class ViewScrollAndWindowWidthAndLevelingDemo {

        public static void main(String[] args) {
            String dicomInputFile = "/Users/jeremyfrankel/Projects/DICOM/DICOM's/ohohohtwo.DCM";
            try {
                JFrame frame = new JFrame();
                SourceImage sImg = new SourceImage(dicomInputFile);
                System.out.println("Number of frames: " + sImg.getNumberOfFrames());
                //ImagePanelDemo singleImagePanel = new OverriddenSingleImagePanelForDemo(sImg);
                SingleImagePanel singleImagePanel = new SingleImagePanel(sImg);
                frame.add(singleImagePanel);
                frame.setBackground(Color.BLACK);
                frame.setSize(sImg.getWidth(),sImg.getHeight());
                frame.setTitle("Demo for view, scroll and window width/level operations");
                frame.setVisible(true);

            } catch (Exception e) {
                e.printStackTrace(); //in real life, do something about this exception
            }
        }
    }