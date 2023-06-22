package structural.proxy;

public class ProxyReader extends ReaderImpl {
    @Override
    public String read(String str) {
        System.out.println("Before " + str);
        String read = super.read(str);
        System.out.println("After " + read);
        return read;
    }
}
