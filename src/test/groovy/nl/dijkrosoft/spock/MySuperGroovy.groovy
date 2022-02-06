package nl.dijkrosoft.spock

import nl.dijkrosoft.spock.shared.Proxy
import spock.lang.Shared
import spock.lang.Specification

class MySuperGroovy extends Specification {
    @Shared
    Proxy proxy = new Proxy();
}
