package creatingADicomImage;

import com.pixelmed.dicom.AttributeList;
    import com.pixelmed.dicom.ImageToDicom;

    public class CreateADicomFile {

        public static void main(String[] args) {
            String scJpegFilePath = "/Users/jeremyfrankel/Projects/DICOM/creatingADicomImage/jpeg.jpg";
            String newDicomFile = "/Users/jeremyfrankel/Projects/DICOM/DICOM's/0004.DCM"; //see article footnote below
            try {
                //generate the DICOM file from the jpeg file and the other attributes supplied
                //note: The PixelMed toolkit encodes some attributes for you automatically as well
                //you may have to explicitly control in your situation
                //the API construct is a bit different in PixelMed for those you are used to invoking a 'command' method
                new ImageToDicom(scJpegFilePath, //path to existing JPEG image
                                newDicomFile, //output DICOM file with full path
                                "John Doe", //name of patient
                                "12121221", //patient id
                                "2323232322", //study id
                                "3232323232", //series number
                                "42423232234"); //instance number
                //now, dump the contents of the DICOM file to the console
                AttributeList list = new AttributeList();
                list.read(newDicomFile);
                System.out.println(list.toString());

            } catch (Exception e) {
                e.printStackTrace(); //in real life, do something about this exception
            }
        }

    }