package MakingSenseOfADicomFile;

import com.pixelmed.dicom.AttributeList;

    public class DumpDicomFileContentsToConsole {

        public static void main(String[] args) {
            String dicomFile = "/Users/jeremyfrankel/Projects/DICOM/DICOM's/0002.DCM";
            try {
                AttributeList list = new AttributeList();
                list.read(dicomFile);
                System.out.println(list.toString());

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }