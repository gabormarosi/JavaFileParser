import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.Channel;

public class Parse {

    static String parserPath=System.getenv("PARSER_PATH");
    static String parserUser=System.getenv("PARSER_USERNAME");
    static String parserPassword=System.getenv("PARSER_PASSWORD");
    static String parserHostname=System.getenv("PARSER_HOSTNAME");
    static String parserPort=System.getenv("PARSER_PORT");
    static String parserQueue=System.getenv("PARSER_QUEUE_NAME");


    public static void main(String[] args) {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(parserPath));
            String line = reader.readLine();
            System.out.println("Header: "+line);
            line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                // read next line
                line = reader.readLine();

            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
