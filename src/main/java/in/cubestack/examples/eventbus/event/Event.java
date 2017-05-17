package in.cubestack.examples.eventbus.event;

/**
 * Created by init5_0 on 5/18/2017.
 */
public abstract class Event<T> {

    protected String name;
    protected T payload;

    public Event(String name, T payload) {
        this.name = name;
        this.payload = payload;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getPayload() {
        return payload;
    }

    public void setPayload(T payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", payload=" + payload +
                '}';
    }
}
