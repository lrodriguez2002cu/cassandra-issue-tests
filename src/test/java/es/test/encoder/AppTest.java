package es.test.encoder;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.apache.commons.io.IOUtils;
import org.codehaus.jackson.io.JsonStringEncoder;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testQuoteAsUTF8() throws Exception {

        String session7 = streamToString("session7.json");

        try {
            byte [] chars = JsonStringEncoder.getInstance().quoteAsUTF8(session7);
            System.out.println("session7: "+ chars);
        } catch (Exception e) {
            System.out.println("Failed trying session7 string");
            throw e;
        }
             assertTrue(true);

    }

    public void testQuoteAsString() throws Exception {

        String session7 = streamToString("session7.json");

        try {
            char [] chars = JsonStringEncoder.getInstance().quoteAsString(session7);
            System.out.println("session7: "+ chars);
        } catch (Exception e) {
            System.out.println("Failed trying session7 string");
            throw e;
        }

        assertTrue(true);

    }

    private String streamToString(String resource) throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(resource);
        String theString = IOUtils.toString(inputStream, Charset.defaultCharset());
        return theString;
    }

  /*  private static String usingBufferedReader(String filePath)
    {
        StringBuilder contentBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath)))
        {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null)
            {
                contentBuilder.append(sCurrentLine).append("\n");
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return contentBuilder.toString();
    }*/
}

