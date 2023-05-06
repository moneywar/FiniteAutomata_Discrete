public class state {
    private String name;
    private state go0;
    private state go1;

    public state(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public state getGo0() {
        return go0;
    }
    public void setGo0(state go0) {
        this.go0 = go0;
    }
    public state getGo1() {
        return go1;
    }
    public void setGo1(state go1) {
        this.go1 = go1;
    }
    public void setGo(state go0, state go1){
        this.go0 = go0;
        this.go1 = go1;
    }
}
