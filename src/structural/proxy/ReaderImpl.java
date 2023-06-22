package structural.proxy;

import structural.proxy.Reader;

public class ReaderImpl implements Reader {
    @Override
    public String read(String str) {
        return str + " word";
    }
}
