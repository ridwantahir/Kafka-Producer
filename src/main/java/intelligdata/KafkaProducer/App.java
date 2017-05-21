package intelligdata.KafkaProducer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	WKafkaProducer producer=new WKafkaProducer("localhost:9092", "webactivity");
    	producer.run();
    }
}
