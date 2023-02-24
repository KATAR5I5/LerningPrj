package Patterns.Structural.Adapter;

public class AdapterJavaDatabase extends JavaApp implements Database{
    @Override
    public void create() {
        updateApp();
    }

    @Override
    public void read() {
        readApp();
    }

    @Override
    public void update() {
        updateApp();
    }

    @Override
    public void delete() {
        removeApp();
    }
}
