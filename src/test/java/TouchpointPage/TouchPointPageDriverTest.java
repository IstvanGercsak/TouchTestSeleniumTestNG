package TouchpointPage;

import BaseTestData.BaseData;
import org.testng.Assert;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class TouchPointPageDriverTest extends BaseData {

    public class ReadFile {

        String[] readLines(String filename) throws IOException {
            FileReader fileReader = new FileReader(filename);

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            List<String> lines = new ArrayList<String>();
            String line = null;

            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }

            bufferedReader.close();

            return lines.toArray(new String[lines.size()]);
        }

    }

    void assertTheFileWithList(String txt) {

        ReadFile rf = new ReadFile();
        String filename = txt;
        String[] textList = new String[200];
        int i=0;

        try {
            String[] lines = rf.readLines(filename);

            for (String line : lines) {
                String[] list = new String[i];
                //TODO: Pairing
                //System.out.println(line);
                //Assert.assertEquals(line,);
            }
        } catch (IOException e) {
            // Print out the exception that occurred
            System.out.println("Unable to create " + filename + ": " + e.getMessage());
        }
    }


}