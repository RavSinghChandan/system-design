package state.state;
import state.context.Context;
public interface State {
    void handle(Context context);
}
