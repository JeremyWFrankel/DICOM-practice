package extractingDicomImageData;



import com.pixelmed.display.ConsumerFormatImageMaker;

    public class ExportMultiFrameDicomImageDataToOtherImageFormats {

        public static void main(String[] args) {

            String dicomFile = "/Users/jeremyfrankel/Projects/DICOM/DICOM's/ohohohtwo.DCM";
            String outputJpgFile = "/Users/jeremyfrankel/Projects/DICOM/non-Dicom-Images/multi-frame.jpg";

            try {
                //Will result in 16 jpeg files created as the input DICOM file has 16 frames
                ConsumerFormatImageMaker.convertFileToEightBitImage(dicomFile, outputJpgFile, "jpeg");
            } catch (Exception e) {
                e.printStackTrace(); //in real life, do something about this exception
            }
        }

    }