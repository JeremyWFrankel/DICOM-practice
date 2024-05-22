package extractingDicomImageData;

import com.pixelmed.display.ConsumerFormatImageMaker;

    public class ExportDicomImageDataToOtherImageFormats {

        public static void main(String[] args) {

            String dicomFile = "/Users/jeremyfrankel/Projects/DICOM/DICOM's/test.DCM";
            String outputJpgFile = "/Users/jeremyfrankel/Projects/DICOM/non-Dicom-Images/test.jpg";
            //String outputPngFile = "/Users/jeremyfrankel/Projects/DICOM/non-Dicom-Images/0002.png";
            //String outputTiffFile = "/Users/jeremyfrankel/Projects/DICOM/DICOM's/0002.tff";

            try {
                ConsumerFormatImageMaker.convertFileToEightBitImage(dicomFile, outputJpgFile, "jpeg");
                //ConsumerFormatImageMaker.convertFileToEightBitImage(dicomFile, outputPngFile, "png");
                //ConsumerFormatImageMaker.convertFileToEightBitImage(dicomFile, outputTiffFile, "tiff");
            } catch (Exception e) {
                e.printStackTrace(); //in real life, do something about this exception
            }
        }

    }
