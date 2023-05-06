public class diagram {
    private state start;
    private state curState;
    private state finite;

    public diagram(){
        state s0 = new state("s0");
        state s1 = new state("s1");
        state s2 = new state("s2");

        s0.setGo(s1, s0);
        s1.setGo(s1, s2);
        s2.setGo(s1, s0);

        start = s0;
        finite = s2;
    }

    public boolean isFinite(String in){
        curState = start;
        while(in.length() != 0){
            char firstChar = in.charAt(0);
            if(firstChar == '0'){
                curState = curState.getGo0();
            }
            else if(firstChar == '1'){
                curState = curState.getGo1();
            }
            in = in.substring(1);
        }
        if(curState.equals(finite)) return true;
        else return false;
    }
}
