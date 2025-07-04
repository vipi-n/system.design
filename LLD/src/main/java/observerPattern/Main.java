package observerpattern;

import observerpattern.observable.YouTubeChannel;
import observerpattern.observer.Observer;
import observerpattern.observer.Subscriber;

public class Main {

    public static void main(String[] args) {

        /*
           Observer - 	Subscriber	Wants to be notified when a new video is uploaded
          Observable- (aka Subject)	YouTubeChannel	Publishes new videos and notifies all subscribed users
         */

        YouTubeChannel youTubeChannel = new YouTubeChannel();
        Observer s1 = new Subscriber("Alice");
        Observer s2 = new Subscriber("Bob");

        youTubeChannel.attach(s1);
        youTubeChannel.attach(s2);
        youTubeChannel.uploadVideo("Observer Pattern Explained");
        youTubeChannel.detach(s1);
        youTubeChannel.uploadVideo("-Observer Pattern Explained");

    }
}
