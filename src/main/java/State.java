public interface State {
    State change(Object... params);
}
