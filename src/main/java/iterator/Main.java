package iterator;

public class Main {
    public static void main(String[] args) {

        BrowserHistory browserHistory = new BrowserHistory();
        browserHistory.push("a");
        browserHistory.push("b");
        browserHistory.push("c");


        Iterator iterator = browserHistory.createIterator();
        while (iterator.hasNext()) {
            String url = iterator.current();
            System.out.println(url);
            iterator.next();
        }
    }
}
