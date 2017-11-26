package judh.developer.ottostudy;

import com.squareup.otto.Bus;

/**
 * Created by judh on 2017. 11. 6..
 */

public final class BusProvider extends Bus{
    private static final Bus BUS = new Bus();

    public static Bus getInstance() {
        return BUS;
    }

    private BusProvider() {
    }
}
