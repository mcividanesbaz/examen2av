package statustwitter;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 * Clase para recobrar los twitts del morrazo
 *
 * @author damian
 */
public class StatusTwitter {

    /**
     * @param args the command line arguments
     * @throws twitter4j.TwitterException
     */
    public static void main(String[] args) throws TwitterException {

        Twitter mitwitter = new TwitterFactory().getInstance();

        Query query = new Query("#Cangas");

        QueryResult resultado = mitwitter.search(query);

        for (Status estado : resultado.getTweets()) {
            System.out.println("@" + estado.getUser().getScreenName() + ":" + estado.getText());
        }
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("sfykEWIIWMM60T0apJFNGmc9n")
                .setOAuthConsumerSecret("DnFd8UbiNXcxoHhei4kQ4wMsctTHjI8MkW0fqVjCdSfdWaSBqW")
                .setOAuthAccessToken("867802357-6hZ73Bu9QVD8ExLFmeJkarBsmOXXNgBMZXxp3sH1")
                .setOAuthAccessTokenSecret("R9rGWgmyoUW5vz0wHypXNlgZn7F7ArU7mGf3Ibies6h6d");
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitterMaster = tf.getInstance();

    }
}
