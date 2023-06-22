package generative.singleton;

import java.io.Serializable;

public enum EnumSingleton implements Serializable {
    INSTANCE;
    private int i;

    public int getI() {
        return i;
    }
}
